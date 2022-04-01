public enum Color {
  BLACK("\u001B[31m"),
  WHITE("\u001B[32m"),
  ;

  String colorNotation;

  Color(String colorNotation) {
    this.colorNotation = colorNotation;
  }

  @Override
  public String toString() {
    return colorNotation;
  }
}
