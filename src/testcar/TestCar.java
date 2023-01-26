/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package testcar;

/**
 *
 * @author Tanya Chowdhary
 */
public class TestCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Car c2=new Car("Red", "Lexus");
        
        Car c2=new Car("Red","Lexus");
        
        System.out.println("The colour of the car is " + c2.getColour()+ ".");
        System.out.println("The model of the car is " + c2.getModel()+ ".");
             
        
        
          Car c3=new Car("Blue", "BMW");
        
        System.out.println("The colour of the car is " + c3.getColour()+ ".");
        System.out.println("The model of the car is " + c3.getModel()+ ".");
        
    }

}
