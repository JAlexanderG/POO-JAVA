package P002_CreacionMetodos;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String [] args){      
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
      
      Operacion op = new Operacion();
      
      op.sumar(n1, n2);
      op.restar(n1, n2);
      op.multi(n1, n2);
      op.div(n1, n2);
      
      op.mostrarResultados();
  }  
}