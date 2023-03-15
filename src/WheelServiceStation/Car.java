package WheelServiceStation;

public  class Car extends Transport implements CarWithMotor {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkingMotor() {
        System.out.println("Проверяем двигатель");
    }
}
