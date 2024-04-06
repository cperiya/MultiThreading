/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadsinjava;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author HP PC
 */
public class Thread1 extends Thread{ // implements Runnable {

    
    static List<String> filePaths = new ArrayList<>(){{
        add("D:\\NEU\\Sem1\\INFO\\Lab sessions\\ThreadsInJava\\src\\Sounds\\do.wav");
        add("D:\\NEU\\Sem1\\INFO\\Lab sessions\\ThreadsInJava\\src\\Sounds\\mi.wav");
        add("D:\\NEU\\Sem1\\INFO\\Lab sessions\\ThreadsInJava\\src\\Sounds\\sol.wav");
        add("D:\\NEU\\Sem1\\INFO\\Lab sessions\\ThreadsInJava\\src\\Sounds\\si.wav");
        add("D:\\NEU\\Sem1\\INFO\\Lab sessions\\ThreadsInJava\\src\\Sounds\\do-octave.wav");
    }};
    @Override
    public void run() {

        try {

            FilePlayer fp = new FilePlayer();
            Thread.sleep(1000);
            System.out.print("do");
            fp.play(filePaths.get(0));       
            Thread.sleep(1000);
            Thread.sleep(1000);
            System.out.print(" mi");
            fp.play(filePaths.get(1));           
            Thread.sleep(1000);
            Thread.sleep(1000);
            System.out.print(" sol");
            fp.play(filePaths.get(2));           
            Thread.sleep(1000);
            Thread.sleep(1000);
            System.out.print(" si");
             fp.play(filePaths.get(3));             
            Thread.sleep(1000);
            System.out.print(" do-octave1");
             fp.play(filePaths.get(4));
             
             //bonus question
            System.out.println("\n Bonus Question");
            Thread.sleep(1000);
            System.out.print("do");
            fp.play(filePaths.get(0));       
            Thread.sleep(1000);
            System.out.print(" do");
            fp.play(filePaths.get(0)); 
            Thread.sleep(1000);
            System.out.print(" sol");
            fp.play(filePaths.get(2));           
            Thread.sleep(1000);
            System.out.print(" sol");
            fp.play(filePaths.get(2)); 
            Thread.sleep(3000);
            System.out.print(" sol");
            fp.play(filePaths.get(2)); 
            Thread.sleep(3000);           
            System.out.print(" mi");
            fp.play(filePaths.get(1)); 
            Thread.sleep(1000);           
            System.out.print(" mi");
            fp.play(filePaths.get(1)); 
            Thread.sleep(3000);
            System.out.print(" do\n");
            fp.play(filePaths.get(0)); 
            Thread.sleep(1000); 
            //line 2
            System.out.print("sol");
            fp.play(filePaths.get(2));           
            Thread.sleep(1000);
            System.out.print(" sol");
            fp.play(filePaths.get(2)); 
            Thread.sleep(4000);
            System.out.print(" mi");
            fp.play(filePaths.get(1)); 
            Thread.sleep(1000);           
            System.out.print(" mi");
            fp.play(filePaths.get(1));
            Thread.sleep(2000);
            System.out.print(" sol");
            fp.play(filePaths.get(2)); 
            Thread.sleep(1000);
            System.out.print(" sol");
            fp.play(filePaths.get(2)); 
            Thread.sleep(4000);           
            System.out.print(" mi");
            fp.play(filePaths.get(1)); 
            Thread.sleep(1000);           
            System.out.print(" mi");
            fp.play(filePaths.get(1)); 
            Thread.sleep(4000);
            
            //line 3
            System.out.print("do");
            fp.play(filePaths.get(0));       
            Thread.sleep(1000);
            System.out.print(" do");
            fp.play(filePaths.get(0)); 
            Thread.sleep(1000);
            System.out.print(" sol");
            fp.play(filePaths.get(2));           
            Thread.sleep(1000);
            System.out.print(" sol");
            fp.play(filePaths.get(2)); 
            Thread.sleep(3000);
            System.out.print(" sol");
            fp.play(filePaths.get(2)); 
            Thread.sleep(3000);           
            System.out.print(" mi");
            fp.play(filePaths.get(1)); 
            Thread.sleep(1000);           
            System.out.print(" mi");
            fp.play(filePaths.get(1)); 
            Thread.sleep(3000);
            System.out.print(" do\n");
            fp.play(filePaths.get(0)); 
            Thread.sleep(1000); 
//            for (int i = 1; i <= 100; i++) {
//                fp.play("D:\\NEU\\Sem1\\INFO\\Lab sessions\\ThreadsInJava\\src\\Sounds\\do.wav");
//            }
//            System.out.println("do");
//            Thread.sleep(1000);
//            
//            for (int i = 1; i <= 100; i++) {
//                fp.play("D:\\NEU\\Sem1\\INFO\\Lab sessions\\ThreadsInJava\\src\\Sounds\\mi.wav");
//            }
//            System.out.println("mi");
//            Thread.sleep(1000);
               
        } catch (Exception e){
            
        }

    }

}
