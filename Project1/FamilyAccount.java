class FamilyAccount {
	public static void main(String[] args) {
		boolean isFlag = true;
		int balance = 10000;
		String detail = "";
		while(isFlag){
		    System.out.println("\n-----------------��ͥ��֧�������-----------------\n");
		    System.out.println("                   1 ��֧��ϸ");
		    System.out.println("                   2 �Ǽ�����");
		    System.out.println("                   3 �Ǽ�֧��");
		    System.out.println("                   4 ��    ��\n");
		    System.out.print("                   ��ѡ��1-4����");
		    char selection = Utility.readMenuSelection();
			System.out.println();
		    switch(selection){
		    case '1':
		    	System.out.println("-----------------��ǰ��֧��ϸ��¼-----------------");
		    	System.out.println("��֧    �˻����        ��֧���        ˵    ��");
		    	System.out.print(detail);
				System.out.println("\n--------------------------------------------------");
		    	break;
		    case '2':
		    	System.out.print("���������");
				int addMoney = Utility.readNumber();
				System.out.print("��������˵����");
				String addInfo = Utility.readString();
				balance += addMoney;
				detail += "����\t" + balance + "\t\t" + addMoney + "\t\t" + addInfo + "\n";
				System.out.println("---------------------�Ǽ����---------------------");
		    	break;
		    case '3':
		    	System.out.print("����֧����");
				int subMoney = Utility.readNumber();
				System.out.print("����֧��˵����");
				String subInfo = Utility.readString();
				if(subMoney > balance){
					System.out.println("֧�����֧��ʧ��");
				}else{
					balance -= subMoney;
					detail += "֧��\t" + balance + "\t\t" + subMoney + "\t\t" + subInfo + "\n";
					System.out.println("---------------------�Ǽ����---------------------");
				}
		    	break;
		    case '4':
		    	System.out.print("ȷ���Ƿ��˳�(Y/N)��");
				char isExit = Utility.readConfirmSelection();
				if(isExit == 'Y'){
					isFlag = false;
				}	
		    }
		}
	}
}
