/*
随意给出一个整数，打印显示它的个位数，十位数，百位数的值。
格式如下：
数字xxx的情况如下：
个位数：
十位数：
百位数：

例如：
数字153的情况如下：
个位数：3
十位数：5
百位数：1

*/
class ArithmeticExer {
	public static void main(String[] args) {
		System.out.println("5+5="+5+5);//5+5=55

		int num = 153;
		int g = num % 10;
		int s = num % 100 /10;
		int b = num / 100;
		System.out.println("个位数：" + g);
		System.out.println("十位数：" + s);
		System.out.println("百位数：" + b);

	}
}
