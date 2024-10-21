public class Jugadores {
    //Tarea: crear una clase llamada jugador, poner al menos 6 atributos, set y get, metodos propios, alineación de cada jugador
    private String numero;
    private String posicion;
    private String nombre;
    private String nacionalidad;
    private Integer edad;
    private Float altura;
    //Constructor
    public Jugadores(){

    }
    //Setters / Getters
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    //Métodos Propios Imprimir
    public String verDetalle(){
        String dv = "Nombre: " + getNombre() /*this.marca*/ + "\n" +
                "Posicion: " + getPosicion() + "\n" +
                "Número: " + getNumero() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "Altura: " + getAltura() + "\n" +
                "Nacionalidad: " + getNacionalidad();
        return dv;
    }
}
