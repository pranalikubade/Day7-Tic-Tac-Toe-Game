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


        public static void main(String[] args) {
            emptyboard();
            chooseletter();
        }
    }


