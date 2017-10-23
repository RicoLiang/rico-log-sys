# 日志系统
[slf4j介绍以及实现原理窥探](http://www.cnblogs.com/hafiz/p/5486858.html)<br/>

## 日志的级别
[log4j2 使用详解](http://blog.csdn.net/lu8000/article/details/25754415)<br/>
`log4j日志级别：all < trace < debug < info < warn < error < fatal < off`<br/>
* 级别之间是包含的关系，意思是如果设置日志级别是trace，则大于等于这个级别的日志都会输出<br/>
* 日志级别：<br/>
>> trace： 追踪。<br/>
>> debug：调试。<br/>
>> info：输出有用的或者重要的信息，这个用的最多。<br/>
>> warn： 有些信息不是错误信息，但是也要给程序员的一些提示，类似于eclipse中代码的验证不是有error和warn（不算错误但是也请注意，比如以下depressed的方法）。<br/>
>> error： 错误信息。用的也比较多。<br/>
>> fatal： 级别比较高了。重大错误。<br/>
