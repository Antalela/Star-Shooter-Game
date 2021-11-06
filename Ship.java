package SimpleGame;

public class Ship extends Board {

    static String[][] ship = {{"▲  ", "   ", "   "}};

    //PRINT SHIP
    void ship() {
        for (int i = 0; i < 3; i++) {
            System.out.print(ship[0][i]);
        }
    }

    //TAKE SHIP ELEMENT
    public String getShip(int b) {
        return ship[0][b];
    }

    //SET SHIP ELEMENT
    void setShip(int b, String c) {
        ship[0][b] = c;
    }
}
