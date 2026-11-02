
package MIDTERM;

public class DocumentPrintJob extends printJob {

    // Constructor
    public DocumentPrintJob(String jobID, String customerName, int copies) {
        super(jobID, customerName, copies);
    }

    // Method specific to document printing
    public String getPrintType() {
        return "Document";
    }
}
