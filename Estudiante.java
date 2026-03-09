import java.util.ArrayList; 

public class Estudiante { 
    // Atributos privados (encapsulación) 
    private String nombre; 
    private int edad; 
    private String carrera; 
    private ArrayList<String> materias;
    private int horasEstudio = 0; 
    // Constructor 
    public Estudiante(String nombre, int edad, String carrera) {
         this.nombre = nombre; 
         this.edad = edad; 
         this.carrera = carrera; 
         this.materias = new ArrayList<>(); 
        } 
        // Método para inscribir materia 
    public void inscribirMateria(String materia) { 
        this.materias.add(materia); 
        System.out.println(nombre + " se inscribió en " + materia);
     } 
     // Método para presentarse 
    public void presentarse() {
         System.out.println("Hola, soy " + nombre); 
         System.out.println("Tengo " + edad + " años"); 
         System.out.println("Estudio " + carrera); 
         System.out.println("Materias inscritas: " + materias.size()); 
         System.out.println("Horas estudiadas:" + horasEstudio);
        } 
        //metodo estudiar
    public void estudiar(int horas) {
        horasEstudio += horas;
        System.out.println(nombre + "estudio"+ horas + "horas");
    }  
        // Método main para probar 
    public static void main(String[] args) {
         // Crear objetos
        Estudiante est1 = new Estudiante("Laura Rodriguez",17, "Tecnologia en sistematizacion de datos");
         // Usar métodos 
        est1.presentarse(); 
        System.out.println("---");
        est1.inscribirMateria("POO");
        est1.inscribirMateria("Estructura  de datos");
        est1.inscribirMateria("Calculo");
        est1.estudiar(3);

        System.out.println("---");
        est1.presentarse();
    
    } 
}