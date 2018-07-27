package icehs.science.chapter10;

public class PersonTest {

	public static void main(String[] args) {
		Person[] p1 = {
				new Person(),
				new Student(),
				new Teacher()
		};
		
		for(int i = 0; i<p1.length;i++) {
			p1[i].eat();
			p1[i].sleep();
			
			if(p1[i] instanceof Student) {
				((Student)p1[i]).study();
			}else if(p1[i] instanceof Teacher) {
				((Teacher)p1[i]).teach();
			}
		}
		

	}

}
