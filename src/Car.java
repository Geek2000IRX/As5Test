
public abstract class Car {
    private String plateNumber;
    private Time arriveTime;
   

    public Car() {
    }

    public Car(String plateNumber, Time time) {

        this.setPlateNumber(plateNumber);
        this.arriveTime = time;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = "粤B" + plateNumber;
    }

    public Time getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Time arriveTime) {
        this.arriveTime = arriveTime;
    }


    public abstract int calculateMoney();

    @Override
    public String toString() {
        return plateNumber + " " + arriveTime;
    }
}
