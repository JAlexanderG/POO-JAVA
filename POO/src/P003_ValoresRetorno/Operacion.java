package P003_ValoresRetorno;

public class Operacion {
       
    // Métodos  
    
    public int sumar(int num1, int num2){
        int suma = num1+num2;
        return suma;
    }
    
    public int restar(int num1, int num2){
        int resta = num1-num2;
        return resta;
    }
    
    public int multi(int num1, int num2){
        int multi = num1*num2;
        return multi;
    }
    
    public int div(int num1, int num2){
        int div = num1/num2;
        return div;
    }
    
   /* public void mostrarResultados(int suma, int resta, int multi, int div){
        System.out.println("La suma es de: "+suma);
        System.out.println("La resta es de: "+resta);
        System.out.println("La multiplicación es de: "+multi);
        System.out.println("La división es de: "+div);
    }*/
    
}