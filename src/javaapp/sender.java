/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author Mohammed
 */
public class sender extends Agent{
    
    protected void setup(){
        System.out.println("the Aid id "+getAID().getLocalName());
         ACLMessage acl = new ACLMessage();
         acl.addReceiver(new AID("reciever", true));
         acl.setContent("Welcome to my project");
         acl.setPerformative(ACLMessage.INFORM);
         
         
         send(acl);
       
    }
}
