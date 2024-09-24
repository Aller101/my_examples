/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patterns;

/**
 *
 * @author alekseynesterov
 */
public class FactoryImpl implements Factory{

    @Override
    public Car create(String modelCar) throws Exception {
        switch(modelCar.toLowerCase()){
            case "lada" -> {
                return new Lada();
            }
            case "gaz" -> {
                return new Gaz();
            }
            default -> throw new Exception();
        }
    }
    
}

interface Factory {
    Car create(String modelCar) throws Exception;
}

interface Car{
    void drive();
}

class Lada implements Car{

    @Override
    public void drive() {
        System.out.println("drive Lada");
    }
    
}

class Gaz implements Car{

    @Override
    public void drive() {
        System.out.println("drive Gaz");
    }
    
}
