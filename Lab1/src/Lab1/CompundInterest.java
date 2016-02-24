package Lab1;

import java.util.Scanner;
import java.lang.Math;

public class CompundInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Input the annual interest rate: ");
		double workReturn = input.nextDouble();
		do{
			if(workReturn > 20 || workReturn < 0){
				System.out.println("Please enter a rate between 0% and 20%: ");
				workReturn = input.nextDouble();
			}
		}while(workReturn > 20 || workReturn < 0);
		
		
		System.out.println("Input the number of years that you will be working: ");
		double yearsWork = input.nextDouble();
		
		System.out.println("Input the number of years you plan on being retired: ");
		double yearsRetired = input.nextDouble();
		
		System.out.println("Input the annual return during your retirement: ");
		double retireReturn = input.nextDouble();
		do{
			if(retireReturn > 3 || retireReturn < 0){
				System.out.println("Please enter a rate between 0% and 3%: ");
				retireReturn = input.nextDouble();
			}
		}while(retireReturn > 3 || retireReturn < 0);
		
		System.out.println("Input the required income while retired: ");
		double requiredIncome = input.nextDouble();
		
		System.out.println("Input the monthly SSI you'll get: ");
		double monthlySSI = input.nextDouble();
		
		//This finds the difference between the required income and the monthly SSI.
		double retirementDraw = requiredIncome - monthlySSI; 
		
		// This will find the amount that needs to be saved.
		double needSaved = (int) (requiredIncome-monthlySSI)*((1-(1/(Math.pow(1+(retireReturn/100)/12,yearsRetired*12 )))))/((retireReturn/100)/12);
		System.out.printf("The total amount you need to save is %10.2f\n",needSaved);
        double SaveMonthly = needSaved*(((workReturn/100)/12)/((Math.pow(1+(workReturn/100)/12, yearsWork*12))-1));
        System.out.printf("The amount you need to save per month while working is %5.2f\n",SaveMonthly);

	}
}
