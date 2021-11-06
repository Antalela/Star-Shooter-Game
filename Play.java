package SimpleGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Play {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input=" ";
        byte key=0;
        int it,c;

        Mechanics gt   = new Mechanics();

        //Game Loop
        do{
            //Search ship location & Move-Shoot function
            for(it=0;it<3;it++){
                if (gt.getShip(it).equals("▲  ")){
                    key++;
                    //Move right
                    if (!(it==0)&&input.equals("a")){
                        gt.setShip(it,"   ");
                        gt.setShip(it-1,"▲  ");

                        break;
                    }
                    //Move left
                    else if (!(it==2)&&input.equals("d")){
                        gt.setShip(it,"   ");
                        gt.setShip(it+1,"▲  ");

                        break;
                    }
                    //Shoot function
                    for (c=2;c>=0;c--){
                        if(gt.getBorad(c,it).equals("⦿  ")&&input.equals("s")){
                            gt.getBoard(c,it,"   ");

                            break;
                        }
                    }
                }
            }
            //Board & Ship print
            gt.board();
            if (key==2){
                gt.spc-=1;
                key=0;
            }
            gt.space();
            gt.ship();
            //lose controller
            if(gt.spc==0){
                System.out.format(TEXT_RED+"%n         YOU LOSE"+TEXT_RESET+"%n  TNH FOR PLAYING MY GAME"); break;
            }
            //Win controller
            if(gt.getBorad(0,0).equals("   ")&&gt.getBorad(0,1).equals("   ")&&gt.getBorad(0,2).equals("   ")){
                System.out.format(TEXT_GREEN+"%n         YOU WIN"+TEXT_RESET+"%n  TNH FOR PLAYING MY GAME"); break;
            }
            System.out.format("%nFor move to ◄ enter 'a' to  ► enter 'd' %n     For shoot enter 's' exit='e'");
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

/*
        Add animatin of falling enemys . if they touch ship user losse!  == GotIt !!!
        Make infınıt enemys .(by genereting board)
 */

