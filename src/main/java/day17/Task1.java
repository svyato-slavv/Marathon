package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece pawnWhite=ChessPiece.PAWN_WHITE;
        ChessPiece rookBlack=ChessPiece.ROOK_BLACK;
        String[] array=new String[8];
        for (int i = 0; i < array.length/2; i++) {
            array[i]=pawnWhite.getFigure();
            System.out.print(array[i]+" ");
        }
        for (int i = array.length/2; i < array.length ; i++) {
            array[i]= rookBlack.getFigure();
            System.out.print(array[i]+" ");
        }
    }

}