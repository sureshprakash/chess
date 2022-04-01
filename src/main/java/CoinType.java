public enum CoinType {
  ROOK("R"),
  KNIGHT("N"),
  BISHOP("B"),
  KING("K"),
  QUEEN("Q"),
  PAWN(""),
  ;

  String notation;

  CoinType(String notation) {
    this.notation = notation;
  }

  @Override
  public String toString() {
    return notation;
  }
}
