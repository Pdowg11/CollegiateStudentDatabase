package src.com.collegiatestudentdatabase;

public class Senior extends Students {
    private boolean attendingFeast, attendingBrunch, willGraduate;
    private String collegeAttending;

    public Senior(String firstName, String lastName, int gradYear, double totalServiceHours, boolean attendingFeast, boolean attendingBrunch, boolean willGraduate, String collegeAttending) {
        super(firstName, lastName, gradYear, totalServiceHours);
        this.attendingFeast = attendingFeast;
        this.attendingBrunch = attendingBrunch;
        this.willGraduate = willGraduate;
        this.collegeAttending = collegeAttending;
    }

    public boolean isAttendingFeast() {
        return attendingFeast;
    }

    public void setAttendingFeast(boolean attendingFeast) {
        this.attendingFeast = attendingFeast;
    }

    public boolean isAttendingBrunch() {
        return attendingBrunch;
    }

    public void setAttendingBrunch(boolean attendingBrunch) {
        this.attendingBrunch = attendingBrunch;
    }

    public boolean isWillGraduate() {
        return willGraduate;
    }

    public void setWillGraduate(boolean willGraduate) {
        this.willGraduate = willGraduate;
    }

    public String getCollegeAttending() {
        return collegeAttending;
    }

    public void setCollegeAttending(String collegeAttending) {
        this.collegeAttending = collegeAttending;
    }

    public void displayNameAndYear() {
        System.out.println("\nName: " + super.getFirstName() + " " + super.getLastName() + "\nGraduation year: " + super.getGradYear());
    }
    public int getNumRecLettersRequested() { return 0; }
}
