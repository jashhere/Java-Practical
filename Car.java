//An abstract class can have both abstract (without implementation) and concrete methods (with implementation)

abstract class Car {

  public final void createEngine() {}
  public abstract void buildCar();
}

class MarutiCar extends Car {

  public void buildCar() {
    createEngine();
  }
}
