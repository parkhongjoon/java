package sec06.exam04;

public class DriveEx {
	
	public static void main (String[] args) {
		//driver ��ü ����
		Driver driver = new Driver();
		
		//�Ű����� �̿��Ͽ� ���⼺ ����
		Bus bus = new Bus();
		driver.drive(bus);
		
		Texi taxi = new Texi();
		driver.drive(taxi);
	}
}
