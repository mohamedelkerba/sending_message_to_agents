/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author Mohammed
 */
public class reciever extends Agent{
 
    protected void setup(){
        System.out.println("Agent reciever");
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage a = receive();
                if(a != null){
                String content = a.getContent();
                System.out.println("The content is :" + content);
                System.out.println("The sender is :" + a.getSender());
                }
                }
        });
    }
}
