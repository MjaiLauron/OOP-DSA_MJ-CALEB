
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
}
