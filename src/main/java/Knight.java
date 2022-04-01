public class Knight extends Coin {

  public Knight(Color color, Cell position) {
    super(color, position);
  }

  @Override
  public boolean isValidMove(Cell newPosition) {
    return
        (newPosition.getRow() - 1 == this.position.getRow() && newPosition.getCol() - 2 == this.position.getCol()) ||
        (newPosition.getRow() - 2 == this.position.getRow() && newPosition.getCol() - 1 == this.position.getCol()) ||
        (newPosition.getRow() - 2 == this.position.getRow() && newPosition.getCol() + 1 == this.position.getCol()) ||
        (newPosition.getRow() - 1 == this.position.getRow() && newPosition.getCol() + 2 == this.position.getCol()) ||
        (newPosition.getRow() + 1 == this.position.getRow() && newPosition.getCol() + 2 == this.position.getCol()) ||
        (newPosition.getRow() + 2 == this.position.getRow() && newPosition.getCol() + 1 == this.position.getCol()) ||
        (newPosition.getRow() + 2 == this.position.getRow() && newPosition.getCol() - 1 == this.position.getCol()) ||
        (newPosition.getRow() + 1 == this.position.getRow() && newPosition.getCol() - 2 == this.position.getCol());
  }

  @Override
  public CoinType type() {
    return CoinType.KNIGHT;
  }
}
