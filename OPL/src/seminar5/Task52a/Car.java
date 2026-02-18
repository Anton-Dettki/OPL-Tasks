package seminar5.Task52a;

public class Car {
    String brand;
    String carModel;
    int constructionYear;
    SteeringWheel myWheel;

    public Car(String carModel, String brand, int constructionYear, SteeringWheel myWheel) {
        this.carModel = carModel;
        this.brand = brand;
        this.constructionYear = constructionYear;
        this.myWheel = new SteeringWheel(
                myWheel.model,
                myWheel.color
        );
    };
}