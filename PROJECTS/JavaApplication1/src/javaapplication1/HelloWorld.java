/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.event;

import javax.swing;

public class HelloWorld {
import java.awt.event;

import javax.swing;

public class HelloWorld {

public static void main(String[] args) {

JFrame frame = new JFrame("Hello World!");

frame.setSize(220, 200);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

Container contentPane = frame.getContentPane();

contentPane.setLayout(null);

JButton button = new JButton("Hello World!");

button.setLocation(30, 30);

button.setSize(150, 100);

contentPane.add(button);

frame.setVisible(true);

}

}
public class MenuExample {

public static void main(String[] args) {

JFrame frame = new JFrame("My Frame");

frame.setDefaultCloseOperation(
JFrame.EXIT_ON_CLOSE);

JMenu fileMenu = new JMenu("File");

fileMenu.add(new JMenuItem("New"));

fileMenu.add(new JMenuItem("Open"));

fileMenu.add(new JMenuItem("Close"));

JMenu editMenu = new JMenu("Edit");

editMenu.add(new JMenuItem("Undo"));

editMenu.add(new JMenuItem("Redo"));

editMenu.add(new JMenuItem("Cut"));

JMenuBar menubar = new JMenuBar();

menubar.add(fileMenu);

menubar.add(editMenu);

frame.setJMenuBar(menubar);

frame.setVisible(true);

} }
    }
    
}
