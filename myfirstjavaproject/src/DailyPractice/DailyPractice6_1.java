package DailyPractice;

public class DailyPractice6_1 {
	int productId;
	String productName;
	double price;
	DailyPractice6_1(int productId,String productName,double price)
	{
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		System.out.println("productId is :"+productId);
		System.out.println("productName is  :"+productName);
		System.out.println("price :" +price);
	}
	public static void main(String[] args) {
		/*
		Today Task
        1.Product Details
		Create a class Product with:
		productId
		productName
		price
		2.Use a parameterized constructor to initialize the fields.
		3.Create at least 3 Product objects and display their details
		 */
		
		DailyPractice6_1 d1=new DailyPractice6_1(101,"biscuitpacket",5);
		
		DailyPractice6_1 d2=new DailyPractice6_1(102,"chockalte",10);
		DailyPractice6_1 d3=new DailyPractice6_1(103,"cake",100);
		

	}

}
