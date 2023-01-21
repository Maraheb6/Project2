public abstract class Trip {
    private String tripNumber;
    private double distance;
    private double speed;
    private String startTime;

    public String getTripNumber() {
        return tripNumber;
    }

   public Trip(String tripNumber, double distance, double speed, String startTime) {
        this.tripNumber = tripNumber;
        this.distance = distance;
        this.speed = speed;
        this.startTime = startTime;
    }

    public void setTripNumber(String tripNumber) {
        this.tripNumber = tripNumber;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public abstract int calculateDuration();

    public double converMinToHour(int min){
        return  min/60;
    }
    public String calculateArrivalTime(){
        double startime=Double.parseDouble(startTime);
        return " " + (double) (startime+calculateDuration());
    }
    public void print(){
        double time=Double.parseDouble(calculateArrivalTime());
        String t;
        if(time>=12.00 && time<=23.59 )
            t="pm";
        else
            t="am";
        //System.out.println("calculate duration: "+calculateDuration());
        System.out.println("The trip starts at: "+getStartTime());
        System.out.println("Speed will be: "+speed+" km/h");
        System.out.println("Distance will be: "+distance+" km");
        System.out.println("Arrival time: "+calculateArrivalTime()+t);

         }
}
