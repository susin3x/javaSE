/*
��֧�ṹ��if-else�������жϽṹ��

һ�����ֽṹ

��һ�֣�
if(�������ʽ){
	ִ�д����1;
}

�ڶ��֣���ѡһ
if(�������ʽ1){
	ִ�д����1;
}else{
	ִ�д����2;
}

������
if(�������ʽ1){
	ִ�д����1;
}else if (�������ʽ2){
	ִ�д����2;
}
����
else{
	ִ�д����n;
}
*/
class IfTest 
{
	public static void main(String[] args) 
	{
		//����1
		int heartBeats = 79;
		if(heartBeats < 60 || heartBeats > 100){
			System.out.println("��Ҫ����һ�����");
		}
		System.out.println("������");

		//����2
		int age =23;
		if (age < 18){
			System.out.println("�㻹���Կ�����Ƭ");
		}else{
			System.out.println("����Կ����˵�Ӱ��");
		}

		//����3
		if (age < 0){
			System.out.println("����������ݷǷ�");
		}else if(age < 18){
			System.out.println("������ʱ��");
		}else if(age < 35){
			System.out.println("��׳��ʱ��");
		}else if(age < 60){
			System.out.println("����ʱ��");
		}else if(age < 120){
			System.out.println("����ʱ��");
		}else{
			System.out.println("��Ҫ���ɰ�~~~");
		}


	}
}
