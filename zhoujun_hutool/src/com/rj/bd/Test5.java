package com.rj.bd;

import cn.hutool.core.util.StrUtil;
/**
 * @desc  占位符
 * @author Lenovo
 * @time 21-2-14
 */
public class Test5{
    public static void testStrUtil04() {
	String testStr="{} name is smart{}";
	String result=StrUtil.format(testStr, "my","Pig");
        //my对应第一个{}，Pig对应第二个{}
	System.out.println(result);
    }
    public static void main(String[] args) {
	Test5.testStrUtil04();

    }
}