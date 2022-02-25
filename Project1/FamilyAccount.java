class FamilyAccount {
	public static void main(String[] args) {
		boolean isFlag = true;
		int balance = 10000;
		String detail = "";
		while(isFlag){
		    System.out.println("\n-----------------家庭收支记账软件-----------------\n");
		    System.out.println("                   1 收支明细");
		    System.out.println("                   2 登记收入");
		    System.out.println("                   3 登记支出");
		    System.out.println("                   4 退    出\n");
		    System.out.print("                   请选择（1-4）：");
		    char selection = Utility.readMenuSelection();
			System.out.println();
		    switch(selection){
		    case '1':
		    	System.out.println("-----------------当前收支明细记录-----------------");
		    	System.out.println("收支    账户余额        收支金额        说    明");
		    	System.out.print(detail);
				System.out.println("\n--------------------------------------------------");
		    	break;
		    case '2':
		    	System.out.print("本次收入金额：");
				int addMoney = Utility.readNumber();
				System.out.print("本次收入说明：");
				String addInfo = Utility.readString();
				balance += addMoney;
				detail += "收入\t" + balance + "\t\t" + addMoney + "\t\t" + addInfo + "\n";
				System.out.println("---------------------登记完成---------------------");
		    	break;
		    case '3':
		    	System.out.print("本次支出金额：");
				int subMoney = Utility.readNumber();
				System.out.print("本次支出说明：");
				String subInfo = Utility.readString();
				if(subMoney > balance){
					System.out.println("支出超额，支付失败");
				}else{
					balance -= subMoney;
					detail += "支出\t" + balance + "\t\t" + subMoney + "\t\t" + subInfo + "\n";
					System.out.println("---------------------登记完成---------------------");
				}
		    	break;
		    case '4':
		    	System.out.print("确认是否退出(Y/N)：");
				char isExit = Utility.readConfirmSelection();
				if(isExit == 'Y'){
					isFlag = false;
				}	
		    }
		}
	}
}
