import java.lang.reflect.Field;

public class GetField {
    public static void main(String[] args) throws Exception {
        Class<Student> stdClass = Student.class;
        // 获取public字段"score":
        System.out.println(stdClass.getField("score"));
        // 获取继承的public字段"name":
        System.out.println(stdClass.getField("name"));
        // 获取private字段"grade":
        System.out.println(stdClass.getDeclaredField("grade"));

        Field field = String.class.getField("CASE_INSENSITIVE_ORDER");
        System.out.println(field.getName());
        System.out.println(field.getType());
        System.out.println(field.getModifiers());

        Person p = new Person("xiao ming");
        System.out.println(p.getName()); // "Xiao Ming"
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        f.set(p, "Xiao Hong");
        System.out.println(p.getName()); // "Xiao Hong"
    }

}



