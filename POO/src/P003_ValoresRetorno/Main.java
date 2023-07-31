package P003_ValoresRetorno;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String [] args){      
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
      
      Operacion operacion = new Operacion();      
          
      System.out.println("La suma es: "+operacion.sumar(n1, n2));
      System.out.println("La resta es: "+operacion.restar(n1, n2));
      System.out.println("La multiplicación es: "+operacion.multi(n1, n2));
      System.out.println("La división es: "+operacion.div(n1, n2));
      
  }  
}
