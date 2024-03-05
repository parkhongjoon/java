package Sec11;

public class Earth {

	//상수 double 타입으로 earth_radius 를 선언하고 6400을 대입
	//상수 double 타입으로 earth_surface_area 를 선언하고 지구의 원주율을 대입한다.
	//실행클래스에서 지구의 반지를 00km 지구의 표면적 00 km^2 를 출력한다.
	
	//상수 선원과 동시에 초기화
	static final double Earth_radius = 6400;
	
	//상수 선언
	static final double Earth_surface_area;
	
	//정적블럭을 이용하여 초기화
	static {
		Earth_surface_area = 4 * Math.PI * Earth_radius * Earth_radius;
	}
}