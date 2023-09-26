package zooAnimales;

import java.util.ArrayList;
class Mamifero extends Animal {
    private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
    public static int caballos = 0;
    public static int leones = 0;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
        totalAnimales++;
    }

    public static int cantidadMamiferos(){
        return listado.size();
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, True, 4);
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero){
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, True, 4);
    }

    public boolean isPelaje(){
        return pelaje;
    }

    public void setPelaje(boolean pelaje){
        this.pelaje = pelaje;
    }

    public int getPatas(){
        return patas;
    }

    public void setPatas(int patas){
        this.patas = patas;
    }
}