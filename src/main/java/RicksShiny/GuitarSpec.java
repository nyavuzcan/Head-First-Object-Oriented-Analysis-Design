package RicksShiny;

public class GuitarSpec {
/*
In here we made encapsulete from Guitar.
We seperate general guitar properties from Guitar. And add just point GuitarSpec to Guitar.
This is logic encapsulation.
 */
  private Builder builder;
  private Type type;
  private String model;
  private Wood backWood;
  private Wood topWood;

  public GuitarSpec(Builder builder, Type type, String model, Wood backWood, Wood topWood) {
    this.builder = builder;
    this.type = type;
    this.model = model;
    this.backWood = backWood;
    this.topWood = topWood;
  }

  public Builder getBuilder() {
    return builder;
  }

  public Type getType() {
    return type;
  }

  public String getModel() {
    return model;
  }

  public Wood getBackWood() {
    return backWood;
  }

  public Wood getTopWood() {
    return topWood;
  }
}
