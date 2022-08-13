class Student extends Person {
    public int score;
    private int grade;

    public Student(String name) {
        super(name);
    }

    public int getScore() {
        return score;
    }

    int getGrade() {
        return grade;
    }
}
