package org.tnsif.capgemini.c2tc.oops;

class PaymentMethod
{
	void makePayment()
	{
		System.out.println("Processing Payment");
	}
}
class CreditCard extends PaymentMethod
{
	void swipecard()
	{
		System.out.println("Swiping Credit Card");
	}
}
class Paypal extends PaymentMethod
{
	void loginPaypal()
	{
		System.out.println("Logging into paypal");
	}
}

public class InstanceOf_Demo2 {
	public static void main(String[] args) {
		PaymentMethod payment = new PaymentMethod();
		payment = new Paypal();//downcasting
		if(payment instanceof CreditCard)
		{
			CreditCard cc = (CreditCard)payment;
			cc.swipecard();
		}
		else
		{
			Paypal pp=(Paypal)payment;
			pp.loginPaypal();
		}
		
	}

}
