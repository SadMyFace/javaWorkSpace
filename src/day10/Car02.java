package day10;

public class Car02 {

	public static void main(String[] args) {
		
		Cars c = new Cars("스파크", "2013", "회색");
		
		c.powerOn();
		c.powerOff();
		
	}

}

class Cars{
	private String name;
	private String year;
	private String color;
	private boolean power;
	private int speed;
	
	public Cars() {}
	
	public Cars(String name, String year, String color) {
		this.name = name;
		this.year = year;
		this.color = color;
	}
	
	
	public void powerOn() {
		power = true;
		System.out.println("전원이 켜졌습니다.");
	}
	
	
	public void powerOff() {
		if(speed == 0) {
			power = false;
			System.out.println("전원이 꺼졌습니다.");			
		}else {
			System.out.println("속도를 먼저 줄여주세요.");
		}
	}
	
	
	public void speedUp() {
		if(power) {
			speed++;
			System.out.println("현재 속도: " + speed);			
		}else {
			System.out.println("시동부터 켜주세요.");
		}
	}
	
	
	public void speedDown() {
		if(speed == 0) {
			System.out.println("더이상 줄일 수 없습니다.");
		}
		speed--;
		System.out.println("현재 속도: " + speed);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
	
	
	
	
	
}