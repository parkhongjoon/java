package sec08;

public class ArrMethod {
	//�ʵ����
	//������ �⺻
	
	//�޼ҵ�
	int sum(int[] arrs){
		int sum = 0;
		
		for(int i = 0; i < arrs.length; i++) {
			sum += arrs[i];
		}
		
		return sum;
	}
	
	//�������� �Ű������� �̿��ϴ� �޼ҵ�
	//������ �迭�� ����
	int sum2(int ... arrs) {
		int sum = 0;
		
		for(int i = 0; i < arrs.length; i++) {
			sum += arrs[i];
		}
		
		return sum;
	}
}
