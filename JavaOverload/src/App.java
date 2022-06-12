public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Hello hello = new Hello();
        hello.hello();
        hello.hello("Brian");
        hello.hello("Brian", 17);
    }
}

class Hello {
    public void hello() {
        System.out.println("Hello, world!");
    }

    public void hello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void hello(String name, int age) {
        if (age < 18) {
            System.out.println("Hi, " + name + "!");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
}
