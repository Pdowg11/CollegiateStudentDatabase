package src.com.collegiatestudentdatabase;

public class Freshman extends Students {
    private boolean attendedFreshmanOrientation;

    public Freshman(String firstName, String lastName, int gradYear, double totalServiceHours, boolean attendedFreshmanOrientation) {
        super(firstName, lastName, gradYear, totalServiceHours);
        this.attendedFreshmanOrientation = attendedFreshmanOrientation;
    }

    public boolean isAttendedFreshmanOrientation() {
        return attendedFreshmanOrientation;
    }

    public void setAttendedFreshmanOrientation(boolean attendedFreshmanOrientation) {
        this.attendedFreshmanOrientation = attendedFreshmanOrientation;
    }

    public void displayNameAndYear() {
        System.out.println("\nName: " + super.getFirstName() + " " + super.getLastName() + "\nGraduation year: " + super.getGradYear());
    }
    public int getNumRecLettersRequested() { return 0; }
    public String getCollegeAttending() { return null; }
}
