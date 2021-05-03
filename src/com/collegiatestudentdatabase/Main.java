package src.com.collegiatestudentdatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Students> studentsArrayList = new ArrayList<>();
        var valid = true;
        var inLine = new Scanner(System.in);
        var inBoolean = new Scanner(System.in);
        var inInt = new Scanner(System.in);
        var inDouble = new Scanner(System.in);

        while (valid) {
            System.out.println("""
                                        
                    Enter a number indicating your choice
                    1) Enter a student's info
                    2) Display all students' names and graduation years
                    3) Display all 11th graders who haven't requested rec letters yet
                    4) Display all 12th graders and their selected college
                    5) Display all students with over 100 hours of community service
                    6) QUIT""");
            var choice = inInt.nextInt();

            switch (choice) {
                case 1:
                    //ArrayList construction
                    System.out.println("What is the student's first and last name? ");
                    var name = inLine.nextLine();
                    String[] nameFL = name.split(" ");
                    System.out.println("What year is this student graduating? ");
                    var year = inInt.nextInt();
                    System.out.println("How many total community service hours has this student gotten? ");
                    var hours = inDouble.nextDouble();
                    if (year == 2021) {
                        System.out.println("Is this student attending Feast? (true or false) ");
                        var attendingFeast = inBoolean.nextBoolean();
                        System.out.println("Is this student attending Brunch (true or false) ");
                        var attendingBrunch = inBoolean.nextBoolean();
                        System.out.println("Will this student graduate? (true or false) ");
                        var willGraduate = inBoolean.nextBoolean();
                        System.out.println("What college is this student going to attend? (NA if not applicable) ");
                        var college = inLine.nextLine();
                        studentsArrayList.add(new Senior(nameFL[0], nameFL[1], year, hours, attendingFeast, attendingBrunch, willGraduate, college));
                    }
                    else if (year == 2022) {
                        System.out.println("Is this student participating in Brunch? (true or false) ");
                        var attendingBrunch = inBoolean.nextBoolean();
                        System.out.println("How many rec letters has this student requested? ");
                        var letters = inInt.nextInt();
                        studentsArrayList.add(new Junior(nameFL[0], nameFL[1], year, hours, attendingBrunch, letters));
                    }
                    else if (year == 2023) {
                        System.out.println("What is this students Naviance status? ");
                        var status = inLine.nextLine();
                        studentsArrayList.add(new Sophomore(nameFL[0], nameFL[1], year, hours, status));
                    }
                    else if (year == 2024) {
                        System.out.println("Did this student attend Freshman Orientation? (true or false) ");
                        var attended = inBoolean.nextBoolean();
                        studentsArrayList.add(new Freshman(nameFL[0], nameFL[1], year, hours, attended));
                    }
                    //End ArrayList construction
                    break;
                case 2:
                    //Display loop
                    for (Students s : studentsArrayList) {
                        s.displayNameAndYear();
                    }
                    //End display loop
                    break;
                case 3:
                    for (Students s : studentsArrayList) {
                        if (s.getGradYear() == 2022) {
                            if (s.getNumRecLettersRequested() == 0) {
                                s.displayNameAndYear();
                            }
                        }
                    }
                    break;
                case 4:
                    for (Students s : studentsArrayList) {
                        if (s.getGradYear() == 2021) {
                            s.displayNameAndYear();
                            System.out.println(s.getCollegeAttending());
                        }
                    }
                    break;
                case 5:
                    for (Students s : studentsArrayList) {
                        if (s.getTotalServiceHours() >= 100) {
                            s.displayNameAndYear();
                            System.out.println(s.getTotalServiceHours());
                        }
                    }
                case 6:
                    valid = false;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
}
