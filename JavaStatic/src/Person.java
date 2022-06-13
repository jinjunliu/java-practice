class Person {
    public String name;
    public int age;
    // 定义静态字段number:
    public static int number;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void setNumber(int value) {
        number = value;
    }
}