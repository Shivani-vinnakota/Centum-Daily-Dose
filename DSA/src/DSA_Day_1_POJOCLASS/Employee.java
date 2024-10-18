package DSA_Day_1_POJOCLASS;
//POJO CLASS
public class Employee {
	String name;
	public int age;
	private String gender;
	
	public Employee(){
		//not mandatory
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
    public void setGender(String gender) {
    	this.gender=gender;
    }
    public String getName() {
    	return name;
    }
    public int getAge() {
    	return age;
    }
    public String getGender() {
    	return gender;
    }
    
}
