/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patterns;


/**
 *
 * @author alekseynesterov
 */
public class Main {
    public static void main(String[] args) throws Exception {
        
        //factory
        Factory factory = new FactoryImpl();
        Car lada = factory.create("GAZ");
        lada.drive();
    }
}
