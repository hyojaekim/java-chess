package chess.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PieceFactory {
    public static List<Piece> generateFirstPieces(boolean teamColor) {
        return Arrays.asList(new Rook(teamColor),
                new Knight(teamColor),
                new Bishop(teamColor),
                new Queen(teamColor),
                new King(teamColor),
                new Bishop(teamColor),
                new Knight(teamColor),
                new Rook(teamColor));
    }
}
