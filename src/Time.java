public class Time {
    private int hour;
    private int minute;
    public Time(){
    }
    public Time(int a,int b){
        this.hour = a;
        this.minute = b;
    }
    public Time timeDifference(Time time){
        Time time1 = new Time();
        int t;
        t = Math.abs((this.hour-time.hour)*60+this.minute-time.minute);
        time1.hour=t/60;
        time1.minute=t%60;
        return time1;
    }
    public Time fewMinutesLater(int minutes){
        Time time1 = new Time();
        int t;
        t = this.hour*60+this.minute + minutes;
        time1.hour = t/60;
        time1.minute = t%60;
        return time1;
    }
    public String toString(){
        String s;
        s = this.hour+":"+this.minute;
        return s;
    }
}
