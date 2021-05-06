package RicksShiny;

public class Guitar {
  /*
  LOOK AT ALL THOSE STRINGS
  THAT'S TERRIBLE, CAN'T WE USE CONSTANTS OR OBJECTS INSTEAD ?
   */
  private String serialNumber;
  private double price;
  private Builder builder;
  private Type type;
  private String model;
  private Wood backWood;
  private Wood topWood;

  public Guitar(String serialNumber, double price, Builder builder, String model,Type type, Wood backWood, Wood topWood) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public double getPrice() {
    return price;
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
