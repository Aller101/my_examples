/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testdocker;

import java.time.LocalDateTime;




/**
 *
 * @author alekseynesterov
 */
public class TestTimerForDockerApp {
    
    public static void main(String[] args) throws InterruptedException {
        while(true){
            System.out.println("Now is: " + 
                    LocalDateTime.now().getMinute() + " min " +
                    LocalDateTime.now().getSecond() + " sec ");
            System.out.println("- - -");
            Thread.sleep(1000);
        }
    }
   
}
