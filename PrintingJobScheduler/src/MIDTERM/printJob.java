
package MIDTERM;

public class printJob {

    // Private attributes
    private String jobID;
    private String customerName;
    private int copies;

    // Constructor with input validation
        public printJob(String jobID, String customerName, int copies) {

    if (jobID == null || jobID.trim().isEmpty()) {
        throw new IllegalArgumentException("Job ID cannot be empty.");
    }

    if (customerName == null || customerName.trim().isEmpty()) {
        throw new IllegalArgumentException("Customer name cannot be empty.");
    }

    if (copies <= 0) {
        throw new IllegalArgumentException("Copies must be greater than zero.");
    }

    this.jobID = jobID.trim();
    this.customerName = customerName.trim();
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
    
    // Default print type
    public String getPrintType() {
        return "General";
    }

    // Setter methods
    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCopies(int copies) {
    if (copies <= 0) {
        throw new IllegalArgumentException(
            "Copies must be greater than zero."
        );
    }

    this.copies = copies;
    }
    
    // Returns a complete description of the print job
    public String getJobDescription() {
        return "Job ID: " + jobID
            + "\nCustomer Name: " + customerName
            + "\nPrint Type: " + getPrintType()
            + "\nCopies: " + copies;
        }
    // Returns the category of the print job
    public String getJobCategory() {
        if (getPrintType().equals("Document")) {
            return "Paper Document Printing";
        } else if (getPrintType().equals("Photo")) {
            return "Photo Printing";
        } else {
            return "General Printing";
        }
    }
}
