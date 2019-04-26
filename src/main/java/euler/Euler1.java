package euler;

public class Euler1 {

    /**
     * https://projecteuler.net/problem=1
     * @return sum
     */
    public static int multiply3And5() {
        int sum = 0;

        for (int i = 1; i < 1000; i++)
        {
            if (i % 3 == 0 || i % 5 == 0)
            {
                sum = sum + i;


            }
        }
        return sum;
    }
}

