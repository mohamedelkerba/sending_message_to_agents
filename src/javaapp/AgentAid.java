/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;

import jade.core.Agent;

/**
 *
 * @author Mohammed
 */
public class AgentAid  extends Agent {
    protected void setup(){
        String local = getAID().getLocalName();
        System.out.println("the local name  : "+ local );
        
        
        String global = getAID().getName();
        System.out.println("the GUID   :"+ global);
    }
}
