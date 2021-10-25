    public class board {
        int fieldnumber;
        String playertitle;
        static String[] title= new String[11];
        static String[] subtitle= new String[11];
        static String[] Head= new String[11];

        public board(int fieldnumber, String playertitle){
            this.fieldnumber=fieldnumber;
            this.playertitle=playertitle;
        }
        public static void setDescriptionText(int fieldNumber, String playertitle){
            title[fieldNumber-1]=playertitle;
        }

        public static String getDescriptionText(int fieldNumber){
            return title[fieldNumber-1];
        }
        public static void setSubText(int fieldNumber, String subText){
            subtitle[fieldNumber-1]=subText;
        }
        public static String getSubText(int fieldNumber){
            return subtitle[fieldNumber-1];
        }

        public static void setTitleText(int fieldNumber, String title){
            Head[fieldNumber-1]=title;
        }
        public static String getTitleText(int fieldNumber){
            return Head[fieldNumber-1];
        }


    }

