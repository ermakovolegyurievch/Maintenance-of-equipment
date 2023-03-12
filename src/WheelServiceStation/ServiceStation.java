package WheelServiceStation;

public class ServiceStation {

        public void check(Bicycle bicycle){
            bicycle.checkTyres(bicycle);
        }
        public void check(Car car){
            car.checkTyres(car);
            car.checkingMotor();
        }
        public void check(Truck truck){
            truck.checkTyres(truck);
            truck.checkingMotor();
            truck.checkTrailer();
    }
}
