
package tarea1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Tarea1 extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Lista1 = new javax.swing.JTable();
        button1 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lista1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Numero", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Lista1);

        button1.setLabel("button1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
   
    }//GEN-LAST:event_button1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

int a=0, num=0, option=0, firstnumberint=0, secondnumberint=0, result=0 ; 
String  firstnumberinput=null, secondnumberinput=null ;
boolean exit= true;       
 //JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
 
 while(exit==true){
      
      
try {

     String opcionstr = JOptionPane.showInputDialog("\nBienvenido a nuestro sistema de calculo.\n"
         + "\nPor favor seleccione una opcion:\n"+
           "Digite 1 para Sumar\n"+
           "Digite 2 para Restar\n"+
           "Digite 3 para Dividir\n"+
           "Digite 4 para Multiplicar\n"+
           "Digite 5 para verificacion de numero primo\n"+
           "Digite 6 para verificacion de numero palindromo\n"+
           "Digite 0 para Salir\n");

option = Integer.parseInt(opcionstr);

if(option == 1){
    
    try{
        
        firstnumberinput = JOptionPane.showInputDialog("Digite un numero");
        firstnumberint = Integer.parseInt(firstnumberinput);
        
        secondnumberinput = JOptionPane.showInputDialog("Digite otro numero");
        secondnumberint = Integer.parseInt(secondnumberinput);
        
        result = firstnumberint + secondnumberint;
        
         JOptionPane.showMessageDialog(null, "El resultado es : "+result+"\n");

         
        }catch(Exception e){
 JOptionPane.showMessageDialog(null, "Digite solo numeros\n");
exit=true;


        }

exit=true;

}else if(option == 2){
    
    try{
        
        firstnumberinput = JOptionPane.showInputDialog("Digite un numero");
        firstnumberint = Integer.parseInt(firstnumberinput);
        
        secondnumberinput = JOptionPane.showInputDialog("Digite otro numero");
        secondnumberint = Integer.parseInt(secondnumberinput);
        
        result = firstnumberint - secondnumberint;
        
         JOptionPane.showMessageDialog(null, "El resultado es : "+result+"\n");

         
        }catch(Exception e){
 JOptionPane.showMessageDialog(null, "Digite solo numeros\n");
exit=true;


        }

exit=true;

}else if(option == 3){
    
  try{
        
        firstnumberinput = JOptionPane.showInputDialog("Digite un numero");
        firstnumberint = Integer.parseInt(firstnumberinput);
        
        secondnumberinput = JOptionPane.showInputDialog("Digite otro numero");
        secondnumberint = Integer.parseInt(secondnumberinput);
        
        result = firstnumberint / secondnumberint;
        
         JOptionPane.showMessageDialog(null, "El resultado es : "+result+"\n");

         
        }catch(Exception e){
 JOptionPane.showMessageDialog(null, "Digite solo numeros\n");
exit=true;


        }

exit=true;

}else if(option == 4){
    
  try{
        
        firstnumberinput = JOptionPane.showInputDialog("Digite un numero");
        firstnumberint = Integer.parseInt(firstnumberinput);
        
        secondnumberinput = JOptionPane.showInputDialog("Digite otro numero");
        secondnumberint = Integer.parseInt(secondnumberinput);
        
        result = firstnumberint * secondnumberint;
        
         JOptionPane.showMessageDialog(null, "El resultado es : "+result+"\n");

         
        }catch(Exception e){
 JOptionPane.showMessageDialog(null, "Digite solo numeros\n");
exit=true;


        }

exit=true;

}else if(option == 5){

   
  try{
        
        firstnumberinput = JOptionPane.showInputDialog("Digite un numero");
        firstnumberint = Integer.parseInt(firstnumberinput);
        
       primeNumber(firstnumberint);
         
        }catch(Exception e){
 JOptionPane.showMessageDialog(null, "Digite solo numeros\n");
exit=true;


        }

exit=true;

}else if(option == 6){

   
  try{
        
        firstnumberinput = JOptionPane.showInputDialog("Digite un numero");
        firstnumberint = Integer.parseInt(firstnumberinput);
        
       Capicua(firstnumberint);
         
        }catch(Exception e){
 JOptionPane.showMessageDialog(null, "Digite solo numeros\n");
exit=true;


        }

exit=true;

}else if(option == 0){

 JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestra calculadora\n");
exit=false;
System.exit(0);
}
} catch (Exception z) {
    
 JOptionPane.showMessageDialog(null, "Opcion no valida\n");
exit=true;
}
  } 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tarea1().setVisible(true);
                
            }
        });
    }

    public static void primeNumber(int num) {
    boolean prime = true; 
    for(int i = 2; i < num; i++) {
        if (num % i == 0) {
            prime = false;
            break;
        }
    }
    if (prime)
         JOptionPane.showMessageDialog(null, "El numero es primo\n");
    else
         JOptionPane.showMessageDialog(null, "El numero no es primo\n");
}
    
        public static void Capicua(int num) {
    String a=String.valueOf(num);
   
	    for(int i=0;i<a.length()/2;i++) {
	    	if(a.charAt(i)!=a.charAt(a.length()-i-1)) {
                     JOptionPane.showMessageDialog(null, "El numero no es palindromo \n");
			}else {
                     JOptionPane.showMessageDialog(null, "El numero es palindromo \n");
			}
		}

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Lista1;
    private java.awt.Button button1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
