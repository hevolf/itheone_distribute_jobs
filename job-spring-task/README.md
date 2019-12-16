# Spring Task
> Spring 从 3.0 开始增加了自己的任务调度器，
它是通过扩展 java.util.concurrent 包下面的类来实现的，它也使用 Cron 表达式。

1. 使用 spring task 非常简单，只需要给定时任务类添加@Component 注解，
给任务方法添加@Scheduled(cron = "0/5 * * * * ?")注 解，并让 Spring 扫描到该类即可。
2. @EnableScheduling