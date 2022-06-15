import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String s1 = "Hello!";
        String s2 = new String(new char[] {'H', 'e', 'l', 'l', 'o', '!'});
        System.out.println(s1);
        System.out.println(s2);
        String s3 = new String();
        s3 = s2.toUpperCase();
        System.out.println(s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.indexOf("H"));
        System.out.println(s1.lastIndexOf("l"));
        String s4 = " \t\nHello\n";
        System.out.println(s4.trim());

        int[] scores = new int[] {88, 77, 51, 66};
        Score s = new Score(scores);
        s.printScores();
        scores[2] = 99;
        s.printScores();
    }
}


class Score {
    private int[] scores;
    public Score(int[] scores) {
        this.scores = scores;
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
