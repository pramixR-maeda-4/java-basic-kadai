package text.kadai_015;

public class Car_Chapter15 {
	private int gear = 1;
	private int speed = 10;
	
	public Car_Chapter15() {
		this.gear = 1;
		this.speed = 10;
	}
	
	public void gearChange(int afterGear) {
		this.gear = afterGear;
	}
	
	public void run() {
		this.speed = switch (this.gear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default-> 10;
		};
		System.out.println("時速 : " + speed + "km/h");
	}
}
