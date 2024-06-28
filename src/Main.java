import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}