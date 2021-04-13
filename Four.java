import java.util.Scanner;



public class Four extends Second implements InterMethods{
	@Override
    public void loanDetails() {
        if (eligibility == 1) {
            System.out.println("Enter the loan Amount");
            Scanner sc = new Scanner(System.in);
            loanAmount = sc.nextInt();
            System.out.println("Enter the tenure in months");
            tenure = sc.nextInt();
            principal =loanAmount;
            System.out.println(principal);
            System.out.println("Select the interest rate method you need ");
            System.out.println("1. Flat Rate Method");
            System.out.println("2. Reducing Balance Method");
            selectMethod = sc.nextInt();

            if (selectMethod == 1) {
            	try
            	{
                totalInterestPayable = (principal * tenure * rateInPercent) / 100;
                EMI = (principal + totalInterestPayable) / tenure;
                System.out.println("Interest :"+EMI);
                System.out.println("Total Amount :"+(principal+EMI));
                print = 1;
            	}catch(ArithmeticException e)
            	{
            		System.out.println(e);
            	}


            } else if (selectMethod == 2) {
            	try
            	{
                EMI =( (principal * rateInPercent * (1 + rateInPercent) ^ tenure) / ((1 + rateInPercent) ^ (tenure - 1)));
            	System.out.println("Interest :"+EMI);
                System.out.println("Total Amount :"+principal+EMI);
                print = 1;
            	}catch(ArithmeticException e)
            	{
            		System.out.println(e);
            	}
            	
            } else {
                System.out.println("Invalid option");
            }


        }

    }

    public void endMessage() {
        if (print == 1) {
            System.out.println("Your Loan will be Disbursed within 24 hours");
            System.out.println("Have a nice day");
        }
    }
}
