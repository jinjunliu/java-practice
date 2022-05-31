import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Person ming = new Person();
//        ming.setName("Xiao Ming"); // 设置name
//        ming.setAge(12); // 设置age
    	Person ming = new Person("Xiao Ming", 12);
        System.out.println(ming.getName() + ", " + ming.getAge());
        
        Group group1 = new Group();
        group1.setNames("Zhang San", "Li Si");
        System.out.println(Arrays.toString(group1.getNames()));
        
        Group g = new Group();
        g.setNames(new String[] {"Xiao Ming", "Xiao Hong", "Xiao Jun"}); // 传入1个String[]
        System.out.println(Arrays.toString(g.getNames()));
        
        Group g1 = new Group();
        g.setNames();
        System.out.println(g1.getNames());
    }
}


class Person {
    private String name;
    private int age;
    private int birth;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
    
    // private方法:
    private int calcAge(int currentYear) {
        return currentYear - this.birth;
    }
}

class Group {
    private String[] names;

    public void setNames(String... names) {
//    public void setNames(String[] names) {
        this.names = names;
    }
    
    public String[] getNames() {
    	return this.names;
    }
}
