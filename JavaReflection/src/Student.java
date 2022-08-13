class Student extends Person {
    public int score;
    private int grade;

    public Student(String name) {
        super(name);
    }

    public int getScore(String course) {
        return score;
    }

    private int getGrade(int score) {
        return grade;
    }
}
