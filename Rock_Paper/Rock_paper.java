import java.util.*;
public class Rock_paper {

    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        
        int count=0;
        int second=0;
        String user_temp="";
        String com_temp="";
        int  user_count=0;
        int Computer_count=0;
        System.out.print("Enter how many points to Get Win : ");
        int target=scan.nextInt();
         
        while(user_count!=target && Computer_count!=target ){
            String U_value= user_output(user_temp);
           String C_value= Com_output(com_temp);
           user_count+=check_user_win(U_value,C_value,count);
            Computer_count+=check_computer_win(U_value,C_value,second);
            System.out.print("Your Value : "+U_value);
            System.out.println("\t"+"Computer Value : "+C_value); 
            System.out.println("uesr point : "+user_count);
            System.out.println("computer Points : " +Computer_count);
        }
        if(count==target){
            System.out.println("user wins");
        }
        else{
            System.out.println("Computer wins");

        }
        System.out.printf("this is : ");
    
    }
    public static String user_output(String user_temp){
        Scanner scan=new Scanner(System.in);
        

        System.out.print("Enter what you want to put :"+"\n"+ "1 - is rock "+"\n"+"2 - is Paper"+"\n"+ "3 - Scissor"+"\n"+"Enter the value : ");
        int user_choice=scan.nextInt();
        
        if(user_choice==1){
            user_temp="rock";
        }
        else if(user_choice==2){
            user_temp="Paper";
        }
        else{
            user_temp="Scissor";
        }
        return user_temp;


    }
    public static String Com_output(String ans){
        
        int com_choice=(int)(Math.random()*(3-1+1)+1);
        if(com_choice==1){
            ans="rock";
        }
        else if(com_choice==2){
            ans="Paper";
        }
        else{
            ans="Scissor";
        }
        

        return ans;
    }
    public static int check_user_win(String uvalue,String cvalue,int count){
        if(uvalue.equals("rock")&& cvalue.equals("Scissor")){
            count++;
        }
        else if(uvalue.equals("Paper")&& cvalue.equals("rock")){
            count++;
        }
        else if(uvalue.equals("Scissor")&& cvalue.equals("Paper")){
            count++;
        }
        return count;
    }
    public static int check_computer_win(String uvalue,String cvalue,int second){
        if(uvalue.equals("Scissor")&&cvalue.equals("rock")){
            second++;
        }
        else if(uvalue.equals("rock")&& cvalue.equals("Paper")){
            second++;
        }
        else if(uvalue.equals("Paper")&& cvalue.equals("Scissor")){
            second++;
        }
        return second;
    }

        
}