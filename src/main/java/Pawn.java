public class Pawn extends Coin {

  public Pawn(Color color, Cell position) {
    super(color, position);
  }

  @Override
  public boolean isValidMove(Cell newPosition) {
    switch (color) {
      case BLACK:
        if (position.getRow() == 7) {
          return (newPosition.getRow() == 6 || newPosition.getRow() == 5) && position.getCol() == newPosition.getCol();
        } else {
          if (!newPosition.isFree() && newPosition.getCoin().getColor() == Color.WHITE && Math.abs(position.getCol() - newPosition.getCol()) == 1 && position.getRow() - newPosition.getRow() == 1) {
            return true;
          }

          return position.getRow() - newPosition.getRow() == 1 && position.getCol() == newPosition.getCol();
        }

      case WHITE:
        if (position.getRow() == 2) {
          return (newPosition.getRow() == 3 || newPosition.getRow() == 4) && position.getCol() == newPosition.getCol();
        } else {
          if (!newPosition.isFree() && newPosition.getCoin().getColor() == Color.BLACK && Math.abs(position.getCol() - newPosition.getCol()) == 1 && newPosition.getRow() - position.getRow() == 1) {
            return true;
          }

          return newPosition.getRow() - position.getRow() == 1 && position.getCol() == newPosition.getCol();
        }
    }

    return false;
  }

  @Override
  public CoinType type() {
    return CoinType.PAWN;
  }
}
