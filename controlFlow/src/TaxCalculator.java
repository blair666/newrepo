import java.util.Scanner;

public class TaxCalculator {

        public static void main(String[] args) {
        /*
        7. Create a program that lets the users input their filing status and income.
        Display how much tax the user would have to pay according to status and income.
The U.S. federal personal income tax is calculated based on the filing status and taxable income.
There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.
The tax rates for 2009 are shown below.
*/


            System.out.println("**** Q7 ****\n");
            System.out.println("Welcome to use Tax Rate System! \nHere is the filling status menu: ");
            System.out.println("1. Single");
            System.out.println("2. Married Filing Jointly");
            System.out.println("3. Married Filing Separately");
            System.out.println("4. Head of Household");
            System.out.println("Enter number of your filing status from above: ");

            int num;
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            String output;
            double paytax = 0;


            switch (num) {

                case 1:
                    output = "Single";
                    System.out.print("Enter your taxable income: $");
                    double income = sc.nextDouble();
                    if(income>= 0 && income<=8350)
                    {
                        paytax = income * 0.10;
                    }else if(income>=8351 && income<=33950)
                    {
                        paytax = income * 0.15;
                    }else if(income>=33951 && income<=82250)
                    {
                        paytax = income * 0.25;
                    }else if(income>=82251 && income<=171550)
                    {
                        paytax = income * 0.28;
                    }else if(income>=171551 && income<=372950)
                    {
                        paytax = income * 0.33;
                    }else if(income>=372951)
                    {
                        paytax = income * 0.35;
                    }
                    break;
                case 2:
                    output = "Married Filing Jointly";
                    System.out.print("Enter your taxable income: $");
                    double married_income = sc.nextDouble();
                    if(married_income>= 0 && married_income<=16700)
                    {
                        paytax =  married_income * 0.10;
                    }else if(married_income>=16701 && married_income<=67900)
                    {
                        paytax = married_income * 0.15;
                    }else if(married_income>=67901 && married_income<=137050)
                    {
                        paytax = married_income * 0.25;
                    }else if(married_income>=137051 && married_income<=208850)
                    {
                        paytax = married_income * 0.28;
                    }else if(married_income>=208851 && married_income<=372950)
                    {
                        paytax = married_income * 0.33;
                    }else if(married_income>=372951)
                    {
                        paytax = married_income * 0.35;
                    }
                    break;
                case 3:
                    output = "Married Filing Separately";
                    System.out.print("Enter your taxable income: $");
                    double married_sep_income = sc.nextDouble();
                    if(married_sep_income>= 0 && married_sep_income<=8350)
                    {
                        paytax = married_sep_income * 0.10;
                    }else if(married_sep_income>=8351 && married_sep_income<=33950)
                    {
                        paytax =  married_sep_income * 0.15;
                    }else if(married_sep_income>=33951 && married_sep_income<=68525)
                    {
                        paytax = married_sep_income * 0.25;
                    }else if(married_sep_income>=68526 && married_sep_income<=104425)
                    {
                        paytax =  married_sep_income * 0.28;
                    }else if(married_sep_income>=104426 && married_sep_income<=186475)
                    {
                        paytax =  married_sep_income * 0.33;
                    }else if(married_sep_income>=186476)
                    {
                        paytax = married_sep_income * 0.35;
                    }
                    break;
                case 4:
                    output = "Head of Household";
                    System.out.print("Enter your taxable income: $");
                    double hoh_income = sc.nextDouble();
                    if(hoh_income>= 0 && hoh_income<=11950)
                    {
                        paytax = hoh_income * 0.10;
                    }else if(hoh_income>=11951 && hoh_income<=45550)
                    {
                        paytax = hoh_income * 0.15;
                    }else if(hoh_income>=45501 && hoh_income<=117450)
                    {
                        paytax = hoh_income * 0.25;
                    }else if(hoh_income>=117451 && hoh_income<=190200)
                    {
                        paytax = hoh_income * 0.28;
                    }else if(hoh_income>=190201 && hoh_income<=372950)
                    {
                        paytax = hoh_income * 0.30;
                    }else if(hoh_income>=372951)
                    {
                        paytax = hoh_income * 0.35;
                    }
                    break;
                default:
                    output = "Invalid Status.";
                    break;


            }
            System.out.println("Your filing status: " + output);
            System.out.println("Your tax amount: $" + paytax);

        }
}
