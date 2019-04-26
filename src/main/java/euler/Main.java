package euler;

import com.github.javafaker.Faker;

public class Main {

    public static void main(String[] args){
        Euler1.multiply3And5();

        Faker a = new Faker();
        System.out.println(a.name().firstName());
    }

}
