package com.AbdullahBarudgar.Internshala_Assignment_3;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cake brownieCake = new Cake();
        brownieCake.setCakeName("Chocolate Brownie");
        brownieCake.setCakePrice(250);

        Cake mapleCake = new Cake();
        mapleCake.setCakeName("Chocolate Maple");
        mapleCake.setCakePrice(300);

        List<Cake> cakeList = new ArrayList<>();
        cakeList.add(brownieCake);
        cakeList.add(mapleCake);

        // List of Today's Special Pastries
        Pastry blackForestPastry = new Pastry();
        blackForestPastry.setCakeName("Black Forest");
        blackForestPastry.setCakePrice(35);

        Pastry chocoTrufflePastry = new Pastry();
        chocoTrufflePastry.setCakeName("Choco Truffle");
        chocoTrufflePastry.setCakePrice(40);

        List<Pastry> pastryList = new ArrayList<>();
        pastryList.add(blackForestPastry);
        pastryList.add(chocoTrufflePastry);

        System.out.println("         Today's Special Menu");
        System.out.println("-----------------------------------------");

        System.out.println();
        System.out.println("  Special Cakes");
        System.out.println("  -------------------------------");

        for (Cake cake: cakeList) {
            cake.display();
        }

        System.out.println();
        System.out.println("  Special Pastries");
        System.out.println("  -------------------------------");

        for (Pastry pastry: pastryList) {
            pastry.display();
        }
    }
}
