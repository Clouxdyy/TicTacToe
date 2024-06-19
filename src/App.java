import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {

        // Visual UI for players and input field
        char[][] board = {
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' }

        };
        System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("___________");
        System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("___________");
        System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);

        // Decide who goes first and create rotation of players
        char currentPlayer = 'X';
        int playerMoves = 0;

        // Game Loop Starts Here
        while (true) {

        }

        // Turn System
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number 1-9 to make your move:");
        int index = input.nextInt();

        int row = (index - 1) / 3;
        int col = (index - 1) % 3;

        if (playerMoves % 1 == 2) {
            System.out.println("Player " + currentPlayer + "'s Move!");
        } else {
            System.out.println("Player " + currentPlayer + "'s Move!");
        }

        if (board[row][col] == ' ') {
            board[row][col] = currentPlayer;
            playerMoves++; // Increment playerMoves for the next move
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch player
        } else {
            System.out.println("This Space Has Already Been Taken! Choose Another One...");
        }

        // Input Based Logic BBY
        System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("___________");
        System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("___________");
        System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        input.close();

        // Game Over Conditions (NOTE: FOR ROWS AND COLUMNS USE A FOR STATEMENT!!!)
        // Max Turns
        if (playerMoves == 9) {
            System.out.println("It's a Draw!");
        }
        // Rows and Columns
        if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != ' ') {
            System.out.println(currentPlayer + "WINS!!!");
        }
        if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] != ' ') {
            System.out.println(currentPlayer + "WINS!!!");
        }
        if (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] != ' ') {
            System.out.println(currentPlayer + "WINS!!!");
        }
        if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] != ' ') {
            System.out.println(+currentPlayer + "WINS!!!");
        }
        if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != ' ') {
            System.out.println(+currentPlayer + "WINS!!!");
        }
        if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] != ' ') {
            System.out.println(+currentPlayer + "WINS!!!");
        }
        // Diagonals
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != ' ') {
            System.out.println(currentPlayer + "WINS!!!");
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            System.out.println(currentPlayer + "WINS!!!");
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }

}
