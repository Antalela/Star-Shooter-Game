package SimpleGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Play {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //Board for game
        String[][] board= new String[3][3];
        board[0][0]="⦿  ";   board[0][1]="⦿  ";   board[0][2]="⦿  ";
        board[1][0]="⦿  ";   board[1][1]="⦿  ";   board[1][2]="⦿  ";
        board[2][0]="⦿  ";   board[2][1]="⦿  ";   board[2][2]="⦿  ";

        //Ship
        String[][] ship=new String[1][3];
        ship[0][0]="▲  "; ship[0][1]="   "; ship[0][2]="   ";
        String input=" ";

        //Game Loop
        do{
            //Search ship location & Move-Shoot function
            for(int it=0;it<3;it++){
                if (ship[0][it].equals("▲  ")){
                    //Move right
                    if (!(it==0)&&input.equals("a")){
                        ship[0][it]="   ";
                        ship[0][it-1]="▲  ";
                        break;
                    }
                    //Move left
                    else if (!(it==2)&&input.equals("d")){
                        ship[0][it]="   ";
                        ship[0][it+1]="▲  ";
                        break;
                    }
                    //Shoot function
                    for (int c=2;c>=0;c--){
                        if(board[c][it].equals("⦿  ")&&input.equals("s")){
                            board[c][it]="   ";
                            break;
                        }
                    }
                }
            }
            //Board & Ship print
            for (int c=0;c<4;c++){
                for (int j=0;j<3;j++){
                    if(c==3){System.out.print(ship[0][j]);}
                    else {System.out.print(board[c][j]);}
                }
                System.out.println();
            }
            System.out.format("%nFor move to ◄ enter 'a' to  ► enter 'd' %n     For shoot enter 's' exit='e'");
            //Win controller
            if(board[0][0].equals("   ")&&board[0][1].equals("   ")&&board[0][2].equals("   ")){
                System.out.format(TEXT_GREEN+"%n         YOU WIN"+TEXT_RESET+"%n  TNH FOR PLAYING MY GAME"); break;
            }
            //Input controller
            try {
                input=in.next();
                if(!input.equals("a")&&!input.equals("s")&&!input.equals("d")&&!input.equals("e")){
                    System.out.println(TEXT_RED+"PLS ENTER ONE OF THE LETTERS BELOW"+TEXT_RESET);
                }
            }catch (InputMismatchException a ){}
            //Exit function
            if (input.equals("e")){System.out.println("   THANKS FOR PLAYING MY GAME");break;}
        }while (true);
        in.close();
    }
    //https://github.com/Antalela
    //https://www.linkedin.com/in/mansur-mavlyudov-aa964b211/

    //Colors for String
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_GREEN = "\u001B[32m";

}
