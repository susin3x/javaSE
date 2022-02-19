 /*
运算符之五：位运算符（了解）
结论：
1.位运算符操作的都是整型的数据
2.<<：在一定范围内，每向左移1位，相当于*2
  >>：在一定范围内，每向右移1位，相当于/2

最高效的计算2*8？ 2 << 3或 8 << 1
*/
class BitTest {
	public static void main(String[] args) {
		int i = 21;
		System.out.println("i << 2 : "+ (i<<2) );
		System.out.println("i << 27 : "+ (i<<27) );//负数

		int m = 12;
		int n = 5;
		//int k = 6;
		System.out.println(" m & n :"+(m & n));//4
		System.out.println(" m | n :"+(m | n));//13
		System.out.println(" m ^ n :"+(m ^ n));//9
		//SYstem.out.println("~6 :" + (~ 6));

		//练习：交换两个变量的值
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 = " + num1 + ",num2 = " + num2);
		
		//方式一:推荐的方式
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 = " + num1 + ",num2 = " + num2);

		//方式二：
		//好处：不用定义临时变量
		//坏处：1.相加操作可能超出存储范围 2.有局限性：只能适用于数值类型
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("num1 = " + num1 + ",num2 = " + num2);

		//方式三：使用位运算符m = k ^ n = (m ^ n) ^ n
		//有局限性：只能适用于数值类型
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
	}
}
