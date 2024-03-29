package kr.co.javalevel;

public class Customer { //고객
    public int customerNumber;
    public String customerName;
    
    public Customer() {}

    public Customer(int customerNumber) {
		super();
		this.customerNumber = customerNumber;
	}

	public Customer(int customerNumber, String customerName) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName
                + "]";
    }
}
