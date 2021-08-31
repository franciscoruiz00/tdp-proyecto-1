package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	try {
            		 Student estud = new Student(121666,"Ruiz Gomez","Francisco","franciscoruizg00@hotmail.com","https://github.com/franciscoruiz00","/images/imagen.jpg");
            				SimplePresentationScreen window = new SimplePresentationScreen(estud);
            		 window.setVisible(true);
            	}catch (Exception e) {
            	e.printStackTrace();
            	}
            }
        });
    }
}