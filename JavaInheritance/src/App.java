public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Student student = new Student("Brian", 18, 100);
        // student.setScore(100);
        System.out.println(student.getScore());
        Student student2 = new Student();
        Person p1 = new Student(); // upcasting, ok
        Person p2 = new Person();
        Student s1 = (Student) p1; // ok
        System.out.println(p1 instanceof Student);
        if (p2 instanceof Student) {
            Student s2 = (Student) p2;
        }
        Object obj = "hello";
        if (obj instanceof String s) {
            // String s = (String) obj;
            System.out.println(s.toUpperCase());
            // System.out.println(obj.toUpperCase());
        }
        PrimaryStudent pms = new PrimaryStudent("Jack", 8, 100, 5);
        System.out.println(pms.getGrade());
    }
}

class Person {
    protected String name = "unnamed"; // default value
    protected int age;
    protected int birth;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Person(String name) {
        this(name, 18); // 调用另一个构造方法Person(String, int)
    }

    public Person() {
        this("Unnamed"); // 调用另一个构造方法Person(String)
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name.strip(); // 去掉首尾空格
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
}

class Student extends Person {
    private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public Student() {
        super();
    }

    public int getScore() {
        return this.score;
    } 

    public void setScore(int score) {
        this.score = score;
    }
}

class PrimaryStudent extends Student {
    private int grade;

    public PrimaryStudent (String name, int age, int score, int grade) {
        super();
        this.grade = grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }
}
