/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

/**
 *
 * @author PC
 */
public class Mavenproject5 {

    public static void main(String[] args) {
        Shape shape1=new Shape("yellow" ,true);
        Shape shape2=new Shape("pink" ,false);
        
        System.out.format("Shape1 : %S \n", shape1);
        System.out.format("Shape2 : %S \n", shape2);
        
        
        Circle circle1 = new Circle(10 , "Blue", false);
        Circle circle2 = new Circle(4 , "Red", true);
        
        System.out.format("Circle1 : %S \n", circle1);
        System.out.format("Circle2 : %S \n", circle2);
        
        
        Rectangle rectangle1 = new Rectangle(3,4,"Green",true);
        Rectangle rectangle2 = new Rectangle(2,5,"Cyan",false);
        
        System.out.format("Rectangle1 : %S \n", rectangle1);
        System.out.format("Rectangle2 : %S \n", rectangle2);
    }
}
