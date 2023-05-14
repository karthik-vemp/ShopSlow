import java.util.Scanner;
import java.util.*;
public class Tester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Brands b = new Brands();
        System.out.println("Gender:");
        String gender = input.nextLine();
        System.out.println("Price:");
        int price = input.nextInt();
        input.nextLine();
        System.out.println("From these attributes, pick 5");
        System.out.println("Sustainable Materials\nBasics\nCasual\nSize Inclusive\nCarbon Neutral\nColorful Designs\nQuality\nEthical Production\nCharity Driven”);
        System.out.println("Work Friendly\nCute Designs\nAccessories\nPatterns and Prints\nSweaters\nFootwear\nLong-Lasting\nVintage\nRecycled Materials”);
        System.out.println("Denim\nFancy\nSwimwear\nOrganic”);
        System.out.println("Atribute number 1:");
        String atr1 = input.nextLine();
        System.out.println("Atribute number 2:");
        String atr2 = input.nextLine();
        System.out.println("Atribute number 3:");
        String atr3 = input.nextLine();
        System.out.println("Atribute number 4:");
        String atr4 = input.nextLine();
        System.out.println("Atribute number 5:");
        String atr5 = input.nextLine();
        System.out.println(b.run(atr1, atr2, atr3, atr4, atr5, gender, price));
        
    }

}
