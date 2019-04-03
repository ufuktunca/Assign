
public class Gpa {
	
	private int course1;
	private int course2;
	private int course3;
	private int course4;
	private int course5;
	private int gpa;
	
	

	public void calcgpa(int course1, int course2, int course3,int course4,int course5) {
		
		this.course1=course1;
		this.course2=course2;
		this.course3=course3;
		this.course4=course4;
		this.course5=course5;
	}
	
	
	

	public int getCourse1() {
		return course1;
	}




	public void setCourse1(int course1) {
		this.course1 = course1;
	}




	public int getCourse2() {
		return course2;
	}




	public void setCourse2(int course2) {
		this.course2 = course2;
	}




	public int getCourse3() {
		return course3;
	}




	public void setCourse3(int course3) {
		this.course3 = course3;
	}




	public int getCourse4() {
		return course4;
	}




	public void setCourse4(int course4) {
		this.course4 = course4;
	}




	public int getCourse5() {
		return course5;
	}




	public void setCourse5(int course5) {
		this.course5 = course5;
	}




	public int calcgpa() {
	 return gpa=(course1+course2+course3+course4+course5)/5;
		
	}
	public void showgpa() {
		System.out.println("your gpa is" + gpa);
	}

}
