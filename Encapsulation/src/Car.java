
public class Car {
private String color;
private Integer carNo;
public void setColor(String value) {
	color = value;
}
public String getColor() {
	return color;
}
public void setCarNo(Integer no) {
	carNo = no; `
}
public Integer getCarNo() {
	return carNo;
}
}
 class CarApp {
	public static void main(String[]args) {
		Car swift = new Car();
		swift.setColor("Red");
		swift.setCarNo(20345);
		System.out.println("Car Color = "+swift.getColor());
		System.out.println("Car No = "+ swift.getCarNo());
	}
}