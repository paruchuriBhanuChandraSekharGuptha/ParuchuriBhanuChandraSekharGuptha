package com.epam.app;
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Enter max price:");
    	int max = scan.nextInt();
    	ArrayList<String> Candy = new ArrayList<String>();
    	ArrayList<String> Cs = new ArrayList<String>();
    	Candy.add("Jelly");
    	Candy.add("Lollipop");
    	Cs.add("fivestar");
    	Cs.add("kinderjoy");
    	
    	System.out.println("Sweets Class Calling:\n");
    	sA sa = new sA();
    	sA.main(args);
    	
    	System.out.println("Candy Class Calling:\n");
    	cA cna = new cA();
    	cA.main(args);
    	
    	
    	System.out.println("\nChocolates Class Calling:\n");
    	CA ca = new CA();
    	CA.main(args);

    	int Present_weight=0;
    	Pw = sA.Sweets_weight + cA.tw_candies + CA.tw_choco;
    	System.out.println("Total weight of the present is :" + Pw +" Grms");
    	
    	int Present_price=0;
    	Present_price = sA.Sweets_price+cA.tp_candies+CA.tc_choco;
    	if(max<Present_price) {
    		System.out.println("Gift price more than expected. Please get within range");
    	}
    	else {
    		System.out.println("Total price of the present is :" + Present_price +" Rc.");
    	}
    }

}
