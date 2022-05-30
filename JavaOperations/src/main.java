
public class main {
	public static void main(String args[]) {
	    int x = 2147483640;
	    int y = 15;
	    int sum = x + y;
	    System.out.println(sum); // -2147483641
	    
	    int n = 7;       // 00000000 00000000 00000000 00000111 = 7
	    int a = n << 1;  // 00000000 00000000 00000000 00001110 = 14
	    int b = n << 2;  // 00000000 00000000 00000000 00011100 = 28
	    int c = n << 28; // 01110000 00000000 00000000 00000000 = 1879048192
	    int d = n << 29; // 11100000 00000000 00000000 00000000 = -536870912
	    int e = n >> 1; 
	    
	    System.out.println("a=" + a);
	    System.out.println("b=" + b);
	    System.out.println("c=" + c);
	    System.out.println("d=" + d);
	    System.out.println("e=" + e);
	}
}
