package com.epam.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChocoAnalisys {
	public static int tw_choco = 0;
	public static int tc_choco = 0;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Size of fivestar = Large\nSize of kinderjoy = Small");
    	fivestar dh = new fivestar();
    	kinderjoy sn = new kinderjoy();
    	
    	System.out.println("Enter size of fivestar(1 to 10): ");
    	dh.getsize(scan.nextInt());
    	
    	System.out.println("Enter size of kinderjoy(1 to 10): ");
    	sn.getsize(scan.nextInt());
    	
    	System.out.println("Enter quantity of fivestar: ");
    	int dq = scan.nextInt();
    	
    	System.out.println("Enter quantity of kinderjoy: ");
    	int sq = scan.nextInt();
    	
    	System.out.println("Enter price of fivestar: ");
    	dh.price = scan.nextInt();
    	
    	System.out.println("Enter price of kinderjoy: ");
    	sn.price = scan.nextInt();
    	
    	
    	System.out.println("Sort By Option:");
    	System.out.println("1.Size\n2.Name\nEnter your choice: ");
    	int op = scan.nextInt();
    	int dm = dh.display();
    	int ss = sn.display();
    	ArrayList<String> ch = new ArrayList<String>();
    	if(op==1) {
    		if(dm>ss){
        		ch.add("fivestar");
        		ch.add("kinderjoy");
        	}
        	else{
        		ch.add("kinderjoy");
        		ch.add("fivestar");
        	}
        	System.out.println(ch+"\n\n");
    	}
    	else if(op==2) {
    		ch.add("kinderjoy");
    		ch.add("fivestar");
    		Collections.sort(ch);
    		System.out.println(ch);
    	}
    	else {
    		System.out.println("Invalid Input");
    		return;
    	}
    	
    	tw_choco = dh.total_w(dq) + sn.total_w(sq);
    	System.out.println(tw_choco +" Grms");
    	
    	tc_choco = dh.total_p(dq) + sn.total_p(sq);
    	System.out.println(tc_choco +" Rc.");
	}
	
}

