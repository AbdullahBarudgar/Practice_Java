package com.AbdullahBarudgar.Internshala_Assignment_3;

/* Problem Statement: Mr. Sharma owns a bakery shop and is quite popular for baking
variety of cakes and pastries. Each day he comes up with Today’s Special Menu that
includes two special cakes and two special pastries. He prepares Today’s Special
Menu every day and puts it for the display. But with every passing day, it has become
painful for Mr. Sharma to prepare the handwritten menu.
Let’s help Mr. Sharma by writing a small Java program that prints the menu in this
format.
 */

public class Cake {

private String cakeName;
private float  cakePrice;

    public void setCakeName(String cakeName) {
        this.cakeName=cakeName;
    }

    public void setCakePrice(float cakePrice) {
        this.cakePrice = cakePrice;
    }

    public String getCakeName() {
        return cakeName;
    }

    public float getCakePrice() {
        return cakePrice;
    }

    public void display(){
        System.out.println(getCakeName()+": "+getCakePrice()+"per pound");
    }

}
