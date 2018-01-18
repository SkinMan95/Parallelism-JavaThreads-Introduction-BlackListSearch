/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

import java.util.ArrayList;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static final int NUM_THREADS = 3;
    public static final int INTERVAL = 300;
    
    public static void main(String a[]){
        ArrayList<Runnable> threads = new ArrayList<Runnable>();
        
        for(int i = 0; i < NUM_THREADS ; i++) {
            threads.add(new CountThread(i*INTERVAL/NUM_THREADS, (i+1)*(INTERVAL/NUM_THREADS)));
            System.out.println("Intervalos: " + i*INTERVAL/NUM_THREADS + " " + (i+1)*(INTERVAL/NUM_THREADS));
        }
        
        for(Runnable r : threads) {
            Thread t = new Thread(r);
            t.start();
        }
        
    }
    
}
