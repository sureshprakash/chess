public class Queen extends Coin {

  public Queen(Color color, Cell position) {
    super(color, position);
  }

  @Override
  public boolean isValidMove(Cell newPosition) {
    return this.position.getCol() == newPosition.getCol() || this.position.getRow() == newPosition.getRow() || this.position.getCol() - newPosition.getCol() == this.position.getRow() - newPosition.getRow();
  }

  @Override
  public CoinType type() {
    return CoinType.QUEEN;
  }
}
