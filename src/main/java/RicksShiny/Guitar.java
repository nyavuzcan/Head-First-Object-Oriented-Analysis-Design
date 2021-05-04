package RicksShiny;

public class Guitar {
  private String serialNumber;
  private double price;
  private String builder;
  private String type;
  private String model;
  private String backWood;
  private String topWood;

  public Guitar(String serialNumber, double price, String builder, String model,String type, String backWood, String topWood) {
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

  public String getBuilder() {
    return builder;
  }

  public String getType() {
    return type;
  }

  public String getModel() {
    return model;
  }

  public String getBackWood() {
    return backWood;
  }

  public String getTopWood() {
    return topWood;
  }
}
