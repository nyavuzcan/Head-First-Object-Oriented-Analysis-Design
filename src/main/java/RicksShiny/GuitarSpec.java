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
  private int numStrings;

  public GuitarSpec(Builder builder, Type type, String model, Wood backWood, Wood topWood, int numStrings) {
    this.builder = builder;
    this.type = type;
    this.model = model;
    this.backWood = backWood;
    this.topWood = topWood;
    this.numStrings = numStrings;
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

  public int getNumStrings() {
    return numStrings;
  }

  //If we add some properties to guitarSpec, we will not change Inventory or Guitar. just guitarSpec.
public boolean matches(GuitarSpec otherSpec){
  if (builder != otherSpec.builder)
    return false;

  if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model)))
    return false;

  if (type != otherSpec.type)
    return false;

  if (numStrings != otherSpec.numStrings)
    return false;
  if (backWood != otherSpec.backWood)
    return false;
  if (topWood != otherSpec.topWood)
    return false;
  return true;
}
}
