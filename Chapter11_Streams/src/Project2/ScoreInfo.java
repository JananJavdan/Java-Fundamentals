package Project2;

public class ScoreInfo {
    private String name;
    private String lastName;
   // private int score;
  //  private Student student;



    public  ScoreInfo(int score, int student){
        this.score = score;
        this.student = student;

    }

    public int getScore() {
        return score;
    }

    public int getStudent() {
        return student;
    }

     public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student: " + student +" " + student +", Score: "+score;
    }
    int score;
    int student;
}

