
public class Main {
	public static void main(String[] args) {
		Student s = new Student();
		s.run();
		Person p1 = new Student();
		p1.run();
		Person p2 = new Person();
		runTwice(p1);
		runTwice(p2);
	}
	
	public static void runTwice(Person p) {
		p.run();
		p.run();
	}
}

class Person {
    public void run() {
        System.out.println("Person.run");
    }
}

class Student extends Person {
	@Override
    public void run() {
        System.out.println("Student.run");
    }
}
