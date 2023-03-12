package WheelServiceStation;

public class ServiceStation {
    public void checkTyres(Transport transport) {
        System.out.println("Обслуживаем " + transport.modelName);
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }
        public void check(Bicycle bicycle){
           checkTyres(bicycle);
        }
        public void check(Car car){
            checkTyres(car);
            car.checkEngine();
        }
        public void check(Truck truck){
            checkTyres(truck);
            truck.checkEngine();
            truck.checkTrailer();
    }
}
