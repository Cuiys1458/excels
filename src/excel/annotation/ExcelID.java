package excel.annotation;

import java.lang.annotation.*;


/**
 * 
* 用于确定数据的唯一性
* @author 神盾局
* @date 2016年8月6日 上午11:27:23
*
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ExcelID {

	/**
	 * 
	* 默认属性
	* @return  String 返回类型  
	* @throws
	 */
	String value() default "";
}
