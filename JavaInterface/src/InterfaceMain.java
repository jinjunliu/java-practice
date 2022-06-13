
public class InterfaceMain {
	public static void main(String[] args) {
		Person p1 = new Student("Jack");
		p1.run();
		p1.runTwice();
		System.out.println(p1.getName());
	}
}
