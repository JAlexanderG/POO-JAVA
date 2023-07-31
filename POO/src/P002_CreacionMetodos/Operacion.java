package P002_CreacionMetodos;

import javax.swing.JOptionPane;

public class Operacion {
    // Atributos
    
    int suma,resta,multi,div;
    
    // Métodos  
    
    public void sumar(int num1, int num2){
        suma = num1+num2;
    }
    
    public void restar(int num1, int num2){
        resta = num1-num2;
    }
    
    public void multi(int num1, int num2){
        multi = num1*num2;
    }
    
    public void div(int num1, int num2){
        div = num1/num2;
    }
    
    public void mostrarResultados(){
        System.out.println("La suma es de: "+suma);
        System.out.println("La resta es de: "+resta);
        System.out.println("La multiplicación es de: "+multi);
        System.out.println("La división es de: "+div);
    }
    
}
