package Calculatorr;

import java.util.Scanner;

public class DemoRun {
	public static  void main(String[] args){
	AdvanceCalc obj = new AdvanceCalc();
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enteryour first number");
	  double i = sc.nextDouble();
	  System.out.println("enteryour seccond number");
	  double j = sc.nextDouble();
	  
	  System.out.println("what do yor want to do\n (add,subtract,multi,divide,table)");
	 
        char select = sc.next().charAt(0);
		Double res= 0.0;
		switch (select) {
		
		case 'a':
			res = obj.add(i, j);
			break;
		case 's':
			res = obj.sub(i, j);
			break;
		case 'm':
			res = obj.multi(i, j);
			break;
		case 'd':
			res = obj.div(i, j);
			break;
			
		case 't':
			res = obj.tableOfNumber(i, j);
			break;
			
			default :
				System.out.println("Wrong selection");
		}
		System.out.print(res);
	}
}

	
