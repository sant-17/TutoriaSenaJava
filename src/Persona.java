public class Persona {
    private int id;
    private int edad;
    private double estatura;
    private String nombre;

    public Persona() {
        this.id = 0;
        this.edad = 5;
        this.estatura = 1.50;
        this.nombre = "";
    }

    public Persona(int id, int edad, double estatura, String nombre) {
        this.id = id;
        this.edad = edad;
        this.estatura = estatura;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona -> edad=" + edad + ", nombre=" + nombre;
    }

    public void esMayorDeEdad(){
        if (this.edad >= 18){
            System.out.println(this.nombre + " es mayor de edad");
        }
        else{
            System.out.println(this.nombre + " NO es mayor de edad");
        }
    }
}