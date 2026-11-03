
package MIDTERM;

public class DocumentPrintJob extends printJob {

    // Constructor
    public DocumentPrintJob(String jobID, String customerName, int copies) {
        super(jobID, customerName, copies);
    }

    // Method specific to document printing
    @Override
    public String getPrintType() {
        return "Document";
    }
    
    // Returns a description specific to document printing
    public String getDocumentDescription() {
        return getJobDescription()
                + "\nCategory: " + getJobCategory()
                + "\nPrinting Purpose: Document Printing";
    }
    
    @Override
    public double getPrintingCost() {
        return getCopies() * 3.00;
    }
}
