/*
�������һ����������ӡ��ʾ���ĸ�λ����ʮλ������λ����ֵ��
��ʽ���£�
����xxx��������£�
��λ����
ʮλ����
��λ����

���磺
����153��������£�
��λ����3
ʮλ����5
��λ����1

*/
class ArithmeticExer {
	public static void main(String[] args) {
		System.out.println("5+5="+5+5);//5+5=55

		int num = 153;
		int g = num % 10;
		int s = num % 100 /10;
		int b = num / 100;
		System.out.println("��λ����" + g);
		System.out.println("ʮλ����" + s);
		System.out.println("��λ����" + b);

	}
}
