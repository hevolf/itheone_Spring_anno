package com.evolf.cap10_AOP.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @Author caohaifengx@163.com
 * @Description:
 * @Date 2019-01-21 23:13
 * * 日志切面类的方法需要动态感知到div()方法运行,
 *  通知方法:
 *     前置通知:logStart(); 在我们执行div()除法之前运行(@Before)
 *     后置通知:logEnd();在我们目标方法div运行结束之后 ,不管有没有异常(@After)
 *     返回通知:logReturn();在我们的目标方法div正常返回值后运行(@AfterReturning)
 *     异常通知:logException();在我们的目标方法div出现异常后运行(@AfterThrowing)
 *     环绕通知:动态代理, 需要手动执行joinPoint.procced()(其实就是执行我们的目标方法div,), 执行之前div()相当于前置通知, 执行之后就相当于我们后置通知(@Around)

 * //日志切面类
 */
@Aspect
public class LogAspects {
    @Pointcut("execution(public int com.evolf.cap10_AOP.aop.Calculator.*(..))")
    public void pointCut(){};

    //@before代表在目标方法执行前切入, 并指定在哪个方法前切入
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+"除法运行....参数列表是:{"+ Arrays.asList(joinPoint.getArgs())+"}");
    }
    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+"除法结束......");

    }
    @AfterReturning(value="pointCut()",returning="result")
    public void logReturn(Object result){
        System.out.println("除法正常返回......运行结果是:{"+result+"}");
    }
    @AfterThrowing(value="pointCut()",throwing="exception")
    public void logException(Exception exception){
        System.out.println("运行异常......异常信息是:{"+exception+"}");
    }

	/*@Around("pointCut()")
	public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("@Arount:执行目标方法之前...");
		Object obj = proceedingJoinPoint.proceed();//相当于开始调div地
		System.out.println("@Arount:执行目标方法之后...");
		return obj;
	}*/
}
