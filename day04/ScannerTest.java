/*
��δӼ��̻�ȡ��ͬ���͵ر�������Ҫʹ��Scanner��

����ʵ�ֲ��裺
1.������import java.util.Scanner
2.Scanner��ʵ������Scanner scan = new Scanner(System.in);
3.����Scanner�����ط���������ȡָ�����͵ı���

ע�⣺
��Ҫ������Ӧ�ķ�����������ָ�����͵�ֵ��������������������Ҫ��Ĳ�ƥ��ʱ���ᱨ�쳣InputMismatchException
���³�����ֹ��
*/
import java.util.Scanner;
class ScannerTest{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("���������������");
		String name = scan.next();
		System.out.println(name);

		System.out.println("������������䣺");
		int age = scan.nextInt();
		System.out.println(age);

		System.out.println("������������أ�");
		double weight = scan.nextDouble();
		System.out.println(weight);

		System.out.println("���Ƿ�����������?��true/false��");
		boolean isLove = scan.nextBoolean();
		System.out.println(isLove);
		//����char�͵Ļ�ȡ��Scannerû���ṩ��صķ�����ֻ�ܻ�ȡһ���ַ���
		System.out.println("����������Ա���/Ů��");
		String gender = scan.next();//��
		char genderChar = gender.charAt(0);//��ȡ����Ϊ0λ���ϵ��ַ�
		System.out.println(genderChar);

	}
}