/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;

import jade.core.behaviours.Behaviour;

/**
 *
 * @author MUhammad
 */
public class behavior  extends Behaviour{

     @Override
    public void action() {
        System.out.println("behavior 1");
    }

    @Override
    public boolean done() {
   
      return false;
   
    }
    
}
