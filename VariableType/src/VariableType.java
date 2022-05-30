
public class VariableType {
	public static void main(String args[]) {
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制表示的16711680
        int i5 = 0b1000000000; // 二进制表示的512
        long l = 9000000000000000000L; // long型的结尾需要加L
        System.out.println("i=" + i);
        System.out.println("i2=" + i2);
        System.out.println("i3=" + i3);
        System.out.println("i4=" + i4);
        System.out.println("i5=" + i5);
        System.out.println("l=" + l);
        
        
        float f1 = 3.14f;
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
        System.out.println("f1=" + f1);
        System.out.println("f2=" + f2);
        System.out.println("d=" + d);
        System.out.println("d2=" + d2);
        System.out.println("d3=" + d3);
        
        StringBuilder sb = new StringBuilder();
        sb.append("test");
        System.out.println(sb.toString());
        var sb2 = new StringBuilder();
        sb2.append("test2");
        System.out.println(sb2.toString());
	}
}
