import java.lang.reflect.Method;

public class GetMethod {
    public static void main(String[] args) throws Exception {
        Class<Student> stdClass = Student.class;
        // 获取public方法getScore，参数为String:
        System.out.println(stdClass.getMethod("getScore", String.class));
        // 获取继承的public方法getName，无参数:
        System.out.println(stdClass.getMethod("getName"));
        // 获取private方法getGrade，参数为int:
        System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));

        // String对象:
        String s = "Hello world";
        // 获取String substring(int)方法，参数为int:
        Method m = String.class.getMethod("substring", int.class);
        // 在s对象上调用该方法并获取结果:
        String r = (String) m.invoke(s, 6);
        // 打印调用结果:
        System.out.println(r);

        // 获取Integer.parseInt(String)方法，参数为String:
        Method m2 = Integer.class.getMethod("parseInt", String.class);
        // 调用该静态方法并获取结果:
        Integer n = (Integer) m2.invoke(null, "12345");
        // 打印调用结果:
        System.out.println(n);

        Person p = new Person("Alice");
        Method m3 = p.getClass().getDeclaredMethod("setName", String.class);
        m3.setAccessible(true);
        m3.invoke(p, "Bob");
        System.out.println(p.name);
    }
}
