package WheelServiceStation;

public class Truck extends Transport implements CarWithMotor{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void checkingMotor() {
        System.out.println("Проверяем двигатель");
    }
}
