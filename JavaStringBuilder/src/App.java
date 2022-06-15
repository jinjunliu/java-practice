public class App {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder(100);
        for (int i = 0; i < 100; i++) {
            sb.append(',');
            sb.append(i);
        }
        String s = sb.toString();
        System.out.println(s);

        // 链式操作
        var sb2 = new StringBuilder(1024);
        sb2.append("Mr. ")
          .append("Bob")
          .append("!")
          .insert(0, "Hello, ");
        System.out.println(sb2.toString());
    }
}
