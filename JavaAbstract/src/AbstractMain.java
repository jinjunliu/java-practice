
public class AbstractMain {
	public static void main(String[] args) {
		Person p1 = new Student("John");
		p1.run();
		Person p2 = new Teacher("Jack");
		p2.run();
	}
}
