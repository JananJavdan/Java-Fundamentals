package Project3;

import java.util.*;

public class MainPatient {
    public static void main(String[] args) {
        List<Patient> allPatients = Patient.getAllPatients();
        //Opdracht 1://///////////////////////////////////////////////////////////////////////////////////////////////
        //gebruik LinkedHashSet om unieke patienten in volgorde te behouden
        Set<Patient> uniquePatients = new LinkedHashSet<>(allPatients);

        //maak een nieuwe list van unieke patienten in volgorde
        List<Patient> uniquePtientsList = new ArrayList<>(uniquePatients);
        System.out.println("Opdracht1: ");
        //print de list van unieke patienten
        for (Patient patient : uniquePtientsList) {
            System.out.println(patient);
        }

        //Opdracht 2://///////////////////////////////////////////////////////////////////////////////////////////////
        //Sorteer de lijst volgens prioriteit: eerst op tempratuur, dan op de leeftijd
        //maak een prioriteitswachtrij met een aangepaste comparator
        PriorityQueue<Patient> priorityQueue = new PriorityQueue<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                if (p1.getTemperature() != p2.getTemperature()) {
                    return Integer.compare(p2.getTemperature(), p1.getTemperature());//sorteer op tempratuur hoog naar laag
                } else {
                    return Integer.compare(p2.getAge(), p1.getAge());//als tempratuur gelijk is , sorteer op leeftijd hoog naar laag
                }
            }
        });
        //voeg alle patienten toe aan de prioriteitwachtrij
        priorityQueue.addAll(allPatients);
        //haal de gesorteerde patienten uit de wachtrij en print ze af
        System.out.println("Opdrachr2:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        //Bonus ( /1 ): sorteren tempratur en age en verzekering///////////////////////////////////////////////////////////
        //sorteer de list op temperatuue hoog naar laag
        Comparator<Patient> temperatureSorter = Comparator.comparingInt(Patient::getTemperature).reversed();
        //sorteer de list op leeftijd hoog naar laag
        Comparator<Patient> ageSorter = Comparator.comparingInt(Patient::getAge);
        //sorteer de list op verzekering
        Comparator<Patient> insuranceSorter = Comparator.comparing(Patient::isEnsured, Comparator.reverseOrder());
        //sorteer de list met behulp van tempratureSorter en ageSorter
        allPatients.sort(temperatureSorter.thenComparing(ageSorter).thenComparing(insuranceSorter));
        //plaats de gesorteerde resultaten in een queue(queue met gesorteerde patienten)
        Queue<Patient> patientQueue = new LinkedList<>(allPatients);
        //print de list af
        System.out.println("Opdracht Bonus:");
        patientQueue.forEach(System.out::println);

        //OPdracht 3://///////////////////////////////////////////////////////////////////////////////////////
        //maak een map om de patiente per categorie op te slaan
        Map<Integer, List<Patient>> categoryMap = new HashMap<>();
        for (int i = 1; i <= 4; i++) {
            categoryMap.put(i, new ArrayList<>());
        }
        //print de resultaten van de map
        System.out.println("Opdracht3:");
        for (Map.Entry<Integer, List<Patient>> category : categoryMap.entrySet()) {
            int key = category.getKey();

            System.out.println("Category " + key + ": " + category.getValue());
        }
        //print de inhoud van de queue
        System.out.println("Inhoud van de queue");
    }

    //methode om patienten te categoriseren
    private static int categorizePatient(Patient patient) {
        if (((patient.getAge() >= 65 && patient.getTemperature() >= 38) || patient.getTemperature() >= 40) && patient.isUnKnownVirus()) {
            return 1;
        } else if (patient.getTemperature() >= 38 && patient.isUnKnownVirus()) {
            return 2;
        } else if (patient.isUnKnownVirus() && patient.getTemperature() < 38) {
            return 3;
        } else if (patient.getTemperature() >= 38 && !patient.isUnKnownVirus()) {
            return 4;
        } else {
            return -1;
        }
    }
}


