package day10;

public class Class02 {

	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 멤버변수 : 
		 * 메서드 : 전원 on / off, 속도 up / down, 
		 * 
		 */
		
		Car c1 = new Car("차", "초록", 1, false, 0);
		Car c2 = new Car("자동차", "노랑", 3, true, 10);
		
		c1.setPower(false);
		c1.setSpeed(0);
		
		c2.setPower(true);
		c2.setSpeed(10);
		
		c1.print();
		System.out.println();
		
		c2.print();
		System.out.println();
		
		c1.speedUp();
		c1.print();
		System.out.println();
		
		c2.speedUp();
		c2.print();
		System.out.println();
		
		c2.powerOff();
		c2.print();
		System.out.println();
		
		c2.powerOn();
		c2.speedUp();
		c2.setName("자동차");
		c2.setAge(10);
		c2.setColor("빨강");
		c2.print();
		System.out.println();
		
		
		
		
		
	}

}


class Car {
	private String name;
	private String color;
	private int age;
	private boolean power;
	private int speed;
	
	
	public Car() {
		this.power = false;
		this.speed = 0;
	}
	public Car(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public Car(String name, String color, int age, boolean power, int speed) {
		this(name, color, age);
		this.power = power;
		this.speed = speed;
		if(power == false) {
			this.speed = 0;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean getPower() {
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
		if(power == false) {
			this.speed = 0;
		}
	}
	
	public void speedUp() {
		this.speed += 10;
	}
	public void speedDown() {
		this.speed -= 10;
	}
	
	public void powerOn() {
		this.power = true;
	}
	public void powerOff() {
		this.power = false;
		this.speed = 0;
	}
	
	public void print() {
		System.out.println("name: " + name);
		System.out.println("color: " + color);
		System.out.println("age: " + age);
		if(power == false) {
			speed = 0;
			System.out.println("power: Off");
		}else {
			System.out.println("power: On");
		}
		System.out.println("speed: " + speed);
	}
	
}