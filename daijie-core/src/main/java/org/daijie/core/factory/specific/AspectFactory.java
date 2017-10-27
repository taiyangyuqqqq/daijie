package org.daijie.core.factory.specific;

import org.aspectj.lang.JoinPoint;
import org.daijie.core.result.ApiResult;

/**
 * 
 * @author daijie
 * @date 2017年6月5日
 * 定义AOP工厂类
 * 
 */
public interface AspectFactory {

	/**
	 * 进入方法需要定义的表达式
	 */
	public void targets();
	
	/**
	 * 进入方法之前运行的方法
	 * @param jp
	 * @throws Exception
	 */
	public void before(JoinPoint jp) throws Exception;
	
	/**
	 * 进入方法之后运行的方法
	 * @param result
	 * @return
	 * @throws Exception
	 */
	public ApiResult after(Object result) throws Exception;
}
