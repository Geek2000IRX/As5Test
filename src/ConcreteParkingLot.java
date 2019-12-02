import java.util.List;

public class ConcreteParkingLot implements ParkingLot {
    private List<Car> cars;


    @Override
    public void addParkingSpot(int type, int count) {

    }

    @Override
    public void addParkingSpot(Class<? extends Car> type, int count) {

    }

    @Override
    public List<String> getParkingSpotInfo() {
        return null;
    }

    @Override
    public String getParkingSpotInfo(int type) {
        return null;
    }

    @Override
    public String getParkingSpotInfo(Class<? extends Car> type) {
        return null;
    }

    @Override
    public void driveInto(int type, String... plateNumbers) {

    }

    @Override
    public void driveInto(Class<? extends Car> type, String... plateNumbers) {

    }

    @Override
    public void driveOut(String... plateNumbers) {

    }

    @Override
    public void passingMinutes(int minutes) {

    }

    @Override
    public List<Car> findingAllCarsByNumber() {
        return null;
    }

    @Override
    public Car getCarInfoByPlateNumber(String plateNumber) {
        return null;
    }

    @Override
    public int currentIncome() {
        return 0;
    }

    @Override
    public Time getTime() {
        return null;
    }
}
