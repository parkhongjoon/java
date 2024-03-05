package Machine;

import java.util.Scanner;

public class MyAutoMachine {

	public static void main(String[] args) {

		AtMachine machine = new AtMachine();
		Scanner sc = new Scanner(System.in);
		int money, select;
		
		while(true) {
			System.out.println("�ݾ��� �־��ּ���. >> ");
			money = Integer.parseInt(sc.nextLine()); //�ݾ��� �Է� �޴´�.
			
			boolean ready = machine.inputMoney(money); // ���� ���Ǳ⿡ ����
			if(ready) { //�ݾ��� ����ϸ� �������� ���´�. �ƴϸ� ��� ������ ���� �ݾ��� �Է� �ϵ��� �Ѵ�.
				break;
			}
		}
		
		while(machine.isEnoughMoney()) {
			
			//������ ��ǰ�� ����� ���
			machine.show();
			
			System.out.println("������ ��ȣ�� ���� �ϼ��� >> ");
			select = Integer.parseInt(sc.nextLine());
			Product drink = machine.getProduct(select);
			if(drink == null) {
				System.out.println("��ǰ�� ���ų� �ݾ��� �����մϴ�.");
			}else {
				System.out.println(drink.getName() + "�� �ϳ� ���Խ��ϴ�.");
			}
			
		}
		
		int change = machine.getChange();
		System.out.println("�Ž��� �� " + change + "��");
	}

}
