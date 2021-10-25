package main.java;

import java.util.*;
import java.util.Random;
import gui_main.GUI;

public class Matador {
    public static void main(String[] args) {

        GUI gui = new GUI();
        boolean player1turn, won=false;
        int player1balance=0, player2balance=0, sum, count, num1, num2;
        String title, subtitle, head;
        Scanner scanner = new Scanner(System.in);
        String player1name, player2name;
        Random dice2= new Random();
        Random dice1= new Random();



        //Laver brættet
        count=0;
        while(count<=10){
            switch (count) {
                case 0 -> {
                    title = "Tillykke! Du har opdaget et tårn og kan nu overskue hele banen. Du har fortjent en belønning";
                    subtitle = "+250";
                }
                case 1 -> {
                    title = "Åh nej din bil er landet i et krater! Du bliver nød til at betale for reperationer";
                    subtitle = "-100";
                }
                case 2 -> {
                    title = "Du er nået til et palads og går igennem porten. Du modtager en royal velkomst gave";
                    subtitle = "+100";
                }
                case 3 -> {
                    title = "Du er strandet i den kolde ørken, og må sætte ild til penge for at få varme";
                    subtitle = "-20";
                }
                case 4 -> {
                    title = "Du går ind i den befæstede by og finder penge på vejen";
                    subtitle = "+180";
                }
                case 5 -> {
                    title = "Du besøger et kloster, her er alle velkommen";
                    subtitle = "0";
                }
                case 6 -> {
                    title = "Åhh nej du kommer ind i en mørk hule og køber en fakkel får at få lys";
                    subtitle = "-70";
                }
                case 7 -> {
                    title = "Du lejer din hytte i bjergene ud";
                    subtitle = "+60";
                }
                case 8 -> {
                    title = "LØB du bliver forfulgt af en flok vareulve. Du bliver nødt til at betale hospitals regning...";
                    subtitle = "-80 + extra throw";
                }
                case 9 -> {
                    title = "Du er landet i et hul og betaler nogle for at hjælpe dig ud";
                    subtitle = "-80";
                }
                default -> {
                    title = "WOW du har fundet en guldmine! Tillykke, du er rig!";
                    subtitle = "+650";
                }
            }

            head=Integer.toString(count);
            board.setTitleText(count+1, head);
            board.setDescriptionText(count+1, title);
            board.setSubText(count+1, subtitle);
            count++;

        }
//players
        System.out.println("input player 1 name");
        player1name=scanner.next();
        player.addPlayer(player1name, 1000);
        System.out.println("input player 2 name");
        player2name=scanner.next();
        while(player1name.equals(player2name)){
            System.out.println("Please input a unique name for each player");
            System.out.println("Input player 2 name");
            player2name=scanner.next();
        }
        player.addPlayer(player2name, 1000);

        //game flow
        System.out.println("Which player starts? (1 or 2)");
        int start = scanner.nextInt();
        player1turn= start == 1;
        while(!won){
            if(player1turn)
                System.out.println(player1name + "'s turn");
            else
                System.out.println(player2name + "'s turn");

// dice
            int thrower=1;
            while(thrower!=0){
                System.out.println("enter 0 to throw dice");
                thrower=scanner.nextInt();
            }
            num1=1+dice1.nextInt(6);
            num2=1+dice2.nextInt(6);
            System.out.println("dice 1: " + num1);
            System.out.println("dice 2: " + num2);
            sum=num1+num2;
            gui.setDice(num1,num2);
            System.out.println("The sum of your throws is:" + sum);

        // bank

            if(player1turn){
                switch (sum) {
                    case 2 -> player1balance = bank.add(player1balance, 250);
                    case 3 -> player1balance = bank.deduct(player1balance, 100);
                    case 4 -> player1balance = bank.add(player1balance, 100);
                    case 5 -> player1balance = bank.deduct(player1balance, 20);
                    case 6 -> player1balance = bank.add(player1balance, 180);
                    case 8 -> player1balance = bank.deduct(player1balance, 70);
                    case 9 -> player1balance = bank.add(player1balance, 70);
                    case 10 -> player1balance = bank.deduct(player1balance, 80);
                    case 11 -> player1balance = bank.deduct(player1balance, 50);
                    case 12 -> player1balance = bank.add(player1balance, 650);
                }
                System.out.println(board.getDescriptionText(sum-2));
                System.out.println(board.getSubText(sum-2));
                System.out.println(player1name + "'s balance is now " + player1balance);

                if(player1balance>3000)
                    won=true;
    }
            if(!player1turn){

                switch (sum) {
                    case 2 -> player2balance = bank.add(player2balance, 250);
                    case 3 -> player2balance = bank.deduct(player2balance, 100);
                    case 4 -> player2balance = bank.add(player2balance, 100);
                    case 5 -> player2balance = bank.deduct(player2balance, 20);
                    case 6 -> player2balance = bank.add(player2balance, 180);
                    case 8 -> player2balance = bank.deduct(player2balance, 70);
                    case 9 -> player2balance = bank.add(player2balance, 70);
                    case 10 -> player2balance = bank.deduct(player2balance, 80);
                    case 11 -> player2balance = bank.deduct(player2balance, 50);
                    case 12 -> player2balance = bank.add(player2balance, 650);
                }
                System.out.println(board.getDescriptionText(sum-2));
                System.out.println(board.getSubText(sum-2));
                System.out.println(player2name + "'s balance is now " + player2balance);
                if(player2balance>3000)
                    won=true;
            }
            if(!won && sum!=10){
                player1turn= !player1turn;}
        }
        if(player1turn)
            System.out.println("Player 1 won");
        else
            System.out.println("Player 2 won");


    }}


