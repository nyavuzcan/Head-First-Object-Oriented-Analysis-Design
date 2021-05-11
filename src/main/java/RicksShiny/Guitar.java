package RicksShiny;

public class Guitar {
  /*
  LOOK AT ALL THOSE STRINGS
  THAT'S TERRIBLE, CAN'T WE USE CONSTANTS OR OBJECTS INSTEAD ?

   */
  private String serialNumber;
  private double price;
  private GuitarSpec guitarSpec;

  public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.guitarSpec = guitarSpec;
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

  public GuitarSpec getGuitarSpec() {
    return guitarSpec;
  }


}
