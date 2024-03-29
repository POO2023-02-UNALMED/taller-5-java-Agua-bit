package zooAnimales;

import java.util.ArrayList;
public class Anfibio extends Animal {
    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
    public static int ranas = 0;
    public static int salamandras = 0;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
        totalAnimales++;
    }

    public String movimiento(){
        return "saltar";
    }

    public static int cantidadAnfibios(){
        return listado.size();
    }

    public static Anfibio crearRana(String nombre, int edad, String genero){
        ranas++;
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }

    public String getColorPiel(){
        return colorPiel;
    }

    public void setColorPiel(String colorPiel){
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso(){
        return venenoso;
    }

    public void setVenenoso(boolean venenoso){
        this.venenoso = venenoso;
    }

    public Anfibio() {
        this("", 0, "", "", "", false);
    }
}