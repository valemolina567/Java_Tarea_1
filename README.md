//Main
public class Main {
    public static void main(String[] args) {
        //Hernan Galindez
        Jugadores galindez=new Jugadores();
        galindez.setNumero("1");
        galindez.setPosicion("Arquero");
        galindez.setNombre("Hernan Galindez");
        galindez.setNacionalidad("Argentina/Ecuatoriana");
        galindez.setEdad(37);
        galindez.setAltura(1.89f);
        System.out.println(galindez.verDetalle());
        //Leonardo Campana
        Jugadores campana=new Jugadores();
        campana.setNumero("8");
        campana.setPosicion("Delantero");
        campana.setNombre("Leonardo Campana");
        campana.setNacionalidad("Ecuatoriana");
        campana.setEdad(24);
        campana.setAltura(1.87f);
        System.out.println(campana.verDetalle());
        //Enner Valencia
        Jugadores valencia=new Jugadores();
        valencia.setNumero("13");
        valencia.setPosicion("Delantero");
        valencia.setNombre("Enner Valencia");
        valencia.setNacionalidad("Ecuatoriana");
        valencia.setEdad(34);
        valencia.setAltura(1.77f);
        System.out.println(valencia.verDetalle());
        //Kendry Paez
        Jugadores paez=new Jugadores();
        paez.setNumero("10");
        paez.setPosicion("Mediocampista");
        paez.setNombre("Kendry Paez");
        paez.setNacionalidad("Ecuatoriana");
        paez.setEdad(17);
        paez.setAltura(1.77f);
        System.out.println(paez.verDetalle());
        //Moises Caicedo
        Jugadores caicedo=new Jugadores();
        caicedo.setNumero("23");
        caicedo.setPosicion("Mediocampista");
        caicedo.setNombre("Moises Caicedo");
        caicedo.setNacionalidad("Ecuatoriana");
        caicedo.setEdad(22);
        caicedo.setAltura(1.78f);
        System.out.println(caicedo.verDetalle());
        //Alan Franco
        Jugadores franco=new Jugadores();
        franco.setNumero("20");
        franco.setPosicion("Mediocampista");
        franco.setNombre("Alan Franco");
        franco.setNacionalidad("Ecuatoriana");
        franco.setEdad(26);
        franco.setAltura(1.75f);
        System.out.println(franco.verDetalle());
        //Angel Mena
        Jugadores mena=new Jugadores();
        mena.setNumero("15");
        mena.setPosicion("Mediocampista");
        mena.setNombre("Angel Mena");
        mena.setNacionalidad("Ecuatoriana");
        mena.setEdad(36);
        mena.setAltura(1.68f);
        System.out.println(mena.verDetalle());
        //Piero Hincapie
        Jugadores hincapie=new Jugadores();
        hincapie.setNumero("2");
        hincapie.setPosicion("Defensa");
        hincapie.setNombre("Piero Hincapie");
        hincapie.setNacionalidad("Ecuatoriana");
        hincapie.setEdad(22);
        hincapie.setAltura(1.83f);
        System.out.println(hincapie.verDetalle());
        //William Pacho
        Jugadores pacho=new Jugadores();
        pacho.setNumero("6");
        pacho.setPosicion("Defensa");
        pacho.setNombre("William Pacho");
        pacho.setNacionalidad("Ecuatoriana");
        pacho.setEdad(22);
        pacho.setAltura(1.88f);
        System.out.println(pacho.verDetalle());
        //Angelo Preciado
        Jugadores preciado=new Jugadores();
        preciado.setNumero("3");
        preciado.setPosicion("Lateral Izquierdo");
        preciado.setNombre("Angelo Preciado");
        preciado.setNacionalidad("Ecuatoriana");
        preciado.setEdad(26);
        preciado.setAltura(1.74f);
        System.out.println(preciado.verDetalle());
        //Pervis Estupiñan
        Jugadores estupinan=new Jugadores();
        estupinan.setNumero("7");
        estupinan.setPosicion("Lateral Derecho");
        estupinan.setNombre("Pervis Estupiñan");
        estupinan.setNacionalidad("Ecuatoriana");
        estupinan.setEdad(26);
        estupinan.setAltura(1.75f);
        System.out.println(estupinan.verDetalle());
    }
}
//Jugadores
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
