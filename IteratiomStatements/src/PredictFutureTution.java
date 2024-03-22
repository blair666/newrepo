/*
3: Predict Future Tuition
Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year.
In how many years will the tuition be doubled?

Year
Tuition
0
$10,000
1
tuition = 1.07 * tuition
…
tuition = 1.07 * tuition
…
tuition = 1.07 * tuition
…
…
?
$20,000 or more

*/
public class PredictFutureTution
{
    public static void main(String[] args)
    {
        double tuition = 10000;
        double tar = 20000;
        int years = 0;

        while(tuition < tar)
        {
            tuition = 1.07 * tuition;
            years++;
        }

        System.out.println("In " + years + " years, the tuition will be doubled.");
    }

}
