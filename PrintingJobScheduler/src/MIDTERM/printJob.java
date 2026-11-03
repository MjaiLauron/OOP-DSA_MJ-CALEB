
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

        // Constructor for a print job with one copy by default
    public printJob(String jobID, String customerName) {
        this(jobID, customerName, 1);
    }
    
    // Getter methods
    public String getJobID() {
        return jobID;
    }

    public String getCustomerName() {
        return customerName;
    }

    // Checks if the print job is a bulk order
    public boolean isBulkOrder() {
        return copies >= 20;
    }
    
    // Default print type
    public String getPrintType() {
        return "General";
    }

    // Setter methods
    public void setJobID(String jobID) {
    if (jobID == null || jobID.trim().isEmpty()) {
        throw new IllegalArgumentException("Job ID cannot be empty.");
    }

        this.jobID = jobID.trim();
    }

    public void setCustomerName(String customerName) {
    if (customerName == null || customerName.trim().isEmpty()) {
        throw new IllegalArgumentException("Customer name cannot be empty.");
    }

        this.customerName = customerName.trim();
    }

    public void setCopies(int copies) {
    if (copies <= 0) {
        throw new IllegalArgumentException(
            "Copies must be greater than zero."
        );
    }

    this.copies = copies;
    }
    
    // Updates the number of copies and returns the updated cost
    public double updateCopiesAndGetCost(int newCopies) {
        setCopies(newCopies);
        return getPrintingCost();
    }
    
    // Returns a complete description of the print job
    public String getJobDescription() {
        return "Job ID: " + jobID
            + "\nCustomer Name: " + customerName
            + "\nPrint Type: " + getPrintType()
            + "\nCopies: " + copies;
        }
    
    // Returns a summary of the printing cost
    public String getPrintingCostSummary() {
        return "Print Type: " + getPrintType()
            + "\nNumber of Copies: " + getCopies()
            + "\nTotal Cost: ₱" + String.format("%.2f", getPrintingCost());
        }
    
    // Returns the printing cost (overridden by child classes)
    public double getPrintingCost() {
        return 0.00;
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
    // Returns the print job information as a readable String
    @Override
    public String toString() {
        return getJobDescription()
            + "\n" + getPrintingCostSummary();
    }

}
