
package P005_SobrecargaMetodos;

public class Persona {
    //Atributos
    
    String nombre;
    int edad;
    String dni;
    
    //Métodos
    //Sobrecarga de Constructores: cuando hay más de 2 constructores
    //Se diferencia por el tipo de dato o cantidad de parámetros de los métodos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }        
    
    //Sobrecarga de métodos
    public void correr(){
        System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy corriendo una maratón");
    }
    
    public void correr(int km){
        System.out.println("He corrido "+km+" kilómetros");
    }
}
