public abstract class Coin {
  protected final Color color;
  protected Cell position;

  public Coin(Color color, Cell position) {
    this.color = color;
    this.position = position;
    position.placeCoin(this);
  }

  Color getColor() {
    return color;
  }

  public abstract boolean isValidMove(Cell newPosition);

  public abstract CoinType type();

  @Override
  public String toString() {
    return color.toString() + type().toString();
  }

  public void moveTo(Cell cell) {
    if (cell == position) {
      throw new IllegalArgumentException("Placing a coin in the same cell is invalid");
    }

    if (!cell.isFree() && cell.getCoin().color == color) {
      throw new IllegalArgumentException("Invalid move. " + cell.getCoin() + " is present at " + cell);
    }

    if (isValidMove(cell)) {
      throw new IllegalArgumentException("Illegal move of " + this + " to " + cell);
    }

    position.removeCoin();
    position = cell;
    position.placeCoin(this);
  }
}
