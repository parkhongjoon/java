package sec04;

public class GarbageExam {

	public static void main(String[] args) {

		
		String hobby = "����"; // �������� "����"�̶�� ��ü�� �����ǰ� �ּҰ� hobby�� �Ҵ�
		hobby = null; //�����̶�� String ��ü�� Garbage Collector ������� ����
		
		String bestCar = "����Ƽ��";
		String worstCar = bestCar; // bestCAr�� ����� ����Ƽ�� ��ü ������ worstCar�� ����
		bestCar = null; // worstCar�� �����־ "����Ƽ��" ���
		
		System.out.println(worstCar);
	}

}
