package com.bridgelabz;

    import java.util.Scanner;

    public class TicTacToeGame {
        static char[] board = new char[10];
         static char playersymbol;
         static char computersymbol;
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
            playersymbol =scan.next().charAt(0);
            if (playersymbol =='X'|| playersymbol =='x'){
                computersymbol ='O';
            }else if(playersymbol =='O'|| playersymbol =='o') {
                computersymbol ='X';
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
                board[playermove] = playersymbol;
            } else {
                System.out.println("Board is not empty for the position " + playermove);
                playerturn();
            }if (checkWinner(playersymbol)){
                System.out.println("Player wins");
            }else {
                showboard();
                System.out.println("Computer chance");
                Computerturn();
            }
        }
        static void Computerturn() {
           int ComputerMove = (int)(Math.random()*9)+1;
            if (board[ComputerMove] == ' ') {
                board[ComputerMove] = computersymbol;
            } else {
                System.out.println("Board is not empty for the position " + ComputerMove);
                Computerturn();
            }if (checkWinner(playersymbol)){
                System.out.println("Computer wins");
            }else {
                showboard();
                System.out.println("Player chance");
                playerturn();
            }
        }

        static void firstToStartGame(){
            int toss=(int)(Math.random()*10)%2;
            if (toss==0){
                System.out.println("Computer starts to play game first");
                Computerturn();
            }else {
                System.out.println("Player starts to play game first");
                playerturn();
            }
        }
        static boolean checkWinner(char symbol) {
            if ((board[1] == symbol && board[2] == symbol && board[3] == symbol) ||
                    (board[1] == symbol && board[4] == symbol && board[7] == symbol) ||
                    (board[1] == symbol && board[5] == symbol && board[9] == symbol) ||
                    (board[2] == symbol && board[5] == symbol && board[8] == symbol) ||
                    (board[3] == symbol && board[6] == symbol && board[9] == symbol) ||
                    (board[3] == symbol && board[5] == symbol && board[7] == symbol) ||
                    (board[4] == symbol && board[5] == symbol && board[6] == symbol) ||
                    (board[7] == symbol && board[8] == symbol && board[9] == symbol)) {
                showboard();
                return true;
            }
            return false;
        }
            public static void main(String[] args) {
            emptyboard();
            chooseletter();
            showboard();
            firstToStartGame();
        }
    }


