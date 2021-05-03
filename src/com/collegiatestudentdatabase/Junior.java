package src.com.collegiatestudentdatabase;

public class Junior extends Students {
    private boolean participatingInBrunch;
    private int numRecLettersRequested;

    public Junior(String firstName, String lastName, int gradYear, double totalServiceHours, boolean participatingInBrunch, int numRecLettersRequested) {
        super(firstName, lastName, gradYear, totalServiceHours);
        this.participatingInBrunch = participatingInBrunch;
        this.numRecLettersRequested = numRecLettersRequested;
    }

    public boolean isParticipatingInBrunch() {
        return participatingInBrunch;
    }

    public void setParticipatingInBrunch(boolean participatingInBrunch) {
        this.participatingInBrunch = participatingInBrunch;
    }

    public int getNumRecLettersRequested() {
        return numRecLettersRequested;
    }

    public void setNumRecLettersRequested(int numRecLettersRequested) {
        this.numRecLettersRequested = numRecLettersRequested;
    }

    public void displayNameAndYear() {
        System.out.println("\nName: " + super.getFirstName() + " " + super.getLastName() + "\nGraduation year: " + super.getGradYear());
    }
    public String getCollegeAttending() { return null; }
}
