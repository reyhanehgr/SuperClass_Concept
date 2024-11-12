
package com.mycompany.mavenproject5;


public class Circle extends Shape {
    private double radius;
    public Circle(){
        super();
        this.radius=0;
        
    }
    public Circle (double r){
        super();
        this.radius=r;
    }
    public Circle (double r, String color, boolean filled){
        super(color , filled);
        this.radius=r;
    }
    public double get_radius(){
        return this.radius;
    }
    public void set_radius(double r){
        this.radius=r;
    }
    public double get_area(){
        return Math.PI*this.radius*this.radius;
    }
    public double get_perimeter(){
        return 2*Math.PI*this.radius;
    }
    @Override
    public String toString(){
     return String.format("Circle Shape [Radius = " +this.radius + ", color = %s , filled = %s , Area = %s]", this.get_color(), this.get_filled(), this.get_area());
    }
}
