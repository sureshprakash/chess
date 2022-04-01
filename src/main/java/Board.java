import java.util.Arrays;

public class Board {
  private static final int SIZE = 8;

  private Cell[][] cell = new Cell[SIZE][SIZE];

  public Board() {
    for (int row = 0; row < SIZE; row++) {
      for (int col = 0; col < SIZE; col++) {
        cell[row][col] = new Cell(row + 1, (char) (col + 'a'));
      }
    }

    placeCoins();
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();

    for (int row = SIZE - 1; row >= 0; row--) {
      for (int col = 0; col < SIZE; col++) {
        sb.append(cell[row][col]).append("\t\t");
      }

      sb.append("\n");
    }

    return sb.toString();
  }

  private void placeCoins() {
    new Rook(Color.WHITE, getCell("a1"));
    new Knight(Color.WHITE, getCell("b1"));
    new Bishop(Color.WHITE, getCell("c1"));
    new Queen(Color.WHITE, getCell("d1"));
    new King(Color.WHITE, getCell("e1"));
    new Bishop(Color.WHITE, getCell("f1"));
    new Knight(Color.WHITE, getCell("g1"));
    new Rook(Color.WHITE, getCell("h1"));

    new Rook(Color.BLACK, getCell("a8"));
    new Knight(Color.BLACK, getCell("b8"));
    new Bishop(Color.BLACK, getCell("c8"));
    new Queen(Color.BLACK, getCell("d8"));
    new King(Color.BLACK, getCell("e8"));
    new Bishop(Color.BLACK, getCell("f8"));
    new Knight(Color.BLACK, getCell("g8"));
    new Rook(Color.BLACK, getCell("h8"));

    for (char col = 'a'; col <= 'h'; col++) {
      new Pawn(Color.WHITE, getCell(col + "2"));
      new Pawn(Color.BLACK, getCell(col + "7"));
    }
  }

  private Cell getCell(String cellName) {
    // TODO: Validate cell name
    return cell[cellName.charAt(1) - '1'][cellName.charAt(0) - 'a'];
  }
}
