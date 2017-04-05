package src.timetabling.container;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class FileChooser extends JPanel  {
	
	static private final String newline = "\n";
	JButton openButton, saveButton;
    JTextArea log;
	JFileChooser fc;
	JPanel middlePanel;
	
    public FileChooser() {
    	middlePanel = new JPanel ();
        middlePanel.setBorder( new TitledBorder ( new EtchedBorder (), "Log" ) );
        middlePanel.setLayout(new BoxLayout(middlePanel, BoxLayout.Y_AXIS));
        
        
        //Create the log first, because the action listeners
        //need to refer to it.
        
        Flags.LOG  = new JTextArea(15,20);
        Flags.LOG.setMargin(new Insets(5,5,5,5));
        Flags.LOG.setEditable(false);
        JScrollPane logScrollPane = new JScrollPane(Flags.LOG);
        
        logScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        //Add Textarea in to middle panel
        middlePanel.add ( logScrollPane );
    	

        //Create a file chooser
        fc = new JFileChooser();
 
        //Uncomment one of the following lines to try a different
        //file selection mode.  The first allows just directories
        //to be selected (and, at least in the Java look and feel,
        //shown).  The second allows both files and directories
        //to be selected.  If you leave these lines commented out,
        //then the default mode (FILES_ONLY) will be used.
        //
        //fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
 
        //Create the open button.  We use the image from the JLF
        //Graphics Repository (but we extracted it from the jar).
        openButton = new JButton("Open a File...",
                                 createImageIcon("images/Open16.gif"));
        //openButton.addActionListener(this);
 
        //Create the save button.  We use the image from the JLF
        //Graphics Repository (but we extracted it from the jar).
        saveButton = new JButton("Save a File...",
                                 createImageIcon("images/Save16.gif"));
        //saveButton.addActionListener(this);
 
        //For layout purposes, put the buttons in a separate panel
        JPanel buttonPanel = new JPanel(); //use FlowLayout
        buttonPanel.add(openButton);
        buttonPanel.add(saveButton);
        
    }
 
    
    
    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = FileChooser.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    
    public JButton getSalvar(){
    	return saveButton;
    }
    
    public JButton getCarregar(){
    	return openButton;
    }
 
    public JPanel getPanel(){
    	return middlePanel;
    }
   
  //Handle save button action.
    public void salvarArquivo(JButton button){  
  	  button.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e){}
        	
        });
  	  }
        
    public void openArquivo(JButton button){  
    	  button.addActionListener(new ActionListener() {

    		  @Override
    	        public void actionPerformed(ActionEvent e){}
    	        	
    	        });
    }
}