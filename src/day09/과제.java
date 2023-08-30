package day09;

import java.util.Scanner;

public class 과제 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//클래스 객체 생성 (2명)
		//값을 입력 후 정보 출력 
		
		StudentInfo s1 = new StudentInfo();
		StudentInfo s2 = new StudentInfo();
		
		System.out.println("s1 이름 입력: ");
		s1.setName();
		System.out.println("s1 나이 입력: ");
		s1.setAge();
		System.out.println("s1 번호 입력: ");
		s1.setPhoneNumber();
		System.out.println("s1 주소 입력: ");
		s1.setAdress();
		
		System.out.println("s2 이름 입력: ");
		s2.setName();
		System.out.println("s2 나이 입력: ");
		s2.setAge();
		System.out.println("s2 번호 입력: ");
		s2.setPhoneNumber();
		System.out.println("s2 주소 입력: ");
		s2.setAdress();
		
		
		s1.print();
		s2.print();
		
		StudentInfo s3 = new StudentInfo("a", "b", 1, 2);
		s3.print();
		
		StudentInfo s4 = new StudentInfo("c", 3);
		s4.print();
		
		sc.close();
	}

}

//클래스 생성
//학생 클래스 생성
//이름, 나이, 전화번호, 주소
//출력
//이름(나이) 전화번호

class StudentInfo{
	
	Scanner sc = new Scanner(System.in);
	
	String name = "";
	String adress = "";
	int age;
	int phoneNumber;
	
	//생성자 위치
	//생성자 오버로딩 가능
	//생성자 오버로딩 조건
	// - 매개변수 개수가 다르거나, 매개변수 유형이 다르거나..
	
	public StudentInfo() {} //컴파일러가 자동으로 제공하는 생성자
	
	public StudentInfo(String name, String adress, int age, int phoneNumber) {
		//생성자 호출 = 반드시 첫줄에서만 가능
		this(name, age);
		this.adress = adress;
		this.phoneNumber= phoneNumber;
	}
	
	public StudentInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = sc.next();
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress() {
		this.adress = sc.next();
	}
	public int getAge() {
		return age;
	}
	public void setAge() {
		this.age = sc.nextInt();
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber() {
		this.phoneNumber = sc.nextInt();
	}
	public void print() {
		System.out.println("info: " + this.name + "(" + this.age + ") " + this.phoneNumber);
	}
	
}