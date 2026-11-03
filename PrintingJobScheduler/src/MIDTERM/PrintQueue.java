package MIDTERM;

public class PrintQueue {

    // Maximum number of waiting jobs
    private printJob[] jobs;

    // Queue positions and current number of jobs
    private int front;
    private int rear;
    private int count;

    // Constructor
    public PrintQueue() {
        jobs = new printJob[100];

        front = 0;
        rear = -1;
        count = 0;
    }

    // Adds a new print job to the queue
    public boolean addJob(printJob job) {

        // Check if the job is valid
        if (job == null) {
            return false;
        }
        // Check if the job ID already exists
        if (searchJob(job.getJobID()) != null) {
            return false;
        }

        // Check if the queue is full
        if (count == jobs.length) {
            return false;
        }

        // Move rear to the next position
        rear = (rear + 1) % jobs.length;

        // Store the new job
        jobs[rear] = job;

        // Increase the number of waiting jobs
        count++;

        return true;
    }

    // Processes and removes the first waiting print job
    public printJob processNextJob() {

        // Check if the queue is empty
        if (count == 0) {
            return null;
        }

        // Get the job at the front
        printJob processedJob = jobs[front];

        // Remove the processed job
        jobs[front] = null;

        // Move front to the next position
        front = (front + 1) % jobs.length;

        // Decrease the number of waiting jobs
        count--;

        return processedJob;
    }
    
    // Returns the number of waiting print jobs
    public int getJobCount() {
        return count;
    }
    
    // Checks if the queue has no waiting print jobs
    public boolean isEmpty() {
        return count == 0;
    }
    
    // Checks if the queue has reached its maximum capacity
    public boolean isFull() {
        return count == jobs.length;
    }
    
    // Returns all waiting print jobs in FIFO order
    public printJob[] getWaitingJobs() {

    // Create an array based on the number of waiting jobs
    printJob[] waitingJobs = new printJob[count];

    // Copy the jobs starting from the front of the queue
    for (int i = 0; i < count; i++) {
        int index = (front + i) % jobs.length;
        waitingJobs[i] = jobs[index];
    }

        return waitingJobs;
    }
    
    // Searches for a print job using its job ID
    public printJob searchJob(String jobID) {

    // Check if the search input is empty
    if (jobID == null || jobID.trim().isEmpty()) {
        return null;
    }

    // Check each waiting job one by one
    for (int i = 0; i < count; i++) {

        // Get the current queue position
        int index = (front + i) % jobs.length;

        // Compare the job ID
        if (jobs[index].getJobID().equalsIgnoreCase(jobID.trim())) {
            return jobs[index];
        }
    }

    // Return null if no matching job is found
        return null;
    }
    // Removes all waiting print jobs from the queue
    public void clearQueue() {

    // Remove all stored jobs from the array
    for (int i = 0; i < jobs.length; i++) {
        jobs[i] = null;
    }

    // Reset the queue positions and count
    front = 0;
    rear = -1;
    count = 0;
    }
    
}