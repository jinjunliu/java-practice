import javax.swing.text.StyledEditorKit;

public class App {
    public static void main(String[] args) throws Exception {
        int i = 100;
        // 通过new操作符创建Integer实例(不推荐使用,会有编译警告):
        // Integer n1 = new Integer(i);
        // 通过静态方法valueOf(int)创建Integer实例:
        // 能创建“新”对象的静态方法称为静态工厂方法
        Integer n2 = Integer.valueOf(i);
        // 通过静态方法valueOf(String)创建Integer实例:
        Integer n3 = Integer.valueOf("100");
        // auto boxing
        Integer n4 = 100;
        // auto unboxing
        int n5 = n4;
        // System.out.println(n1.intValue());
        System.out.println(n2.intValue());
        System.out.println(n3.intValue());
        System.out.println(n4);
        System.out.println(n5);

        // == or equals?
        Integer x = 127;
        Integer y = 127;
        Integer m = 99999;
        Integer n = 99999;
        System.out.println("x == y: " + (x==y)); // true
        System.out.println("m == n: " + (m==n)); // false
        System.out.println("x.equals(y): " + x.equals(y)); // true
        System.out.println("m.equals(n): " + m.equals(n)); // true

        byte xb = -1;
        byte yb = 127;
        System.out.println(Byte.toUnsignedInt(xb)); // 255
        System.out.println(Byte.toUnsignedInt(yb)); // 127

        int x1 = Integer.parseInt("100"); // 100
        int x2 = Integer.parseInt("100", 16); // 256,因为按16进制解析
        System.out.println(x1); // 255
        System.out.println(x2); // 127

        // boolean只有两个值true/false，其包装类型只需要引用Boolean提供的静态字段:
        Boolean t = Boolean.TRUE;
        Boolean f = Boolean.FALSE;
        System.out.println(t);
        System.out.println(f);

        // int可表示的最大/最小值:
        int max = Integer.MAX_VALUE; // 2147483647
        int min = Integer.MIN_VALUE; // -2147483648
        System.out.println(max);
        System.out.println(min);

        // long类型占用的bit和byte数量:
        int sizeOfLong = Long.SIZE; // 64 (bits)
        int bytesOfLong = Long.BYTES; // 8 (bytes)
        System.out.println(sizeOfLong);
        System.out.println(bytesOfLong);

        // 向上转型为Number:
        Number num = Integer.valueOf("999");
        // 获取byte, int, long, float, double:
        byte b = num.byteValue();
        int n1 = num.intValue();
        long ln = num.longValue();
        float f1 = num.floatValue();
        double d = num.doubleValue();
        System.out.println(b);
        System.out.println(n1);
        System.out.println(ln);
        System.out.println(f1);
        System.out.println(d);
    }
}
