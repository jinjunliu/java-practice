
class Student extends Person {

	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run, Student " + this.name + "!");
	}
	
}
