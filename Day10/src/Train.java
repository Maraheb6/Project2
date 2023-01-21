public class Train extends Trip{

    public Train(String tripNumber, double distance, double speed, String startTime) {
        super(tripNumber, distance, speed, startTime);
    }

    @Override
    public int calculateDuration() {
        int time= (int) (getDistance()/getSpeed());
        return time;
    }
}
