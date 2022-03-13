package study.pattern;

public class Singleton {
    public static void main(String[] args) {
        Company instance1 = Company.getInstance();
        Company instance2 = Company.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }
}

class Company {
    private static Company instance = new Company();
    /* private로 외부에서 호출하지 못하게 한다.*/
    private Company() {

    }
    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}