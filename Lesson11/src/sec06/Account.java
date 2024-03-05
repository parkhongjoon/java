package sec06;

public class Account {
	/*
	 * �������(Account) class�� ���(withdraw) �޼ҵ忡�� �ܰ�(balance) �ʵ��
	 * ��ݾ�(�Ű���)�� ���� �ܰ� �����ϸ� ������ �߻���Ű�� throws.
	 * ������� ���� �������� ����ó���� ��.
	 */
	
	//�ʵ�
	private long balance;
	
	//������
	public Account() {}
	
	//�޼ҵ�
	//�ʵ尪(�ܱ�)�� �������� �޼ҵ�
	public long getBalance() {
		return balance;
	}
	
	//������ �ϴ� �޼ҵ�
	public void deposit(int money) {
		balance += money;
	}
	
	//����� �ϴ� �޼ҵ� (�ܱ��� �����ϸ� ���ܸ� ������)
	public void withdraw(int money) throws XxxException{
		if(balance < money) {
			throw new XxxException("�ܾ��� �����մϴ�. : " + (money-balance) +"�� ���ڶ�");
		}
		balance -= money;
	}
}
