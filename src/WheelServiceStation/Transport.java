package WheelServiceStation;

public abstract class Transport {
    final String modelName;
    final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    public void checkTyres(Transport transport) {
        System.out.println("Обслуживаем " + transport.modelName);
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }
}
