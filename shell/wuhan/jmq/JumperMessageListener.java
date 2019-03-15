package com.yihaodian.gos.jumper;

import org.apache.log4j.Logger;

import com.yihaodian.architecture.jumper.common.message.Message;
import com.yihaodian.architecture.jumper.consumer.BackoutMessageException;
import com.yihaodian.architecture.jumper.consumer.MessageListener;
import com.yihaodian.gos.interfaces.dict.ReturnCodeDict;
import com.yihaodian.gos.interfaces.service.timeTask.TimeTaskService;
import com.yihaodian.gos.interfaces.vo.JumpMQOrderVo;
import com.yihaodian.gos.interfaces.vo.update.iuput.BaseInput;
import com.yihaodian.gos.interfaces.vo.update.output.BaseOutput;

public class JumperMessageListener implements MessageListener {
	private final static Logger logger = Logger.getLogger(JumperMessageListener.class);
	private TimeTaskService timeTaskService;

	@Override
	public void onMessage(Message msg) throws BackoutMessageException {
		JumpMQOrderVo jumpMQOrderVo =  msg.transferContentToBean(JumpMQOrderVo.class);
		/** 多活 异步线接消息-订单同步so_local->so */
		BaseInput in = new BaseInput();
		in.setOrderId(jumpMQOrderVo.getId());
		BaseOutput out = timeTaskService.createOrderSync(in);
		if(!ReturnCodeDict.SUCCESS.equals(out.getReturnCode())){
			logger.error("订单同步异常"+jumpMQOrderVo.getId()+";"+out.getReturnInfo());
		}
	}

	public void setTimeTaskService(TimeTaskService timeTaskService) {
		this.timeTaskService = timeTaskService;
	}

}
