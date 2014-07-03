/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo2;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,z;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero Y"));
        if (x<=0 || x>255)
        {
            z=-1;
            JOptionPane.showMessageDialog(null,"Resultado "+z);   
        }
        else
        {
            int[] array=new int[y];
            array[0]=x;
            for (int i = 1; i < array.length; i++) 
            {
               x=x*(i+1);
               array[i]=x;
                System.out.println(i+" "+array[i]);               
            }
            for (int i = 0; i < array.length; i++) 
            {
                if(i==(y-1))
                {
                    z=array[i];
                    JOptionPane.showMessageDialog(null,"Resultado "+z);
                }
            }
        }
        
    }
        
   
