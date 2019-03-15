测试编排

```sql
CREATE TABLE `jtfm_test_orchestration` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '编排d',
  `app_id` int(11) DEFAULT '0' COMMENT '应用id',
  `name` varchar(128) DEFAULT NULL COMMENT '编排名',
  `method_id` int(11) DEFAULT NULL COMMENT '服务方法id',
  `method_type` int(11) DEFAULT '1' COMMENT '方法类型标识，1：接口方法，2：能力方法',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_at` datetime DEFAULT NULL COMMENT '修改时间',
  `create_by` varchar(100) DEFAULT NULL COMMENT '创建人',
  `modify_by` varchar(100) DEFAULT NULL COMMENT '修改人',
  `yn` tinyint(4) DEFAULT '1' COMMENT '是否有效',
  `serve_desc` varchar(128) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='测试编排';
```

测试编排节点表

```sql
CREATE TABLE `jtfm_test_orchestration_node` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `orchestration_id` int(11) DEFAULT NULL COMMENT '编排id',
  `parent_id` int(11) DEFAULT NULL COMMENT '父节点id parentId 为零 为第一层节点',
  `node_type` varchar(128) DEFAULT '' COMMENT '节点类型',
  `key` varchar(128) DEFAULT '' COMMENT '关键key',
  `node_name` varchar(256) DEFAULT '' COMMENT '节点名',
  `expression` varchar(256) DEFAULT NULL COMMENT '表达式',
  `yn` tinyint(4) DEFAULT '1' COMMENT '是否有效 1-有效 0 无效',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_at` datetime DEFAULT NULL COMMENT '修改时间',
  `create_by` varchar(100) DEFAULT NULL COMMENT '创建人',
  `modify_by` varchar(100) DEFAULT NULL COMMENT '修改人',
  `exception_type` varchar(1024) DEFAULT NULL COMMENT '异常类型',
  `remark` varchar(512) DEFAULT NULL COMMENT '备注信息',
  `resource_detail_id` int(11) DEFAULT NULL COMMENT 'javabean的method',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='测试编排节点表';
```

测试用例表

```sql
CREATE TABLE `jtfm_test_case` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `orchestration_id` int(11) DEFAULT NULL COMMENT '编排id',
  `name` varchar(128) DEFAULT NULL COMMENT '用例名',
  `yn` tinyint(4) DEFAULT '1' COMMENT '是否有效',
  `create_by` varchar(100) DEFAULT NULL COMMENT '创建人',
  `modify_by` varchar(100) DEFAULT NULL COMMENT '修改人',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_at` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='测试用例表';
```

用例节点参数信息表

```sql
CREATE TABLE `jtfm_test_case_param_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `resource_detail_info_id` int(11) DEFAULT NULL COMMENT '参数id',
  `resource_detail_id` int(11) NOT NULL COMMENT '服务方法id',
  `node_id` int(11) NOT NULL COMMENT 'node id',
  `orchestration_id` int(11) NOT NULL COMMENT '服务id',
  `test_case_id` int(11) NOT NULL COMMENT '用例id',
  `bind_Key` varchar(1024) NOT NULL DEFAULT '' COMMENT 'key名称',
  `yn` tinyint(11) DEFAULT '1' COMMENT '是否有效',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_at` datetime DEFAULT NULL COMMENT '修改时间',
  `create_by` varchar(100) DEFAULT NULL COMMENT '创建人',
  `modify_by` varchar(100) DEFAULT NULL COMMENT '修改人',
  `param_bind_type` int(11) DEFAULT '1' COMMENT '1 ：变量key,  2 常量, 3 json',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='用例节点参数信息表';
```

批量执行批次表

```sql
CREATE TABLE `jtfm_test_batch_info` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '批次id',
  `app_id` int(11) unsigned NOT NULL COMMENT '应用id',
  `name` varchar(128) DEFAULT NULL COMMENT '批次名',
  `yn` tinyint(4) DEFAULT '1' COMMENT '是否有效',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_at` datetime DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(100) DEFAULT '' COMMENT '创建人',
  `modify_by` varchar(100) DEFAULT '' COMMENT '修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='测试批次表';
```

测试用例批次关联表

```sql
CREATE TABLE `jtfm_test_case_batch_relation` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `test_case_id` int(11) unsigned NOT NULL COMMENT '用例id',
  `test_batch_id` int(11) unsigned NOT NULL COMMENT '批次id',
  `yn` tinyint(4) DEFAULT '1' COMMENT '是否有效',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_at` datetime DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(100) DEFAULT '' COMMENT '创建人',
  `modify_by` varchar(100) DEFAULT '' COMMENT '修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='测试用例批次关联表';
```

测试用例批次版本表

```sql
CREATE TABLE `jtfm_test_batch_version` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '版本id',
  `batch_id` int(11) unsigned NOT NULL COMMENT '批次id',
  `name` varchar(128) DEFAULT NULL COMMENT '批次名',
  `yn` tinyint(4) DEFAULT '1' COMMENT '是否有效',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_at` datetime DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(100) DEFAULT '' COMMENT '创建人',
  `modify_by` varchar(100) DEFAULT '' COMMENT '修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='测试批次版本表';
```

用例执行结果表

```sql
CREATE TABLE `jtfm_test_result_info` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `test_case_id` int(11) DEFAULT NULL COMMENT '用例id',
  `batch_version_id` int(11) DEFAULT NULL COMMENT '批次版本id',
  `result_info` varchar(1000) DEFAULT '' COMMENT '结果',
  `result_flag` tinyint(4) DEFAULT '1' COMMENT '1-成功 2-失败',
  `yn` tinyint(4) DEFAULT '1' COMMENT '是否有效',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_at` datetime DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(100) DEFAULT '' COMMENT '创建人',
  `modify_by` varchar(100) DEFAULT '' COMMENT '修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='用例执行结果表';
```



###  测试接口

1. 创建测试批次

​       http://localhost:8080/test/test/createTestBatch?name=firstTestBatch&appId=88

2. 添加测试用例到批次内

   http://localhost:8080/test/test/addTestCase2Batch?testBatchId=1&testCaseIdStr=1,2,3

3. 删除批次下的测试用例

   http://localhost:8080/test/test/addTestCase2Batch?testBatchId=1&testCaseIdStr=1,2,3

4. 修改批次信息

   http://localhost:8080/test/test/updataTestBatchName?name=zzz&id=1

5. 自动化测试执行

   http://localhost:8080/jtfm_example_war_exploded/jtfmAutoTest

   exeXml ： <?xml version="1.0" encoding="UTF-8" standalone="yes"?>         <route xmlns="http://camel.apache.org/schema/spring" customId="true" id="start0">        <from uri="direct:start"/>        <bean ref="introduceService" method="printStudentInfo(${property.st})"/>        </route>

   paramList：[         {             "bindValue": "{\"name\":\"zjc\",\"age\":28}",              "bindKey": "st",              "type": "com.jd.jtfmexampel.servlet.Student"         }     

6. 

7. 

8. 

   

   

   



