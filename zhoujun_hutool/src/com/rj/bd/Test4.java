package com.rj.bd;

import cn.hutool.core.util.StrUtil;
/**
 * @desc 截取字符串
 * @author Lenovo
 * @time 21-2-14
 */
public class Test4{
    public static void testStrUtil02() {
	String testStr="my name is smartPig";
	String result01=StrUtil.sub(testStr, 0, 4);
	/*虽然是4-0，但是实际上还是算成0-4*/
	String result02=StrUtil.sub(testStr, 4, 0);
	String result03=StrUtil.sub(testStr, -1, 3);
	String result04=StrUtil.sub(testStr, -4, 3);
		
	System.out.println(result01);
	System.out.println(result02);
	System.out.println(result03);
	System.out.println(result04);
    }
 
    public static void main(String[] args) {
	Test4.testStrUtil02();
    }
}