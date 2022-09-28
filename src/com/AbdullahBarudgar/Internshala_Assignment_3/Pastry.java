package com.AbdullahBarudgar.Internshala_Assignment_3;

public class Pastry extends Cake{

    @Override
    public void display() {
        System.out.println(getCakeName()+": "+getCakePrice()+" per piece");
    }
}
