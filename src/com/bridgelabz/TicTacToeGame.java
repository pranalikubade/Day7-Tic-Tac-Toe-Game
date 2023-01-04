package com.bridgelabz;

    import java.util.Scanner;

    public class TicTacToeGame {
        static char[] board = new char[10];
         static char playerletter;
         static char computerletter;
        static  void emptyboard() {
            for (int i = 1; i < board.length; i++) {
                {
                    board[i] = ' ';
                }
            }

        }
        static void  chooseletter(){
            Scanner scan =new Scanner(System.in);
            System.out.println("Choose a letter: X or O");
            playerletter=scan.next().charAt(0);
            if (playerletter=='X'||playerletter=='x'){
                computerletter='O';
            }else if(playerletter=='O'||playerletter=='o') {
                computerletter='X';
            }else{
                System.out.println("Invalid Input");
                chooseletter();
            }
        }
        static  void showboard() {
            System.out.println(   board[1]+ "  |  " +board[2]+ "  |  " +board[3]  );
            System.out.println("--------------");
            System.out.println(   board[4]+ "  |  " +board[5]+ "  |  " +board[6]  );
            System.out.println("--------------");
            System.out.println(   board[7]+ "  |  " +board[8]+ "  |  " +board[9]  );
        }
        static void playerturn() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose your location between (1-9)");
            int playermove = scan.nextInt();
            if (playermove > 9 || playermove < 1) {
                System.out.println("Invalid Input");
                playerturn();
            }
            if (board[playermove] == ' ') {
                board[playermove] = playerletter;
                showboard();
            } else {
                System.out.println("Board is not empty for the position " + playermove);
                playerturn();
            }
        }
            public static void main(String[] args) {
            emptyboard();
            chooseletter();
            showboard();
            playerturn();
        }
    }


