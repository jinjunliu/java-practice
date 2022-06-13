import ming.Person;

public class PackageMain {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("xiao ming");
        p1.setAge(18);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}
