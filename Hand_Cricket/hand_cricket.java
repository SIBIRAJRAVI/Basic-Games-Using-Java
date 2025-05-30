 import java.util.Scanner;

public class hand_cricket {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String user_name=scan.nextLine();

        System.out.print("Let's Make Toss : "+"\n"+" '1'- For the Heads"+"\n"+" '2' - For the Tails "+"\n"+"Enter Your Chooice : ");
        int user_chooice=scan.nextInt();
        String user_str="";
        String com_chooice="";
        String user_inn="";
        int ans=0;
        int temp=(int)(Math.random()*(2-1+1)+1);
        if(user_chooice==1){
            user_str="Heads";
        }
        else{
            user_str="Tails";

        }
        int toss=(int) (Math.random()*(2-1+1)+1);
        String toss_result="";
        if(toss==1){
            toss_result="Heads";


        }
        else{
            toss_result="Tails";
        }

        System.out.println("Your Choice : "+user_str+"\t"+" The Toss Result is : "+toss_result);

        if(user_chooice==toss){

            System.out.println(" You win the Toss ");
            System.out.println("-----------Choose Batting or Bowling : ------------");
            System.out.println("Choose '1' for Batting ");
            System.out.println("Choose '2' for Bowling ");
            System.out.print("Enter Your Chooice : ");
            ans=scan.nextInt();
            
            
            if(ans==1){
                user_inn="Batting";
                com_chooice="Bowling";
                temp=2;
            }
            else{
                user_inn="Bowling";
                com_chooice="Batting";
                temp=1;
            }
            System.out.println(" You choosed the "+user_inn);
            System.out.println("The Computer Role is "+com_chooice);
        }
        else{
            System.out.println("You loss the Toss");
             
            

            if(temp==1){
                com_chooice="Batting";
                user_inn="Bowling";
                ans=2;


            }
            else{
                com_chooice="Bowling";
                user_inn="Batting";
                ans=1;
            }

            System.out.println("Computer Choosed the "+com_chooice);
            System.out.println("Your Role is "+user_inn);
        }

        System.out.println("************ Let's Start Game : Innings One ");
        int user_Score=0;
        int Com_Score=0;
        int com_random=1;
        int user_inp=0;
      

        while(user_inp!=com_random){
            if(ans==1){
                com_random= (int)(Math.random()*(6-1+1)+1);
                System.out.print("Enter the value From One-'1' to Six-'6' : ");
                user_inp=scan.nextInt();
                System.out.print("Your Value "+user_inp+"\t");
                System.out.println("Computer Value "+com_random);
                if(com_random!=user_inp){
                    user_Score+=user_inp;

                }
                else{
                    System.out.println("You Got Out");
                }
                
                
                System.out.println(" The Runs of the "+user_name+" is :"+user_Score);


            }
            else{
                 com_random= (int)(Math.random()*(6-1+1)+1);
                System.out.print("Enter the value From One-'1' to Six-'6' : ");
                user_inp=scan.nextInt();
                
                System.out.print("Your Value "+user_inp+"\t");
                System.out.println("Computer Value "+com_random);
                 if(com_random!=user_inp){
                    Com_Score+=com_random;

                }
                else{
                    System.out.println("Computer Got Out");
                }

                System.out.println("The Runs of The Computer is "+Com_Score);

            }

           



        }

        System.out.println("Let's Start the Game : Innings 2 -----------");
        int sec_user_inp=0;
        int sec_com_random=1;
        int sec_user_score=0;
        int sec_com_score=0;
        while(sec_user_inp!=sec_com_random){
            if(ans==2){
                sec_com_random= (int)(Math.random()*(6-1+1)+1);
                System.out.print("Enter the value From One-'1' to Six-'6' : ");
                sec_user_inp=scan.nextInt();
                System.out.print("Your Value "+sec_user_inp+"\t");
                System.out.println("Computer Value "+sec_com_random);
                if(sec_com_random!=sec_user_inp){
                    sec_user_score+=sec_user_inp;

                }
                else{
                    System.out.println("!------ You Got Out ------!");
                    System.out.println(" The Runs of the "+user_name+" is :"+sec_user_score);
                    System.out.println("----------------- Computer Wins ---------------");
                    return;
                }
            
                
                
                System.out.println(" The Runs of the "+user_name+" is :"+sec_user_score);
                if(sec_user_score>Com_Score){
                    System.out.println("--------------The Winner is "+user_name+"-----------");
                    return;
                }


            }
            else{
                 sec_com_random= (int)(Math.random()*(6-1+1)+1);
                System.out.print("Enter the value From One-'1' to Six-'6' : ");
                sec_user_inp=scan.nextInt();
                
                System.out.print("Your Value "+sec_user_inp+"\t");
                System.out.println("Computer Value "+sec_com_random);
                 if(sec_com_random!=sec_user_inp){
                    sec_com_score+=sec_com_random;

                }
                else{
                    System.out.println("!--- Computer Got Out -----!");
                    System.out.println("----------------- You Win the Game -------------------");
                    System.out.println("The Runs of The Computer is "+sec_com_score);
                    return;
                }

                System.out.println("The Runs of The Computer is "+sec_com_score);
                if(sec_com_score>user_Score){
                    System.out.println("------------------The Winner is Computer-------------------");
                    return;
                }

            }


           
            

           



        }
        if(user_Score>sec_com_score){
                System.out.println("*********The winner is "+ user_name+"*************");
            }
            else if(user_Score < sec_com_random){
                System.out.println("******************** The Winner is Computer ************");
            }
            else{
                System.out.println("-------------Match Tied-----------");
            }

        
         


    }
    
}
