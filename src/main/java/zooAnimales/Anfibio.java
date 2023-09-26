package zooAnimales;

import java.util.ArrayList;
class Anfibio extends Animal {
    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
    public static int ranas = 0;
    public static int salamandras = 0;
    private String colorPiel;
    private boolean venenoso;

    public class Mamifero(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
        totalAnimales++;
    }

    public class movimiento(){
        return void;
    }

    public static int cantidadAnfibios(){
        return listado.size();
    }

    public static crearRana(String nombre, int edad, String genero){
        ranas++;
        return rana = new Anfibio(nombre, edad, "selva", genero, "rojo", True);
    }

    public static crearSalamandra(String nombre, int edad, String genero){
        salamandras++;
        return salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", False);
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
}