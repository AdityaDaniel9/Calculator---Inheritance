package Calculatorr;

public class AdvanceCalc extends Calc {
	
	public double multi(double n1 ,double n2) {
		return n1*n2;
	}
	public double div(double n1 ,double n2) {
		return n1/n2;
	}
	public double tableOfNumber(double n1 ,double n2) {
		
		for(int i=0;i <=10;) {
			
			
		  n1 = n1*i;
		 n2 = n2*i;
		}
		return n1 + n2;
		
	}


}
