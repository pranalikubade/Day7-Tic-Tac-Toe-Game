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
            playerletter=scan.next().toUpperCase().charAt(0);
            if (playerletter=='X'){
                computerletter='O';
            }else {
                computerletter='X';
            }
        }
        static  void showboard() {
            System.out.println(   board[1]+ "  |  " +board[2]+ "  |  " +board[3]  );
            System.out.println("--------------");
            System.out.println(   board[4]+ "  |  " +board[5]+ "  |  " +board[6]  );
            System.out.println("--------------");
            System.out.println(   board[7]+ "  |  " +board[8]+ "  |  " +board[9]  );
        }


        public static void main(String[] args) {
            emptyboard();
            chooseletter();
            showboard();
        }
    }


