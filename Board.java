package SimpleGame;

public class Board {
    byte a=4;
    static String[][] board = {{"⦿  ", "⦿  ", "⦿  "}, {"⦿  ", "⦿  ", "⦿  "}, {"⦿  ", "⦿  ", "⦿  "}};

    //PRINT BOARD
    void board() {
        for (byte i=2;i>=0;i--){
            if (board[i][0].equals("   ")&&board[i][1].equals("   ")&&board[i][2].equals("   ")){
                a=i;
            }
        }
        for (byte i = 0; i < 3; i++) {
            if(a==i){
                continue;
            }if(i==2){System.out.format("%s%s%s",board[i][0],board[i][1],board[i][2]); break;}
            System.out.format("%s%s%s%n",board[i][0],board[i][1],board[i][2]);
        }
    }

    //TAKE BOARD ELEMENT
    public String getBorad(int a, int b) {
        return board[a][b];
    }

    //SET NEW ELEMENT TO BOARD
    void getBoard(int a, int b, String c) {
        board[a][b] = c;
    }

    void generBoard(){
      for(byte i =0;i<3.;i++){
          if((board[i][0].equals("   ")&&board[i][1].equals("   ")&&board[i][2].equals("   "))) {
              for (byte b = 0; b < 3; b++) {
                  board[i][b] = board[i - 1][b];
              }
          }
      }

    }
}
