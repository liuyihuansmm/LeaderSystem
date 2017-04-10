package com.scyy.LeaderSystem.util;

import java.text.NumberFormat;

/**
 * 数字格式处理,为0或null一律返回""字符串
 * 整数格式123456全部3位分开123,456
 * 小数格式一律转成百分号
 * @author LYH
 *
 */
public class NumFormat {
	
	public static Object format(Object obj){
		
		NumberFormat fmt = NumberFormat.getInstance();
		
		if(obj==null||obj==""){
			return "";
		}
		if(obj instanceof Integer){
			if((Integer)obj == 0)
				return "";
			return fmt.format(obj);
		}
		if(obj instanceof Double){
			if((Double)obj == 0.0)
				return "";
			return obj;  //TODO 转成百分号，展示未写
		}
		return obj;
	}
	
}
