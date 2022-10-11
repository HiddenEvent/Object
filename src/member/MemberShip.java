package member;

import lombok.Data;

@Data
public class MemberShip {
    public static void main(String[] args) {
        Customer customerKim = new Customer();

        customerKim.setCustomerName("김순신");
        customerKim.setCustomerId(10010);
        customerKim.bonusPoint = 1000;
        System.out.println(customerKim.showCustomerInfo());
        VIPCustomer customerMon = new VIPCustomer();
        customerMon.setCustomerName("몬유신");
        customerMon.setCustomerId(10020);
        customerMon.bonusPoint = 10000;
        System.out.println(customerMon.showCustomerInfo());
    }
}

class Customer {
    /* protected 하위 클래스에서 접근하기 위한 접근 제어자 */
    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusdRatio;

    public Customer() {
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

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusdRatio = 0.05;
        salesRatio = 0.1;
    }

    public double getSalesRatio() {
        return salesRatio;
    }

    public String getAgentId() {
        return agentId;
    }
}