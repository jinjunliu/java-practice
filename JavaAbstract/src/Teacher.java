
class Teacher extends Person {

	public Teacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run, Teacher " + this.name + "!");
	}
}
