
interface Person {
	void run();
	String getName();
	default void runTwice() {
		System.out.println(getName() + " run twice!");
	}
}
