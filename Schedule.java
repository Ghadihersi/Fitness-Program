/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesshive;


import java.util.Scanner;

/**
 *
 * @author ghadihersi
 */
public class Schedule {
   int schedule_num;
   String time;
   String name_trainer;
   String Workoutplans;
      
   Scanner input= new Scanner(System.in);

    public Schedule() {
    }

    public Schedule(int schedule_num, String time, String name_trainer, String Workoutplans) {
        this.schedule_num = schedule_num;
        this.time = time;
        this.name_trainer = name_trainer;
        this.Workoutplans = Workoutplans;
    }

    public int getSchedule_num() {
        return schedule_num;
    }

    public void setSchedule_num(int schedule_num) {
        this.schedule_num = schedule_num;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName_trainer() {
        return name_trainer;
    }

    public void setName_trainer(String name_trainer) {
        this.name_trainer = name_trainer;
    }

    public String getWorkoutplans() {
        return Workoutplans;
    }

    public void setWorkoutplans(String Workoutplans) {
        this.Workoutplans = Workoutplans;
    }

   
   public String planA(){
       System.out.println("-----------------------------------------------------------------------");   
           return   "Sunday 9AM-10AM        \nTuseday 9AM-10AM +  \nThursday 9AM-10AM"
                   +"\n-----------------------------------------------------------------------";    
   }
      public String planB(){
       System.out.println("-----------------------------------------------------------------------");
         return  "Sunday 4PM-5PM                \nTuseday  4PM-5PM    \nThursday 4PM-5PM"
               +  "\n-----------------------------------------------------------------------";
   
   }
      public String planC(){
 System.out.println("-----------------------------------------------------------------------");   
       return  "Monday  7pm-8pm      \nWednesday 7pm-8pm"
        + "\n-----------------------------------------------------------------------";
   }
    
      
      public String available_plans(){
           System.out.println("-----------------------------------------------------------------------");
                    return    "a.Sunday 9AM-10AM "
                   +         " \nTuseday 9AM-10AM "
                   +          " \nThursday 9AM-10AM\n"
                   
                   +           "\nb.Sunday 4PM-5PM"
                   +           "\nTuseday  4PM-5PM"
                   +           "\nThursday 4PM-5PM\n"
                   
                   +           "\nc.Monday  7pm-8pm"
                   +           "\nWednesday 7pm-8pm\n";
           
           
      }
      
}


