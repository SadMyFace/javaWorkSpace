package day09;

public class ClassEx01 {

	public static void main(String[] args) {
		Point p = new Point();
		p.print();
		p.setX(3);
		p.setY(10);
		p.print();
		
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		p.setX(13);
		p.setY(20);
		
		p.print();
		System.out.println("----------------------");
		
		Point p1 = new Point();
		p1.setX(100);
		p1.setY(200);
		p1.print();
		System.out.println("----------------------");
		
		Point1 p2 = new Point1();
		p2.setX(101);
		p2.setY(202);
		p2.setZ(303);
		p2.print();
		
		
	}

}

class Point{
	//멤버변수 자리
	//멤버변수는 일반적으로 private 사용
	private int x;
	private int y;
	//같은 클래스의 멤버변수는 모든 메서드에서 공유된다.
	public void print() {
		System.out.println("(" + x + "," + y + ")");
	}
	//getter(멤버변수의 값을 가져오는 역할의 메서드)
	//setter(멤버변수의 값을 변경하는 역할의 메서드)
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public void setX(int x) { //매개변수 x와 멤버변수 x는 다름
		//this는 내 클래스의 멤버변수를 지칭하는 키워드
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
}


//Point1 클래스 생성
//(0, 0, 0)
//x, y, z 멤버변수
//print 메서드 생성
//getter / setter 생성
class Point1{
	private int x;
	private int y;
	private int z;
	//같은 클래스의 멤버변수는 모든 메서드에서 공유된다.
	public void print() {
		System.out.println("(" + x + "," + y + "," + z + ")");
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	//getter(멤버변수의 값을 가져오는 역할의 메서드)
	//setter(멤버변수의 값을 변경하는 역할의 메서드)
//	public int getX() {
//		return this.x;
//	}
//	public int getY() {
//		return this.y;
//	}
//	public int getZ() {
//		return this.z;
//	}
//	public void setX(int x) { //매개변수 x와 멤버변수 x는 다름
//		//this는 내 클래스의 멤버변수를 지칭하는 키워드
//		this.x = x;
//	}
//	public void setY(int y) {
//		this.y = y;
//	}
//	public void setZ(int z) {
//		this.z = z;
//	}
}
