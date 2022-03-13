package polymorphism;

import java.util.ArrayList;

public class MemberShip {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer custserT = new Customer(10010, "Tomas");
        Customer custserJ = new Customer(10020, "James");
        Customer custserE = new GoldCustomer(10030, "Edward");
        Customer custserP = new GoldCustomer(10040, "Percy");
        Customer custserK = new VIPCustomer(10050, "Kim");
        customers.add(custserT);
        customers.add(custserJ);
        customers.add(custserE);
        customers.add(custserP);
        customers.add(custserK);
        for (Customer customer : customers) {
            System.out.println(customer.showCustomerInfo());
        }
        int price = 10000;
        for (Customer customer : customers) {
            int cost = customer.calcPrice(price);
            System.out.print(customer.getCustomerName()+ " : ");
            System.out.println(cost);
            System.out.println(customer.bonusPoint+ "포인트");
        }

    }
}

class Customer {
    /* protected 하위 클래스에서 접근하기 위한 접근 제어자 */
    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusdRatio;

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusdRatio = 0.01;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusdRatio;
        return price;
    }
    public String showCustomerInfo(){
        return customerName + "님의 등급은 " + customerGrade + "이미, 보너스 포인트는 " + bonusPoint + "입니다.";
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}

class VIPCustomer extends Customer{
    double salesRatio;
    String agentId;

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        customerGrade = "VIP";
        bonusdRatio = 0.05;
        salesRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusdRatio;
        return price - (int) (price * salesRatio);
    }

    public double getSalesRatio() {
        return salesRatio;
    }

    public String getAgentId() {
        return agentId;
    }
}

class GoldCustomer extends Customer{
    double salesRatio;

    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        customerGrade = "Gold";
        bonusdRatio = 0.02;
        salesRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusdRatio;

        return price - (int) (price * salesRatio);
    }

    public double getSalesRatio() {
        return salesRatio;
    }

}