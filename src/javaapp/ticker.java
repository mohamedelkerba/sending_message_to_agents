/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

/**
 *
 * @author Mohammed
 */
public class ticker extends TickerBehaviour{

    public ticker(Agent a, long period) {
        super(a, period);
    }

    @Override
    protected void onTick() {
        System.out.println("Ticker Behavior");
    }
    
}
