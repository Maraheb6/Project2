public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Trip car=new Car("1",200,90,"12.30");
        Trip train=new Train("2",150,40,"8.00");
        Trip airplane=new AirPlane("3",400,100,"00.00");

        Print print=new Print();
        print.print(car);
        System.out.println();
        print.print(train);
        System.out.println();
        print.print(airplane);

    }
}