public abstract class SmallCar extends Car {
    private boolean deduction;
    public String toString(){
        String s = this.getClass()+this.getPlateNumber()+this.getArriveTime();
        return s;
    }

    @Override
    public int calculateMoney() {
        if(this.deduction = true){
            return 0;
        }else {
            return 0;
        }
    }
}
