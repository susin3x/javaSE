/*
�����֮һ�����������
��+ ��- ��+ ��- ��* ��/ ȡģ% ǰ�Ӽ�i++ ��Ӽ�i-- ǰ����i-- �����-- ����+



*/

class  ArithmeticTest {
	public static void main(String[] args) {
		//��
		int num1 = 12;
		int num2 = 5;
		int result1 = num1 / num2;
		System.out.println(result1);//2

		int result2 = num1 / num2 * num2;
		System.out.println(result2);//10

		double result3 = num1 / num2;
		System.out.println(result3);//2.0

		double result4 = num1 / num2 +0.0;
		double result5 = num1 / (num2 + 0.0);
		double result6 = (double)num1 / num2;
		double result7 = num1 / (double)num2;
		double result8 = (double)(num1 / num2);
		System.out.println(result4);//2.0
		System.out.println(result5);//2.4
		System.out.println(result6);//2.4
		System.out.println(result7);//2.4
		System.out.println(result8);//2.0

		//ȡģ%
		//����ķ����뱻ģ���ķ�����ͬ
		//�����У�����ʹ��%���ж��ܷ񱻳��������
		int m1 = 12;
		int n1 = 5;
		System.out.println("m1 % n1 = " + m1 % n1);//2

		int m2 = -12;
		int n2 = 5;
		System.out.println("m2 % n2 = " + m2 % n2);//-2

		int m3 = 12;
		int n3 = -5;
		System.out.println("m3 % n3 = " + m3 % n3);//2

		int m4 = -12;
		int n4 = -5;
		System.out.println("m4 % n4 = " + m4 % n4);//-2

		
		//++i��������1��ֵ
		//i++���ȸ�ֵ������1
		int a1 = 10;
		int b1 = ++a1;
		System.out.println("a1 = " + a1 + ", b1 = " + b1);//a1 = 11, b1 = 11

		int a2 = 10;
		int b2 = a2++;
		System.out.println("a2 = " + a2 + ", b2 = " + b2);//a2 = 11, b2 = 10

		int a3 = 10;
		++a3;//a3++
		int b3 = a3;//11

		//ע���
		short s1 = 10;
		//s1 = s1 + 1;//����ʧ�ܣ�����Ĭ��int�ͣ���intת����short���ܻ�����ʧ
		//s1 = (short)(s1 + 1);//��ȷ
		s1++;//����1����ı䱾���������������
		System.out.println(s1);//11

		//���⣺
		byte bb1 = 127;
		bb1++;
		System.out.println("bb1 = " + bb1);//bb1 = -128

		
		//--i�����Լ�1��ֵ
		//i--���ȸ�ֵ���Լ�1
		int a4 = 10;
		int b4 = --a4;
		System.out.println("a4 = " + a4 + ", b4 = " + b4);//a4 = 9, b4 = 9



		int i1 = 10;
		int i2 = 20;
		int i = i1++;
		System.out.print("i="+i);//10
		System.out.println("i1="+i1);//11
		i = ++i1;
		System.out.print("i="+i);//12
		System.out.println("i1="+i1);//12
		i = i2--;
		System.out.print("i="+i);//20
		System.out.println("i2="+i2);//19
		i = --i2;
		System.out.print("i="+i);//18
		System.out.println("i2="+i2);//18
	}
}
