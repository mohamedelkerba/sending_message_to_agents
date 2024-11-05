/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;

import jade.core.Agent;

public class agent1  extends Agent{
    @Override
protected void setup() {
     System.out.println("agent 1 created");
     
//     behavior b = new behavior();
//        addBehaviour(b);
//   

//     behavior2 b2 = new behavior2();
//        addBehaviour(b2);


//     oneshot o1= new oneshot();
//        addBehaviour(o1);
    
//cyclic c1 = new cyclic();
//        addBehaviour(c1);


//  waker w1 = new waker(this, 10000);
//        addBehaviour(w1);

ticker t1 = new ticker(this, 10000);
        addBehaviour(t1);
}
}
