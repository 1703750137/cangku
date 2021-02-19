package com.rj.bd;

import cn.hutool.core.lang.Editor;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.StrUtil;
/**
 * @desc 从多个字符串中判断是否有空
 * @author Lenovo
 * @time  21-2-14
 */

public class Test3{
    public static void testStrUtil01() {
	StrUtil strUtil=new StrUtil();
	System.out.println("hasEmpty判断多个字符串中是否有null或者\"\":");
	System.out.println(strUtil.hasEmpty("smart","pig",""));
	System.out.println("hasBlank判断多个字符串是否有null或者\"\"或者不可见字符：");
	System.out.println(strUtil.hasBlank("smart","pig","  "));
	System.out.println(strUtil.isEmpty(" "));
	System.out.println(strUtil.isBlank(" "));
    }
    
    public static void main(String[] args) {
	Test3.testStrUtil01();
    }
 
}