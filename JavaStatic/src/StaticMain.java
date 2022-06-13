public class StaticMain {
    public static void main(String[] args) {
        Person ming = new Person("xiao ming", 12);
        Person hong = new Person("xiao hong", 15);
        Person.number = 100;
        System.out.println(Person.number); // can access static field by class name
        Person.setNumber(120);
        System.out.println(Person.number);
        ming.number = 88;
        System.out.println(hong.number); // 所有实例的静态字段都被修改了
        hong.number = 99;
        System.out.println(ming.number); // 所有实例的静态字段都被修改了
    }
}
