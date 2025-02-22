/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datos;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class EjerciciosPOO {
    public static void main(String[] args) {
        int datos[] = new int[100];
        String num= JOptionPane.showInputDialog("Ingrese el numero de elementos");
        int n= Integer.parseInt(num);
        cargarDatos(datos,n);
        float prom=promedio(datos,n);
        String lis=listar(datos, prom,n);
        JOptionPane.showMessageDialog(null,"Los elementos mayores al promedio son los siguientes:\n"+lis);
    }

    private static void cargarDatos(int[] datos, int n) {
        for (int i = 0; i < n; i++) {
            String nu=JOptionPane.showInputDialog("Digita los numeros");
            datos[i]=Integer.parseInt(nu);
            
        }
    }

    private static float promedio(int[] datos, int n) {
        int suma=0;
        for (int i = 0; i < n; i++) {
            suma=suma+datos[i];
        }
        float promedio=suma/n;
        return promedio;
    }

    private static String listar(int[] datos, float prom, int n) {
        String lis="";
        for (int i = 0; i < n; i++) {
            if (datos[i] > prom) {
                lis+=datos[i]+"\n";
            }
        }
        return lis;
    }


    
}
