package FinalTest;

//There is introducing both of Person and Employee
public class IntroducingActivity {


	public static void main(String[] args) {
	
		Person p = new Person();
		p.setName("Sarah");
		p.setAge(30);
		
		
		Employee e = new Employee();
		e.setName("Chris");
		e.setAge(38);
		e.setjobTitle("Project manager");
		e.setCompany("AT&T");
		
		
		System.out.println("My name is " + p.getName() + " and I am " + p.getAge() + ".");
		System.out.println("--------------------------------------------");
		System.out.println("My name is " + e.getName() + " and I am " + e.getAge() + ".");
		System.out.println("I am working as " + e.getjobTitle() + " in " + e.getCompany() + ".");

	}

}
