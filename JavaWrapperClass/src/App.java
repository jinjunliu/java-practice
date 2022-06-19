public class App {
    public static void main(String[] args) throws Exception {
        int i = 100;
        // 通过new操作符创建Integer实例(不推荐使用,会有编译警告):
        // Integer n1 = new Integer(i);
        // 通过静态方法valueOf(int)创建Integer实例:
        Integer n2 = Integer.valueOf(i);
        // 通过静态方法valueOf(String)创建Integer实例:
        Integer n3 = Integer.valueOf("100");
        // auto boxing
        Integer n4 = 100;
        // auto unboxing
        int x = n4;
        // System.out.println(n1.intValue());
        System.out.println(n2.intValue());
        System.out.println(n3.intValue());
        System.out.println(n4);
        System.out.println(x);
    }
}
