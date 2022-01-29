class VariableTest4 {
	public static void main(String[] args) {
		//1.编码情况1：
		long l1 = 123123;
		System.out.println(l1);

		//编译失败：过大的整数
		//long l2 = 1213719723879548123;
		long l2 = 1213719723879548123L;
		System.out.println(l2);

		//编译失败 从double转换到float可能会有损失
		//float f1 = 12.3;
		//System.out.println(f1);
		float f1 = (float)12.3;

		//2.编码情况2：
		//整型常量，默认类型为int型
		//浮点型常量，默认类型为double型
		byte b = 12;
		//byte b1 = b + 1;//编译失败
		//float f1 = b + 12.3;//编译失败
	}
}
