/*
基本数据类型之间的运算规则：
前提：这里讨论只是7种（byte,short,int,long,float,double,char）基本数据类型变量间的运算。不包含boolean类型的。
1.自动类型提升：
	当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型。
	byte 、char、short --> int --> long --> float --> double
	
	特别的：当byte、char、short三种类型的变量做运算时，结果为int型。

2.强制类型转换：见VariableTest3.java

说明：此时的容量大小指的是，表示数的范围的大和小。比如float容量要大于long的容量
*/
class VariableTest2 {
	public static void main(String[] args) {
		byte b1 = 2;
		int i1 = 128;
		//编译不通过
		//byte b2 = b1 + i1;
		int i2 = b1 + i1;
		long l1 = b1 + i1;
		System.out.println(i2);
		System.out.println(l1);

		float f = b1 + i1;
		System.out.println(f);

		short s1 = 123;
		double d1 = s1;//123.0


		char c1 = '中';
		int i3 = 10;
		int i4 = c1 + i3;
		System.out.println(i4);

		short s2 = 10;
		//编译不通过
		//char c2 = c1 + s2;
		//short s3 = c1 + s2;
		int i5 = c1 + s2;

		byte b2 =10;
		//编译不通过
		//char c3 = c1 + b2;
		//short s3 = b2 + s2;
		//short s4 = b1 + b2;
		int i6 = c1 + b2;

		
		
	}
}
