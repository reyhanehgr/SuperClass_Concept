 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author PC
 */
public class Shape {
    private String color;
    private boolean filled;
    
    public Shape(){
        this.color="";
        this.filled=false; 
    }
    public Shape(String color , boolean filled){
        this.color=color;
        this.filled=filled;
        
    }
    public String get_color(){
        return this.color;
    }
    public void set_color(String color){
        this.color=color;
    }
    public boolean get_filled(){
       return this.filled;
    }
    public void set_filled(boolean filled){
        this.filled=filled;
    }
    public void fill(){
        this.set_filled(true);   
    }
    public void unfill(){
        this.set_filled(false);   
    }
    
    @Override
    public String toString(){
     return String.format("Shape [color = %s , filled = %s]", this.color, this.filled);
    }
}
