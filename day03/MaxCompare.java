class MaxCompare {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int max = (a > b)?  a:b;
		max = (max > c) ? max:c;
		System.out.println("max = " + max);

		double d = 12.4;
		double e = 23.7;
		if(d > 10.0 && b < 20.0){
			System.out.println(d+e);
		}else{
			System.out.println(d*e);
		}

		

	}
}
