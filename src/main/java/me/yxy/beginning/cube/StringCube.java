package me.yxy.beginning.cube;

/**
 * String小工具
 * @author young.jason
 *
 */
public class StringCube extends ObjectCube {

	/**
	 * 判断字符串是否为空<br/>
	 * StringCube.isEmpty("") == true
	 * StringCube.isEmpty(" ") == false
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		return (str == null || "".equals(str));
	}

	/**
	 * 判断字符串的内容是否为空，会进行trim操作
	 * StringCube.isNoContent("") == true
	 * StringCube.isNoContent(" ") == true
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNoContent(String str){
		return (isEmpty(str) || "".equals(str.trim()));
	}
	
	
}
