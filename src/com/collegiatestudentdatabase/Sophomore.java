package src.com.collegiatestudentdatabase;

public class Sophomore extends Students {
    private String navianceStatus;

    public Sophomore(String firstName, String lastName, int gradYear, double totalServiceHours, String navianceStatus) {
        super(firstName, lastName, gradYear, totalServiceHours);
        this.navianceStatus = navianceStatus;
    }

    public String getNavianceStatus() {
        return navianceStatus;
    }

    public void setNavianceStatus(String navianceStatus) {
        this.navianceStatus = navianceStatus;
    }

    public void displayNameAndYear() {
        System.out.println("\nName: " + super.getFirstName() + " " + super.getLastName() + "\nGraduation year: " + super.getGradYear());
    }
    public int getNumRecLettersRequested() { return 0; }
    public String getCollegeAttending() { return null; }
}
