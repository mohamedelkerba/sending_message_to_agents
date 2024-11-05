/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;

import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;

/**
 *
 * @author Mohammed
 */
public class waker extends WakerBehaviour{
    
    public waker(Agent a, long timeout) {
        super(a, timeout);
    }
     protected void handleElapsedTimeout() {
     
         System.out.println("waker behavior ");
    }
}
