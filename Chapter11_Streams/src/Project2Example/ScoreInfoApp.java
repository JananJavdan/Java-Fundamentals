package Project2Example;

public class ScoreInfoApp {
    public static void main(String[] args) {

       // Student petter = new Student("Petter", "Doe");
        //Student lambert = new Student("Lambert", "Bah");
        //Student simon = new Student("Simon", "Williams");
        //Student martin = new Student("Martin", "Jacobs");
        //Student maes = new Student("maes", "Jansenss");



        ScoreInfo petter = new ScoreInfo(50, (new Student("Petter", "Doe")));
        ScoreInfo lambert = new ScoreInfo(67, (new Student("Lambert", "Bah")));
        ScoreInfo simon = new ScoreInfo(75, (new Student("Simon", "Williams")));
        ScoreInfo martin = new ScoreInfo(98, (new Student("Martin", "Jacobs")));
        ScoreInfo maes = new ScoreInfo(45, (new Student("Maes", "Janssens")));

        ScoreInfoService infoService = new ScoreInfoService();

        infoService.addScoreInfo(petter);
        infoService.addScoreInfo(lambert);
        infoService.addScoreInfo(simon);
        infoService.addScoreInfo(martin);
        infoService.addScoreInfo(maes);

        System.out.println("\ngetNumberOfStudents:");
        infoService.getNumberOfStudents();
        System.out.println("\ncalculateAverageScore :");
        infoService.calculateAverageScore();
        System.out.println("\nfilterScore :");
        infoService.filterScore();
        System.out.println("\nprintFailingStudents :");
        infoService.printFailingStudents();
        System.out.println("\ngetDataSortedByLastName");
        infoService.getDataSortedByLastName();
        System.out.println("\ngetDataSortedByScore");
        infoService.getDataSortedByScore();



    }
}

