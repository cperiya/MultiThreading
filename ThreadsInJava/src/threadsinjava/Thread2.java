/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadsinjava;

import java.util.ArrayList;
import java.util.List;
import static threadsinjava.Thread1.filePaths;

/**
 *
 * @author HP PC
 */
public class Thread2 extends Thread {

        static List<String> filePaths = new ArrayList<>(){{
        add("D:\\NEU\\Sem1\\INFO\\Lab sessions\\ThreadsInJava\\src\\Sounds\\re.wav");
        add("D:\\NEU\\Sem1\\INFO\\Lab sessions\\ThreadsInJava\\src\\Sounds\\fa.wav");
        add("D:\\NEU\\Sem1\\INFO\\Lab sessions\\ThreadsInJava\\src\\Sounds\\la.wav");
        add("D:\\NEU\\Sem1\\INFO\\Lab sessions\\ThreadsInJava\\src\\Sounds\\do-octave.wav");
        }};
        
        
        
    @Override
    public void run() {
//        for (int i = 1001; i <= 2000; i++) {
//            System.out.println(i);
//        }

        try {

            FilePlayer fp = new FilePlayer();
            Thread.sleep(2000);            
            System.out.print(" re");
            fp.play(filePaths.get(0));
            Thread.sleep(2000);            
            System.out.print(" fa");
            fp.play(filePaths.get(1));            
            Thread.sleep(2000);            
            System.out.print(" la");
            fp.play(filePaths.get(2));            
            Thread.sleep(2000);            
           System.out.print(" do-octave");
           fp.play(filePaths.get(3));
           

           //bonus question
           //mi, sol, si, do-octave
           Thread.sleep(5000);        
            System.out.print(" la");
            fp.play(filePaths.get(2));
            Thread.sleep(1000);
            System.out.print(" la");
            fp.play(filePaths.get(2));
            Thread.sleep(2000);        
            System.out.print(" fa");
            fp.play(filePaths.get(1));
            Thread.sleep(1000);
            System.out.print(" fa");
            fp.play(filePaths.get(1));
            Thread.sleep(3000);
            System.out.print(" re");
            fp.play(filePaths.get(0)); 
            Thread.sleep(1000);
            System.out.print(" re");
            fp.play(filePaths.get(0)); 
            
            //line 2
            Thread.sleep(4000);        
            System.out.print(" fa");
            fp.play(filePaths.get(1));
            Thread.sleep(1000);
            System.out.print(" fa");
            fp.play(filePaths.get(1));
            Thread.sleep(4000);
            System.out.print(" re");
            fp.play(filePaths.get(0)); 
            Thread.sleep(4000);        
            System.out.print(" fa");
            fp.play(filePaths.get(1));
            Thread.sleep(1000);
            System.out.print(" fa");
            fp.play(filePaths.get(1));
            Thread.sleep(3000);
            System.out.print(" re \n");
            fp.play(filePaths.get(0)); 
            
            //line 3
            Thread.sleep(7000);        
            System.out.print(" la");
            fp.play(filePaths.get(2));
            Thread.sleep(1000);
            System.out.print(" la");
            fp.play(filePaths.get(2));
            Thread.sleep(2000);        
            System.out.print(" fa");
            fp.play(filePaths.get(1));
            Thread.sleep(1000);
            System.out.print(" fa");
            fp.play(filePaths.get(1));
            Thread.sleep(3000);
            System.out.print(" re");
            fp.play(filePaths.get(0)); 
            Thread.sleep(1000);
            System.out.print(" re");
            fp.play(filePaths.get(0)); 

        } catch (Exception e){
            
        }
    }
    
}
