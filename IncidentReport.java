import java.util.Scanner;

public class IncidentReport {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        // heading
        System.out.println("Welcome to St. Benedict Sport Incident Repost System. Please enter the following information: ");
        
        // ask for name
        System.out.print("Name of the person submitting this report: ");
        String name = s.nextLine();
        
        // ask for sport
        System.out.print("Enter name of the sport: ");
        String sport = s.nextLine();

        // ask for date
        System.out.print("Enter the full date of the incident: ");
        String date = s.nextLine();

        // ask for opposition school name
        System.out.print("Enter the name of the opposition school: ");
        String oppositionSchool = s.nextLine();
        
        // location of the incident
        System.out.print("Location: ");
        String location = s.nextLine();

        // asking student's school
        System.out.print("Was the student from (a) St. Benedict or (b) " + oppositionSchool + "? (Enter 'a' or 'b'): ");
        String studentSchool = "";
        while (true) {
            char schoolOption = s.next().charAt(0);
            if (schoolOption == 'a') {
                System.out.println("The student is from St. Benedict.");
                studentSchool = "St. Benedict";
                
                break;
            }
            else if (schoolOption == 'b') {
                System.out.println("The student is from " + oppositionSchool + ".");
                studentSchool = oppositionSchool;
                break;
            }
            else {
                System.out.println("Invalid input. Please enter 'a' or 'b'.");
            }
            } 

        // asking for student gender
        System.out.print("Enter the gender of the student involved in the incident (m/f): ");
        String typeOfGame = "";
        while (true) {
            char gender = s.next().charAt(0);
            if (gender == 'm') {
                typeOfGame = "boys";
                break;
            }
            else if (gender == 'f') {
                typeOfGame = "girls";
                break;
            }
            else {
                System.out.println("Invalid input. Please enter 'm' or 'f'.");
            }
        }

        // ask for description of the incident
        System.out.print("Enter a detailed description of the incident: ");
        s.nextLine(); // consume the newline character
        String description = s.nextLine();

        // 911 called
        System.out.print("Was 911 called? (y/n): ");
        String call = "";
        while (true) {
            char emergencyOption = s.next().charAt(0);
            if (emergencyOption == 'y') {
                System.out.println("911 was called.");
                call = "911 was called immediately after the incident.";
                break;
            }
            else if (emergencyOption == 'n') {
                System.out.println("911 was not called.");
                call = "911 was not called after the incident.";
                break;
            }
            else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        } 
        
        // did student go to hospital
        System.out.print("Did the student go to the hospital? (y/n): ");
        String takenToHospital = "";

        while (true) {
            char hospitalOption = s.next().charAt(0);
            if (hospitalOption == 'y') {
                System.out.println("The student went to the hospital.");
                takenToHospital = "The student was taken to the hospital.";
                break;
            }
            else if (hospitalOption == 'n') {
                System.out.println("The student did not go to the hospital.");
                takenToHospital = "The student was not taken to the hospital.";
                break;
            }
            else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        }   

        // final display
        System.out.println("\n--- Incident Report Summary ---");
        String paragraph = String.format("This is St. Benedict Sport Incident Report pratains to a %s %s game that happened on %s verses %s. The game was played at %s. The student injured was a %s student. %s %s %s Report submitted by %s.", typeOfGame, sport, date, oppositionSchool, location, studentSchool, description, call, takenToHospital, name);

        String[] words = paragraph.split(" ");
        int count = 0;
        for (String word : words) {

            // If the word makes the line too long
            if (count + word.length() > 40) {
                System.out.println();  // move to next line
                count = 0;
            }

            // Only print space if it's not the first word on the line
            if (count > 0) {
                System.out.print(" ");
                count = count + 1;
            }

            System.out.print(word);
            count += word.length();
        }   
    
    } 
}