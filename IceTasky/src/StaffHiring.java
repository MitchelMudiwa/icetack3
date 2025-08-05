public class StaffHiring extends StaffHiringApp {

    public StaffHiring(int staffNumber, String location) {
        super(staffNumber, location);
    }

    @Override
    public String getStaffHiringProcess() {
        if (getStaffNumber() < 20) {
            return "The hiring process must start.";
        } else {
            return "The hiring process must not start.";
        }
    }

    public String printStaffHiring() {
        System.out.println("Staff Members: " + getStaffNumber());
        System.out.println("Staff Location: " + getStaffLocation());
        System.out.println("Hiring Process: " + getStaffHiringProcess());
        return getStaffNumber() + getStaffLocation() + getStaffHiringProcess();
    }
}
