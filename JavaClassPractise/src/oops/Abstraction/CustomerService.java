package oops.Abstraction;

public class CustomerService extends Amazon {

	@Override
	public void Customer() {
	System.out.println("Customer ordered product");
		
	}

	@Override
	public void Product() {
		System.out.println("Product is packed");
		
	}

	@Override
	public void Delivery() {
		// TODO Auto-generated method stub
		super.Delivery();
	}

		public static void main(String[] args) {
		CustomerService obj =new CustomerService();
		
		obj.Customer();
		obj.Product();
		obj.Delivery();
	}
}
