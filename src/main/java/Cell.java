public class Cell {
  private final char col;
  private final int row;
  private Coin coin;

  public Cell(int row, char col) {
    this.row = row;
    this.col = col;
    this.coin = null;
  }

  public boolean isFree() {
    return this.coin == null;
  }

  public Coin getCoin() {
    return coin;
  }

  public void placeCoin(final Coin coin) {
    this.coin = coin;
  }

  public void removeCoin() {
    this.coin = null;
  }

  public char getCol() {
    return col;
  }

  public int getRow() {
    return row;
  }

  @Override
  public String toString() {
    String cellName = col + String.valueOf(row);

    return isFree() ? cellName : "\033[1m" + coin.toString() + cellName + "\u001B[0m";
  }
}
