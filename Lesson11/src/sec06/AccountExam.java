package sec06;

public class AccountExam {

	public static void main(String[] args) {

		Account acc = new Account();
		
		//�����ϱ�
		acc.deposit(10000000);
		System.out.println("���ݾ� : " + acc.getBalance() + "��");
	
		
		//����ϱ�
		try {
			acc.withdraw(11000000);
		} catch (XxxException e) {
			e.printStackTrace();
		}
	}

}
