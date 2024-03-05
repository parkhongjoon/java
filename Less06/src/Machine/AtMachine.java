package Machine;

public class AtMachine {
	private Product[] tray1 = new Product[5];
	private Product[] tray2 = new Product[5];
	private Product[] tray3 = new Product[5];
	private Product[] tray4 = new Product[5];
	
	private int money; // ���Ǳ⿡ ���� ��
	
	//���� 5���� �ִ� ��ǰ���� �迭�� ���� (2���� �迭)
	private Product[][] arr = {tray1, tray2, tray3, tray4}; 
	
	//�����ڿ��� ��ǰ�� ���� - ��ǰ�� ���Ǳ� �ȿ� ������
	public AtMachine() {
		for(int i = 0; i < tray1.length; i++) {
			tray1[i] = new Product("�ݶ�" , 800);
		}
		for(int i = 0; i < tray2.length; i++) {
			tray2[i] = new Product("���̴�" , 700);
		}
		for(int i = 0; i < tray3.length; i++) {
			tray3[i] = new Product("��Ŀ��" , 900);
		}
		for(int i = 0; i < tray4.length; i++) {
			tray4[i] = new Product("�̿���ȭ�̹�" , 500);
		}
		
	}
	//�ּ� ������ ���ϴ� �Լ� (���Ǳ⸸ �Ǵ��ϸ� �ǹǷ� private)
	private int getMinPrice() {
		int minPrice = 999999;
		for(int i = 0; i < arr.length; i++) { //tray1 ~ tray4 ���� 4�� �ݺ�
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j] != null && arr[i][j].getPrice() <= minPrice) {
					minPrice = arr[i][j].getPrice();
				}
			}
		}
		return minPrice;
	}
	
	//���� �Է¹޴� �Լ� (������� �Ǵ�)
	public boolean inputMoney(int money) {
		this.money += money;
		int minPrice = getMinPrice();
		return this.money >= minPrice;
	}
	
	//���� ��ǰ�� ������ �����ִ� �Լ� - �� �������� ���Ǳ⸸ �˸� �Ǵ� private
	private int countOfTray(Product[] tray) {
		int count = 0;
		for(int i = 0; i < tray.length; i++) {
			if(tray[i] != null) {
				count++;
			}
		}
		return count;
	}
	
	//��ǰ����, ���� ����ϴ� �Լ�
	void show() {
		System.out.println();
		System.out.printf("%s (%d��)\n", tray1[0].toString(), countOfTray(tray1));
		System.out.printf("%s (%d��)\n", tray2[0].toString(), countOfTray(tray2));
		System.out.printf("%s (%d��)\n", tray3[0].toString(), countOfTray(tray3));
		System.out.printf("%s (%d��)\n", tray4[0].toString(), countOfTray(tray4));

	}
	
	//�Ž����� ��ȯ �ϴ� �Լ�
	public int getChange() {
		int change = this.money;
		this.money = 0;
		return change;
	}
	
	//�ݾ��� ������� �Ǻ��ϴ� �Լ�
	public boolean isEnoughMoney() {
		return getMinPrice() <= money;
	}
	
	//��ǰ�� ��ȯ�ϴ� �Լ�
	public Product getProduct(int select) {
		select -= 1;
		Product product = null;
		for(int i = arr[select].length -1; i != 0; i--) {
			//������ �־�� �Ǵ�.
			//���� �������� �ʾƾ��Ѵ�
			boolean flag1 = arr[select][i] != null;
			boolean flag2 = flag1 && arr[select][i].getPrice() <= money;
			if(flag2) {
				product = arr[select][i]; //������ ���
				arr[select][i] = null; //���� ��ǰ�� �ִ� �ڸ��� ��ĭ���� �����.
				money -= product.getPrice(); //���� ������ ��ǰ �ݾ׸�ŭ �����Ѵ�.
				break;
			}
		}
		return product;
	}
}
