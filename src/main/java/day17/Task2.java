package day17;

public class Task2 {
    public static void main(String[] args) {
        String[][] match = new String[8][8];
        match[0][0] = "♜";
        match[0][5] = "♜";
        match[0][6] = "♚";
        match[1][1] = "♖";
        match[1][4] = "♟";
        match[1][5] = "♟";
        match[1][7] = "♟";
        match[2][0] = "♟";
        match[2][2] = "♞";
        match[2][6] = "♟";
        match[3][0] = "♛";
        match[3][3] = "♗";
        match[4][3] = "♝";
        match[4][4] = "♙";
        match[5][4] = "♗";
        match[5][5] = "♙";
        match[6][0] = "♙";
        match[6][3] = "♕";
        match[6][5] = "♙";
        match[6][7] = "♙";
        match[7][5] = "♖";
        match[7][6] = "♔";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (match[i][j]==null){
                    match[i][j]=ChessPiece.EMPTY.getFigure();
                }
            }
        }
        ChessBoard chessBoard = new ChessBoard(match);
        ChessBoard.print(chessBoard);
    }
}
