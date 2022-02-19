/*
计算机中不同进制的使用说明
对于整数，有四种表示方式：
> 二进制(binary)：0,1 满2进1
> 十进制(decimal)：0-9 满10进1。
> 八进制(octal)：0-7 满8进1 以数字0开头表示。
> 十六进制(hex)：0-9及A-F 满16进1 以0x或0X开头表示。此处的A-F不区分大小写。如：0x21AF +1= 0X21B0


计算机底层都以补码的形式存储数据
负数[x]原转[x]补：从右往左找到第一个1，除符号位之外，这个1左边的所有位全部取反
[x]补转[-x]补：从右往左找到第一个1，这个1左边的所有位全部取反
[-127]补 = 1000 0001   [-127]补 - 1 = [-128]补 = 1000 0000


十进制转二进制（基数乘除法）
	整数部分：除基取余
	小数部分：乘基取整

*/


class BinaryTest{
	public static void main(String[] args){
		int num1 = 0b110;
		int num2 = 110;
		//int num3 = 0128;//错误: 过大的整数: 0128
		int num3 = 0127;
		int num4 = 0x110A;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4); 

	}
}