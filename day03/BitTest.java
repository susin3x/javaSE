 /*
�����֮�壺λ��������˽⣩
���ۣ�
1.λ����������Ķ������͵�����
2.<<����һ����Χ�ڣ�ÿ������1λ���൱��*2
  >>����һ����Χ�ڣ�ÿ������1λ���൱��/2

���Ч�ļ���2*8�� 2 << 3�� 8 << 1
*/
class BitTest {
	public static void main(String[] args) {
		int i = 21;
		System.out.println("i << 2 : "+ (i<<2) );
		System.out.println("i << 27 : "+ (i<<27) );//����

		int m = 12;
		int n = 5;
		//int k = 6;
		System.out.println(" m & n :"+(m & n));//4
		System.out.println(" m | n :"+(m | n));//13
		System.out.println(" m ^ n :"+(m ^ n));//9
		//SYstem.out.println("~6 :" + (~ 6));

		//��ϰ����������������ֵ
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 = " + num1 + ",num2 = " + num2);
		
		//��ʽһ:�Ƽ��ķ�ʽ
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 = " + num1 + ",num2 = " + num2);

		//��ʽ����
		//�ô������ö�����ʱ����
		//������1.��Ӳ������ܳ����洢��Χ 2.�о����ԣ�ֻ����������ֵ����
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("num1 = " + num1 + ",num2 = " + num2);

		//��ʽ����ʹ��λ�����m = k ^ n = (m ^ n) ^ n
		//�о����ԣ�ֻ����������ֵ����
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
	}
}
