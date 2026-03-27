import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
    
    // Creating a Job class to keep track of Job details
    static class Job {
        int id;
        int deadline;
        int profit;

        public Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        // [deadline, profit]
        int[][] jobsInfo = {{4, 20}, {1, 10}, {1, 40}, {1, 30}}; 
        ArrayList<Job> jobs = new ArrayList<>(); 
        
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1])); 
        } 
        
        //  Sort jobs in Descending Order of Profit
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit); 
        
        ArrayList<Integer> seq = new ArrayList<>(); 
        int time = 0; 
        
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i); 
            // If the job's deadline is greater than the current time, we can schedule it
            if (curr.deadline > time) {
                seq.add(curr.id); 
                time++; // Move time forward as 1 job takes 1 unit of time
            }
        } 

        System.out.println("--- Job Sequencing Problem ---");
        System.out.println("Maximum jobs performed = " + seq.size()); 
        System.out.print("Job Sequence: ");
        for (int i = 0; i < seq.size(); i++) {
            System.out.print("Job-" + seq.get(i) + " "); 
        } 
        System.out.println(); 
    }
}
