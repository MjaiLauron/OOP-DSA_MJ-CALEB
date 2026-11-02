
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
}
