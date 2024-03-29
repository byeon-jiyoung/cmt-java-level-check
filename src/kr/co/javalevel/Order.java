package kr.co.javalevel;

public class Order { //주문
    public int orderNumber;
    public Customer customerNumber;
    public Product productNumber;

    public Order() {}

	public Order(int orderNumber, Customer customerNumber, Product productNumber) {
		super();
		this.orderNumber = orderNumber;
		this.customerNumber = customerNumber;
		this.productNumber = productNumber;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Customer getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(Customer customerNumber) {
		this.customerNumber = customerNumber;
	}

	public Product getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(Product productNumber) {
		this.productNumber = productNumber;
	}

    @Override
    public String toString() {
        return "Order [orderNumber=" + orderNumber + ", customerNumber=" + customerNumber
                + ", productNumber=" + productNumber + "]";
    }
}
