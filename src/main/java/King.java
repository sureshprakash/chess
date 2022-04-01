public class King extends Coin {

  public King(Color color, Cell position) {
    super(color, position);
  }

  @Override
  public boolean isValidMove(Cell newPosition) {
    return
        (newPosition.getRow() - 1 == this.position.getRow() && newPosition.getCol() - 1 == this.position.getCol()) ||
        (newPosition.getRow() - 1 == this.position.getRow() && newPosition.getCol() == this.position.getCol()) ||
        (newPosition.getRow() - 1 == this.position.getRow() && newPosition.getCol() + 1 == this.position.getCol()) ||
        (newPosition.getRow() == this.position.getRow() && newPosition.getCol() + 1 == this.position.getCol()) ||
        (newPosition.getRow() + 1 == this.position.getRow() && newPosition.getCol() + 1 == this.position.getCol()) ||
        (newPosition.getRow() + 1 == this.position.getRow() && newPosition.getCol() == this.position.getCol()) ||
        (newPosition.getRow() + 1 == this.position.getRow() && newPosition.getCol() - 1 == this.position.getCol()) ||
        (newPosition.getRow() == this.position.getRow() && newPosition.getCol() - 1 == this.position.getCol());
  }

  @Override
  public CoinType type() {
    return CoinType.KING;
  }
}
