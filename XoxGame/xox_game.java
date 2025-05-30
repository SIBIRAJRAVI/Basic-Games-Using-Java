package javaMethods.XoxGame;


import java.util.Arrays;
import java.util.Scanner;



public class xox_game {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         String[][] game={{"_","_","_"},
                          {"_","_","_"},
                          {"_","_","_"}
                        };

        int computer_row=(int)(Math.random()*(3-1+1))+1;
        int computer_col=(int)(Math.random()*(3-1+1))+1;
        // int computer_chooice= (int) (Math.random()*(2-1+1))+1;
        // System.out.println(computer_chooice);
        String temp;
        


        System.out.println("----------------   Welcome to the Xox Game   ------------------------------");

        System.out.print("Let's Press 'Y' to Start the Game : ");
        char start=scan.nextLine().charAt(0);
        // boolean find;
       



        if(start=='y' || start=='Y'){
                System.out.print(" Enter what you want to put X or O : ");
                String chooice=scan.nextLine();
                if(chooice.equals("X")||chooice.equals("x")){
                    temp="O";
                }
                else{
                    temp="X";
                }
                System.out.println("The Compute play as : "+temp);
                System.out.println();
                
            
                while(check_empty(game)&& check_win_X(game,temp) && check_win_O(game,chooice)){
                    
                    // while(find){
                    for(int i=0;i<game.length;i++){
                        for(int j=0;j<game.length;j++){
                            System.out.print(game[i][j]+"\t");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    System.out.print("Enter the place where to Put row : ");
                    int  input_row=scan.nextInt();

                    System.out.print("Enter the place where to put column : ");
                    int input_col=scan.nextInt();
                    scan.nextLine();
                    
                    check_place_user(input_row,input_col,chooice,game);
                    check_place_computer(computer_row,computer_col,temp,game);

                // }
            }
        
            
            
            
            
            // get_input(input_row,input_col,chooice,game); 
       
        for(int i=0;i<game.length;i++){
            for(int j=0;j<game.length;j++){
                System.out.print(game[i][j]+"\t");
            }
            System.out.println();
        }   
    }
    else{
        System.out.print("--------------Thanks For Visiting ----------------------");
    }
   
}
   
    public static String[][] check_place_user(int row,int col,String choice,String[][] game){
        if(game[row][col]=="_"){
            game[row][col]=choice;
        }
        else{
            System.out.println("you enter place Already Full");

        }
        return game;
    }
    public static String[][] check_place_computer(int row,int col,String choice,String[][] game){
        
        if(game[row-1][col-1]=="_"){
            game[row-1][col-1]=choice;
        }
        else{
            row =(int)(Math.random()*(3-1+1))+1;
            col =(int)(Math.random()*(3-1+1))+1;
            
            check_place_computer( row,col,choice,game);

           
           
            
        }
        return game;
    }
    public static boolean check_empty(String [][] game){
        for(int i=0;i<game.length;i++){
            for(int j=0;j<game.length;j++){
                if(game[i][j]=="_"){
                    return true;
                }

            }
        }
        System.out.println("--------------------- GAME over ----------------");

        return false;
    }
    public static boolean check_win_X(String[][] game,String temp){

        if((game[0][0].equals(temp) && game[0][1].equals(temp) && game[0][2].equals(temp))||(game[1][0].equals(temp)&&game[1][1].equals(temp)&&game[1][2].equals(temp))||(game[2][0].equals(temp) && game[2][1].equals(temp)&&game[2][2].equals(temp))||(game[0][0].equals(temp) && game[1][0].equals(temp)&&game[2][0].equals(temp))||(game[0][1].equals(temp) && game[1][1].equals(temp) && game[2][1].equals(temp))||(game[0][2].equals(temp) && game[1][2].equals(temp) && game[2][2].equals(temp))||(game[0][0].equals(temp) && game[1][1].equals(temp) && game[2][2].equals(temp))||(game[2][0].equals(temp) && game[1][1].equals(temp) && game[0][2].equals(temp))){

            System.out.println(" --------- "+temp+" Wins the Game --------");
            return false;

        }
        return true;
    }
    public static boolean check_win_O(String[][] game,String chooice){
        if((game[0][0].equals(chooice) && game[0][1].equals(chooice) && game[0][2].equals(chooice))||(game[1][0].equals(chooice)&&game[1][1].equals(chooice)&&game[1][2].equals(chooice))||(game[2][0].equals(chooice) && game[2][1].equals(chooice) && game[2][2].equals(chooice))||(game[0][0].equals(chooice) && game[1][0].equals(chooice)&&game[2][0].equals(chooice))||(game[0][1].equals(chooice) && game[1][1].equals(chooice)&& game[2][1].equals(chooice))||(game[0][2].equals(chooice) && game[1][2].equals(chooice) && game[2][2].equals(chooice))||(game[0][0].equals(chooice) && game[1][1].equals(chooice)&& game[2][2].equals(chooice))||(game[2][0].equals(chooice) && game[1][1].equals(chooice) &&game[0][2].equals(chooice))){
            System.out.println("---------- "+chooice +" wins the Game ----------");
            return false;
        }
        return true;

    }
}
