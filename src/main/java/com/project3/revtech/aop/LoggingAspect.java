package com.project3.revtech.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component //this is a Bean or object
public class LoggingAspect {
    private static final  Logger Logger = LogManager.getLogger(LoggingAspect.class);

    /*
     references for Aspect Oriented  Programming
      https://www.baeldung.com/spring-aop
      https://www.baeldung.com/spring-aop-vs-aspectj
      https://www.techgeeknext.com/spring-boot/spring-boot-logging-aop-example

    JoinPoints :  is a point during the execution of a program,
    such as the execution of a method or the handling of an exception.

    Aspect : is the class that contains the pointcut expressions to match the joinPoint methods.
    Advice  :  is an action taken by an aspect at a particular JoinPoint,
    different types of advice include "around," "before," and "after.".
    @Around :  other advices that can be used is @Before, @After, @AfterThrowing, @AfterReturning.
    Example - A method to be executed Around all methods in this package.
    Pointcut : A Pointcut is a predicate(condition) that helps match Advice to be applied
    by an Aspect at a particular JoinPoint.

    We often associate the Advice with a Pointcut expression,
    & it runs at any JoinPoint matched by the Pointcut.
    After the advice we specify the Pointcut expression  or predicate to match the joinPoints
     */

    /* Here We are Specifying  the Aspect "Around" must be applied to  all pointCut expression
     in this package & all its sub packages.Also  the Around advice A.O.P to be
      executed Around (before & after) all methods that run in this package.
      FYI: We can also use  @Around,  @Before, @After, @AfterThrowing, @AfterReturning.
    */
    @Around("execution(* com.expenseapp.expenseapp..*(..)))")
    public Object logMethodExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        //le's get the method Signature
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

        //Create a stopWatch object
        final StopWatch stopWatch = new StopWatch();

        //Let's calculate the method Execution time for each method execution
        stopWatch.start();
        Object result = proceedingJoinPoint.proceed();
        stopWatch.stop();

        //Log the info how long each method takes to run to the consul output
        Logger.info("RevTech - Spring Boot Logging A.O.P - Execution time :" +
                //For Displaying Class Name
                methodSignature.getDeclaringType().getSimpleName() +
                      //For Displaying The Method name
                "." + methodSignature.getName() + " " +
                //The stopWatch below is option
                ":: " + stopWatch.getTotalTimeMillis() + " ms");

        return result;

    }
}
