
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
    
    // Returns a description specific to photo printing
    public String getPhotoDescription() {
        return getJobDescription()
                + "\nCategory: " + getJobCategory()
                + "\nPrinting Purpose: Photo Printing";
    }
    public double calculatePrintingCost() {
        return getCopies() * 5.00;
    }
}
