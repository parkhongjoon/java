package Sec11;

public class Earth {

	//��� double Ÿ������ earth_radius �� �����ϰ� 6400�� ����
	//��� double Ÿ������ earth_surface_area �� �����ϰ� ������ �������� �����Ѵ�.
	//����Ŭ�������� ������ ������ 00km ������ ǥ���� 00 km^2 �� ����Ѵ�.
	
	//��� ������ ���ÿ� �ʱ�ȭ
	static final double Earth_radius = 6400;
	
	//��� ����
	static final double Earth_surface_area;
	
	//�������� �̿��Ͽ� �ʱ�ȭ
	static {
		Earth_surface_area = 4 * Math.PI * Earth_radius * Earth_radius;
	}
}