package seminar5.Task52a;

public class FinalTest {
    public static void main(String[] args) {
        SteeringWheel wheel = new SteeringWheel("future", "black");

        Car myCarOne = new Car("VW","golf",2019, wheel);
        Car myCarTwo = new Car("VW","golf",2019, wheel);

        System.out.println(myCarOne.myWheel.color);
        System.out.println(myCarTwo.myWheel.color);

        myCarOne.myWheel.color="grey";

        System.out.println(myCarOne.myWheel.color);
        System.out.println(myCarTwo.myWheel.color);
    }
}
