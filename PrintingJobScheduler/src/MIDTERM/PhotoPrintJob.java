
package MIDTERM;

public class PhotoPrintJob extends printJob {

    // Constructor
    public PhotoPrintJob(String jobID, String customerName, int copies) {
        super(jobID, customerName, copies);
    }

    // Method specific to photo printing
    @Override
    public String getPrintType() {
        return "Photo";
    }
}
