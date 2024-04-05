/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.basica;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author dam1
 */
public class CalculadoraBasica extends JFrame implements ActionListener {
    JButton botonSumar, botonRestar;
    JTextField numerandoUno, numerandoDos;
    JTextArea resultado;
    int op1, op2, res;
    
    public CalculadoraBasica(){
    super("Calculadora");
        setLayout(new FlowLayout());
        
        numerandoUno = new JTextField(10);
        numerandoDos = new JTextField(10);
        resultado = new JTextArea(1,10);
        add(new Label("Nº1"));
        add(numerandoUno);
       // add(Box.createHorizontalStrut(150));
        add(new Label("Nº2"));
        add(numerandoDos);
        //add(Box.createHorizontalStrut(150));
        
        
        botonSumar = new JButton("Sumar");
       /* botonSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                res = op1 + op2;
                
            }
        });
        botonRestar = new JButton("Restar");
        botonRestar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
            }
        });
            */
       
        add(botonSumar);
        add(botonRestar);
        add(new Label("Resultado"));
        add(resultado);
        resultado.setEditable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,200);
    setVisible(true);    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new CalculadoraBasica();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            op1 = Integer.parseInt(numerandoUno.getText());
            op2 = Integer.parseInt(numerandoDos.getText());
            if (e.getSource() == botonSumar){
                res = op1 + op2;
            }
            else{
                res = op1 + op2;
            }
        }catch(NumberFormatException ae){
          JOptionPane.showMessageDialog(this,"Error", "Error",JOptionPane.ERROR_MESSAGE);
        }
        resultado.setText(String.valueOf(res));
    }
    
}
