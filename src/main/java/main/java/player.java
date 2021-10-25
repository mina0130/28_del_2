package main.java;


import gui_fields.GUI_Player;
import gui_main.GUI;

//import gui_fields.GUI_Field;

public class player {
    private static GUI gui;
    private static GUI_Player GUI_player;


    static String[] player1name= new String[2];
    static int[] playerbalance = new int[2];
    static int count=0;



    public static void addPlayer(String name, int balance){



        GUI_Player GUI_player = new GUI_Player(player1name[count], playerbalance[count]);

        //gui.addPlayer(GUI_player);
        player.setGUI_player(GUI_player);
        player.getGUI_player().getCar();



        player1name[count]=name;
        playerbalance[count]=balance;
    }

    public static void setGUI_player(GUI_Player gUI_player) {
        GUI_player = gUI_player;
    }
    public static GUI_Player getGUI_player() {
        return GUI_player;
    }

}
