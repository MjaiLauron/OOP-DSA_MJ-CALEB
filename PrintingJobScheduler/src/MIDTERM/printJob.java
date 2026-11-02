
package MIDTERM;

public class printJob {

    // Private attributes
    private String jobID;
    private String customerName;
    private int copies;

    // Constructor
    public printJob(String jobID, String customerName, int copies) {
        this.jobID = jobID;
        this.customerName = customerName;
        this.copies = copies;
    }

    // Getter methods
    public String getJobID() {
        return jobID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCopies() {
        return copies;
    }

    // Setter methods
    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCopies(int copies) {
        if (copies > 0) {
            this.copies = copies;
        }
    }
}
