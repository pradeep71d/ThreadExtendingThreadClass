package com.example.thread;

public class ThreadDemo extends Thread { // creating thread by extending thread class.
    public void run(){ // this is default method in thread,compulsory.
        System.out.println("Thread is running");
    }
}
