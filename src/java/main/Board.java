import java.util.Scanner;
import java.util.Random;
import java.lang.IllegalArgumentException


public class Board {

    public void setUp() {

        whoGoesFirst();







    }


    public static void whoGoesFirst() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type begin to roll a dice and decide who goes first");
        String begin = scanner.next();

        if (!(begin.toLowerCase().equals("begin"))) {

            throw new IllegalArgumentException("please type begin");

        }


    }


}