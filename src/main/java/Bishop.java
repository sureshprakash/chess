public class Bishop extends Coin {

  public Bishop(Color color, Cell position) {
    super(color, position);
  }

  @Override
  public boolean isValidMove(Cell newPosition) {
    return this.position.getCol() - newPosition.getCol() == this.position.getRow() - newPosition.getRow();
  }

  @Override
  public CoinType type() {
    return CoinType.BISHOP;
  }
}
