package excel.annotation;

import java.lang.annotation.*;

/**
 * 
* 用于集合类与对象
* @author 神盾局
* @date 2016年8月5日 上午9:45:16
*
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ExcelElement {

	/**
	 * 
	* 默认属性
	* @return  String 返回类型  
	* @throws
	 */
	String value() default "";
}
