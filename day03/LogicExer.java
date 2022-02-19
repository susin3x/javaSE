/*
区别赋值==和比较=
*/
class LogicExer {
	public static void main(String[] args) {
		boolean x=true;
        boolean y=false;
        short z = 42;
        //if(y == true)
        if((z++ == 42) && (y = true))z++;//z=44
        if((x = false) || (++z == 45))z++;//z=46
        System.out.println("z="+z);
	}
}
