package Project2Example;

public class ScoreInfo {
     int score;
     Student student;

    public ScoreInfo(int score, Student student) {
        this.score = score;
        this.student = student;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "ScoreInfo{" +
                "score=" + score +
                ", student=" + student +
                '}';
    }
}
