/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Constructor;

/**
 *
 * @author ATIK
 */
public class Car {
    int modelYear;
    String modelName;
    
    public Car(int year , String name) {
        modelYear = year;
        modelName = name;
    }
    
    public static void main(String[] args) {
        Car myCar = new Car(1969, "Mustang");
        System.out.println(myCar.modelYear + "" + myCar.modelName);    }
    
 
}
