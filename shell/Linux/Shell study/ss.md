拍拍主要改造两个方法 

1、directUpdateSkuPrice（更新后台价直接生效）

2、insertSkuPrice（新增后台价）

提高效率点

如果不用这种形式开发，需要促销开发人员排期和了解拍拍需求，并对原有逻辑修改。而用流程编排后代码可交与拍拍研发开发，并根据自己需求进行逻辑编排，对原有逻辑无影响。

原评估开发大概为 5人日 现用2人日。用流程编排后，由于身份不同编排不同，改动代码对原有逻辑无影响。代码之间隔离，只需测试拍拍逻辑，测试回归量小，预估也会减少测试同学的工作量。

方法1、directUpdateSkuPrice原有编排

![image-20190130163131059](/Users/zhaojingchun/Library/Application Support/typora-user-images/image-20190130163131059.png)

在原有流程基础上增加两个处理方法

![image-20190130163351831](/Users/zhaojingchun/Library/Application Support/typora-user-images/image-20190130163351831.png)

方法 2、insertSkuPrice原有逻辑

![image-20190130163510736](/Users/zhaojingchun/Library/Application Support/typora-user-images/image-20190130163510736.png)

在原有流程基础上增加两个处理方法

![image-20190130163620187](/Users/zhaojingchun/Library/Application Support/typora-user-images/image-20190130163620187.png)

