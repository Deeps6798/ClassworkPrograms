package Conditional;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int profit, loss, sellingprice=500, costprice=80;
		profit=sellingprice-costprice;
		loss=costprice-sellingprice;
		
		if(sellingprice>costprice)
		{
		System.out.println("The profit is: " +profit);
		}
		if(costprice>sellingprice)
		{
		System.out.println("The loss is:" +loss);
		}
		

	}

}
