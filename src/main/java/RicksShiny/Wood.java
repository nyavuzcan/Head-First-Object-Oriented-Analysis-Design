package RicksShiny;

public enum Wood {
  INDIAN, ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;
//One of the big advantages of using enums is that it limits the possible values you can supply to a method no
// more misspelling or case issues
  @Override
  public String toString() {
    switch (this) {
      case ALDER:
        return "alder";
      case INDIAN:
        return "indian";
      case ROSEWOOD:
        return "rosewood";
      case BRAZILIAN_ROSEWOOD:
        return "brazilian_rosewood";
      case MAHOGANY:
        return "mahogany";
      case MAPLE:
        return "maple";
      case COCOBOLO:
        return "cocobolo";
      case CEDAR:
        return "cedar";
      case ADIRONDACK:
        return "adirondack";
      case SITKA:
        return "sitka";
      default:
        return "";
    }
  }
}
