package day10;

public class Class03 {

	public static void main(String[] args) {
		
		TV t1 = new TV("t1", "빨강", 3, 4, false);
		TV t2 = new TV("t2", "초록", 101, 11, true);
		
		t1.print();
		t2.print();
		
		t2.print();
		t2.chUp();
		t2.chUp();
		t2.print();
		
		t2.volumeUp();
		t2.volumeUp();
		t2.volumeUp();
		t2.volumeUp();
		t2.volumeUp();
		t2.volumeUp();
		t2.volumeUp();
		t2.volumeUp();
		t2.volumeUp();
		t2.volumeUp();
		t2.volumeUp();
		
		t2.print();
		
	}

}

class TV {
	
	private String name;
	private String color;
	private int ch;
	private int volume;
	private boolean power;
	
	public TV() {}
	
	public TV(String name, String color, int ch, int volume, boolean power) {
		if(ch > 99 || ch < 0) {
			ch = 1;
		}
		
		if(volume < 0 || volume > 10) {
			volume = 0;
		}
		this.name = name;
		this.color = color;
		this.ch = ch;
		this.volume = volume;
		this.power = power;
		
	}
	
	public void chUp() {
		if(ch < 100) {
			ch++;
			if(ch == 100) {
				ch = 1;
			}
		}
	}
	
	public void chDown() {
		if(ch > 0) {
			ch--;
			if(ch == 0) {
				ch = 99;
			}
		}
	}
	
	public void volumeUp() {
		if(volume < 10) {
			volume++;
			System.out.println("현재 볼륨: " + volume);
		}else if(volume == 10) {
			System.out.println("현재 볼륨: " + volume);
		}
	}
	
	public void volumeDown() {
		if(volume > 0) {
			volume--;
			System.out.println("현재 볼륨: " + volume);
		}else if(volume == 0) {
			System.out.println("현재 볼륨: " + volume);
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



	public int getCh() {
		return ch;
	}



	public void setCh(int ch) {
		if(ch > 0 && ch < 100) {
			this.ch = ch;			
		}else {
			this.ch = 1;
		}
	}



	public int getVolume() {
		return volume;
	}



	public void setVolume(int volume) {
		if(volume > 0 && volume <= 10) {
			this.volume = volume;			
		}else {
			this.volume = 1;
		}
	}



	public boolean getPower() {
		return power;
	}



	public void setPower(boolean power) {
		if(false) {
			ch = 0;
			volume = 0;
			this.power = power;
		}else {
			this.power = power;
		}
	}
	
	public void print() {
		System.out.println("name: " + name);
		System.out.println("color: " + color);
		if(power) {
			System.out.println("power: ON");
		}else {
			ch = 0;
			volume = 0;
			System.out.println("power: OFF");
		}
		System.out.println("ch: " + ch);
		System.out.println("volume: " + volume);
		System.out.println();
	}
	
	
}