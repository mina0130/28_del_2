public class cdio2færdig {
    public static void main(String[] args) {

        boolean player1turn, player2turn, won=false;
        int player1balance=0, player2balance, player1position, player2position, sum=2, count;
        String title, subtitle, head;


        //Laver brættet
        count=0;
        while(count<=10){
            switch(count){
                case 0: title="Tillykke! Du har opdaget et tårn og kan nu overskue hele banen. Du har fortjent en belønning";
                    subtitle="+250";
                    break;
                case 1: title="Åh nej din bil er landet i et krater! Du bliver nød til at betale for reperationer";
                    subtitle="-100";
                    break;
                case 2: title="Du er nået til et palads og går igennem porten. Du modtager en royal velkomst gave";
                    subtitle="+100";
                    break;
                case 3: title="Du er strandet i den kolde ørken, og må sætte ild til penge for at få varme";
                    subtitle="-20";
                    break;
                case 4: title="Du går ind i den befæstede by og finder penge på vejen";
                    subtitle="+180";
                    break;
                case 5: title="Du besøger et kloster, her er alle velkommen";
                    subtitle="0";
                    break;
                case 6: title="Åhh nej du kommer ind i en mørk hule og køber en fakkel får at få lys";
                    subtitle="-70";
                    break;
                case 7: title="Du lejer din hytte i bjergene ud";
                    subtitle="+60";
                    break;
                case 8: title="LØB du bliver forfulgt af en flok vareulve. Du bliver nødt til at betale hospitals regning...";
                    subtitle="-80 + extra throw";
                    break;
                case 9: title="Du er landet i et hul og betaler nogle for at hjælpe dig ud";
                    subtitle="-80";
                    break;
                default: title="WOW du har fundet en guldmine! Tillykke, du er rig!";
                    subtitle="+650";
            }

            head=Integer.toString(count);
            board.setTitleText(count+1, head);
            board.setDescriptionText(count+1, title);
            board.setSubText(count+1, subtitle);
            count++;

        }


        // bank
        switch(sum){
            case 2: player1balance=bank.add(player1balance, 250);
                break;
            case 3: player1balance=bank.deduct(player1balance, 100);
                break;
            case 4: player1balance=bank.add(player1balance, 100);
                break;
            case 5: player1balance=bank.deduct(player1balance, 20);
                break;
            case 6: player1balance=bank.add(player1balance, 180);
                break;
            case 8: player1balance=bank.deduct(player1balance, 70);
                break;
            case 9: player1balance=bank.add(player1balance, 70);
                break;
            case 10: player1balance=bank.deduct(player1balance, 80);
                break;
            case 11: player1balance=bank.deduct(player1balance, 50);
                break;
            case 12: player1balance=bank.add(player1balance, 650);
                break;
        }
    }






    }


