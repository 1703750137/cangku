package com.rj.bd;

import cn.hutool.core.util.StrUtil;
/**
 * @dese  取出前后缀
 * @author Lenovo
 * @time 21-2-14
 */
public class Test6{
    public static void testStrUtil06() {
	String path1="smart.png";
	String path2="smart.PNg";
	String path3="rj.smart";
	// 去后缀
	System.out.println(StrUtil.removeSuffix(path1, ".png"));
	// 去后缀，并忽略大小写
    System.out.println(StrUtil.removeSuffixIgnoreCase(path2,".png"));
    // 去前缀
    System.out.println(StrUtil.removePrefix(path3, "rj."));
    }
 
    public static void main(String[] args) {
	Test6.testStrUtil06();
    }
}