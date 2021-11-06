package SimpleGame;

import java.util.ArrayList;

public class Mechanics extends Ship {

    //PRINT SPACE
    static int spc = 6;

    void space() {
        if (!(spc==0)){
            for (int i = 0; i <= spc; i++) {
                System.out.format("%n");
            }
        }
    }

}