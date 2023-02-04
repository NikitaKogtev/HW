package day17;

public class ChessBoard {
    private ChessPiece[][] valueBoard;

    public ChessBoard(ChessPiece[][] valueBoard) {
        this.valueBoard = valueBoard;
    }

    public void print() {
        for (int i = 0; i < valueBoard.length; i++) {
            for (int j = 0; j < valueBoard.length; j++) {
                System.out.print(valueBoard[i][j].getDesign());
            }
            System.out.println();
        }
    }

}
