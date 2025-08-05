public class StaffHiringApp {
    private int staffNumber;
    private String staffLocation;

    public StaffHiringApp(int staffNumber, String location) {
        this.staffNumber = staffNumber;
        this.staffLocation = location;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public String getStaffLocation() {
        return staffLocation;
    }

    public String getStaffHiringProcess() {
        return "Default hiring process.";
    }
}
