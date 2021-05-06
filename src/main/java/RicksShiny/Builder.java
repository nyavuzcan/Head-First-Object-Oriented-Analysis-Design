package RicksShiny;

public enum Builder {
  FENDER,MARTIN, GIBSON,COLLINGS, OLSON,RYAN,PRS,ANY;

  @Override
  public String toString() {
    switch (this){
      case ANY: return "any";
      case FENDER: return "fender";
      case MARTIN: return "martin";
      case GIBSON: return "gibson";
      case COLLINGS: return "collings";
      case OLSON: return "olsun";
      case RYAN: return "ryan";
      case PRS: return "prs";
      default: return "";
    }
  }
}
