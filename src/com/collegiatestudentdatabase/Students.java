package src.com.collegiatestudentdatabase;

public abstract class Students {
    private String firstName, lastName;
    private int gradYear;
    private double totalServiceHours;


    public Students(String firstName, String lastName, int gradYear, double totalServiceHours) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        this.totalServiceHours = totalServiceHours;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public double getTotalServiceHours() {
        return totalServiceHours;
    }

    public void setTotalServiceHours(double totalServiceHours) {
        this.totalServiceHours = totalServiceHours;
    }

    public abstract void displayNameAndYear();
    public abstract int getNumRecLettersRequested();
    public abstract String getCollegeAttending();

}
