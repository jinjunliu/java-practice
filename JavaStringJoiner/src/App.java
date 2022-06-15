import java.util.StringJoiner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] names = {"Bob", "Alice", "Grace"};
        var sj = new StringJoiner(", ", "Hello ", "!");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println(sj.toString());

        var s = String.join(", ", names);
        System.out.println(s);
    }
}
