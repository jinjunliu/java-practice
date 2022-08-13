import java.lang.reflect.Constructor;

public class InvokeConstructor {
    public static void main(String[] args) throws Exception {
        Class<Student> stdClass = Student.class;
        // 获取public构造器，参数为String:
        Constructor<Student> c = stdClass.getConstructor(String.class);
        // 调用该构造器并创建对象:
        Student s = c.newInstance("Alice");
        System.out.println(s.getName()); // Alice
        System.out.println(s.getScore()); // 0
        System.out.println(s.getGrade()); // 1
    }
}
