import java.util.Scanner;
public class GroupEProject {
    //author Bekezhan Abdykarimov Task 1

    static void bekezhanMethod(){
        Scanner userKB = new Scanner(System.in);
        
        try{
            
            System.out.println("What is your name?");
            while(userKB.hasNextInt()){
                
                System.out.println("It is not a name, please try again!");
                userKB.next();
            }
            
            String name = userKB.next();
            System.out.println("What is your surname?");
            while(userKB.hasNextInt()){
                
                userKB.next();
                System.out.println("It is not a surname, please try again!");
              
            }
            String surname = userKB.next();
            System.out.println("Hey " + name + " " + surname + ", nice to meet you!");
            
        }
        
        catch(Exception e){
            
            System.out.println("Error!!! Something went wrong!");

        }
        userKB.close();
    }
    // ADD YOUR CODE HERE
    
    // Second student code 
    static void secondStudentMethod(){
         int a = 1;
         int b = 5;
         int ab = a + b;
         System.out.println(ab);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bekezhanMethod();
        secondStudentMethod();


    }
    
}