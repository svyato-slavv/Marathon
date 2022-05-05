package day17;

public class ChessBoard {
    private String[][] board=new String[8][8];

    public ChessBoard(String[][] board) {
        this.board = board;
    }

    public String[][] getBoard() {
        return board;
    }

    public static void print(ChessBoard chessBoard){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessBoard.getBoard()[i][j]);
            }
            System.out.println();
        }
    }
}
