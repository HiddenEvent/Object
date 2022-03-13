package study.pattern;

public class Singleton2 {
    public static void main(String[] args) {
        Company2 instance1 = Company2.getInstance();
        Car car1 = instance1.createCar();
        Car car2 = instance1.createCar();
        System.out.println(car1.getCarNum());
        System.out.println(car2.getCarNum());
    }
}

class Company2 {
    private static Company2 instance = new Company2();
    private int serialNum = 1000;

    /* private로 외부에서 호출하지 못하게 한다.*/
    private Company2() {

    }
    public static Company2 getInstance() {
        if (instance == null) {
            instance = new Company2();
        }
        return instance;
    }
    public Car createCar(){
        return new Car(++serialNum);
    }
}

class Car {
    private int carNum;

    public Car(int carNum) {
        this.carNum = carNum;
    }

    public int getCarNum() {
        return carNum;
    }
}