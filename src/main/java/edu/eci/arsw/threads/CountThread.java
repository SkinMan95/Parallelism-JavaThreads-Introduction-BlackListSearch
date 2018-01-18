/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author SkinMan95
 */
public class CountThread implements Runnable {

    public int begin, end;
    
    public CountThread(int beg, int end) {
        this.begin = beg;
        this.end = end;
    }
    
    @Override
    public void run() {
        for(int i = this.begin ; i < this.end ; i++) {
            System.out.println(i);
        }
    }
    
}
