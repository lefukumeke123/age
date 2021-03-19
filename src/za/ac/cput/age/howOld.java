package za.ac.cput.age;

import java.util.Scanner;

public class howOld {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int myAge = 0;




        System.out.println("How old are you");

        myAge = sc.nextInt();

        int momAge = myAge *  2;
        int dadAge = momAge + 5;
        int all = myAge + momAge + dadAge;

        System.out.println( " Your mom is "  + momAge + "  years Old" );
        System.out.println( " Your dad is "  + dadAge + "  years Old" );



        System.out.println("When we add all of your ages  its " + all);


    }
}
