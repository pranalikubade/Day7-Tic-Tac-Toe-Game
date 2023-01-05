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
        static  void Showboard() {
            System.out.println(   board[1]+ "  |  " +board[2]+ "  |  " +board[3]  );
            System.out.println("--------------");
            System.out.println(   board[4]+ "  |  " +board[5]+ "  |  " +board[6]  );
            System.out.println("--------------");
            System.out.println(   board[7]+ "  |  " +board[8]+ "  |  " +board[9]  );
        }
        static void Playerturn() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose your location between (1-9)");
            int PlayerMove = scan.nextInt();
            if (PlayerMove > 9 || PlayerMove < 1) {
                System.out.println("Invalid Input");
                Playerturn();
            }
            if (board[PlayerMove] == ' ') {
                board[PlayerMove] = playersymbol;
            } else {
                System.out.println("Board is not empty for the position " + PlayerMove);
                Playerturn();
            }if (checkWinner(playersymbol)){
                System.out.println("Player wins");
            }else {
                Showboard();
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
                Showboard();
                System.out.println("Player chance");
                Playerturn();
            }
        }

        static void firstToStartGame(){
            int toss=(int)(Math.random()*10)%2;
            if (toss==0){
                System.out.println("Computer starts to play game first");
                Computerturn();
            }else {
                System.out.println("Player starts to play game first");
                Playerturn();
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
                Showboard();
                return true;
            }
            return false;
        }
            public static void main(String[] args) {
            emptyboard();
            chooseletter();
            Showboard();
            firstToStartGame();
        }
    }


