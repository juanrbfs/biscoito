package timetabling;

import java.util.Scanner;

import javax.swing.UIManager;

import timetabling.container.Window;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Main {
	
    private static void createAndShowGUI() {
    	
        //Create and set up the window.
        JFrame frame = new JFrame("Timetabling Problem");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window windown = new Window();
        
        //Set up the content pane.
        windown.addComponentsToPane(frame.getContentPane());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
	
	 public static void main(String[] args) {
		 
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	            	UIManager.put("swing.boldMetal", Boolean.FALSE);
	            	createAndShowGUI();
	                 
	            }
	        });
	 }
}