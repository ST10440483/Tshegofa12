//Tshegofatso Petros Tshale ST10440483

package com.mycompany.assignmentpart2;
import javax.swing.JOptionPane;

public class Assignmentpart2 {

    public static void main(String[] args) {
       String userName = JOptionPane.showInputDialog(null,"Please enter username");
        String passWord = JOptionPane.showInputDialog(null,"Please enter password");
        
        //Authenticate processes here
        //Show welcome message
        JOptionPane.showMessageDialog(null,"Welcome to EasyKanban");
        
        //Main menu 
        String[]options = {"Add tasks", "Show report", "Quit"};
            int choice;
            do{
                choice  = JOptionPane.showOptionDialog(null,"Choose option to continue.", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
                switch (choice){
                    case 0:
                        addTasks();
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "Coming soon.");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Exiting program");
                }
            } while (choice !=2);
           
    }

    private static void addTasks() {
        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Please enter number of tasks"));
                int totalHours = 0;
                
                for(int z = 0; z< numTasks; z ++){
                    String taskName = JOptionPane.showInputDialog("Enter your task name");
                    String taskDescription = JOptionPane.showInputDialog("Enter your task description with not more than 50 chracters.");
                    String developerDetails= JOptionPane.showInputDialog("Enter your full names and surname");
                    int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter time you time spent in hours"));
                    String taskStatus = JOptionPane.showInputDialog("Enter your task status(TO DO, DOING, DONE):");
                    
                        Task object = new Task(taskName, taskDescription, developerDetails, taskDuration, taskStatus);
                        if(! object.checkTaskDescrption()){
                            JOptionPane.showMessageDialog(null,"Enter description with not more than 50 characters");
                            z--;
                            continue;
                        }
                        totalHours += object.returnTotalHours();
                        JOptionPane.showMessageDialog(null, object.printTaskDetails());
                }
               JOptionPane.showMessageDialog(null,"Total hours of all tasks is : " + totalHours );
           }
        
}

    

