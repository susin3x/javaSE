class ReviewTest{
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = 97;//开发中非常少见
		int i1 = 10;
		System.out.println(c1+i1);//107
		System.out.println(c2);   //a
		
		char c3 = 65;
		char c4 = '5';
		int i2 = (int)c4;
		System.out.println(c3);   //A
		System.out.println(c4);   //5
		System.out.println(i2);   //53

	}
}
