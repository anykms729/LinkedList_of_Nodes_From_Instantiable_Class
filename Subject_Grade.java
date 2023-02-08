public class Subject_Grade {
    String subject;
    int grade;

    public Subject_Grade(Subject_Grade subject_grade) {
    }

    public Subject_Grade(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return '{'+" "+subject + ", "+grade +
                " "+'}';
    }
}
