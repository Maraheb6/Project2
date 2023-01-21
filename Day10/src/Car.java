public class Car extends Trip{
    public Car(String tripNumber,double distance,double speed,String startTime) {
       super(tripNumber,distance,speed,startTime);

    }


    @Override
    public int calculateDuration() {
        int time= (int) (getDistance()/getSpeed());
        return time;
    }

}
