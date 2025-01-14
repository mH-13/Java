class Car {
  String brand;
  int year;

  public void display() {
      System.out.println("Brand: " + brand + ", Year: " + year);
  }
}

public class ClassandObjects { //Main class name should be the same as the file name
  public static void main(String[] args) {
      Car car = new Car();
      car.brand = "Toyota";
      car.year = 2020;
      car.display();
  }
}
