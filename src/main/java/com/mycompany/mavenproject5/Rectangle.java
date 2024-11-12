
package com.mycompany.mavenproject5;

public class Rectangle extends Shape {
    private double width;
    private double heigh;
    
    public Rectangle(){
        super();
        this.heigh=0;
        this.width=0;
    }
    public Rectangle(double w, double h){
        super();
        this.heigh=h;
        this.width=w;
    }
    public Rectangle(double w, double h, String color, boolean filled){
        super(color , filled);
        this.heigh=h;
        this.width=w;
    }
    public double get_width(){
        return this.width;
    }
    public void set_width(double w){
        this.width=w;
    }
    public double get_heigh(){
        return this.heigh;
    }
    public void set_heigh(double h){
        this.heigh=h;
    }
    public double get_area(){
        return this.heigh*this.width;
    }
    public double get_perimeter(){
        return 2*(this.heigh+this.width);
    }
    @Override
    public String toString(){
     return String.format("Rectangle Shape [size = " + this.get_heigh() + "*"+ this.get_width() + ", color = %s , filled = %s , Area = %s]",this.get_color(), this.get_filled(), this.get_area());
    }
}
