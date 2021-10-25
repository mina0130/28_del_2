import java.awt.*;

public class player {
    static String[] player1name= new String[2];
    static int[] playerbalance = new int[2];
    static int count=0;




    public static void addPlayer(String name, int balance){

        player1name[count]=name;
        playerbalance[count]=balance;
    }

}
