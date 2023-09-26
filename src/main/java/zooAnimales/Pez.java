package zooAnimales;

import java.util.ArrayList;
public class Pez extends Animal {
    private static ArrayList<Pez> listado = new ArrayList<Pez>();
    public static int salmones = 0;
    public static int bacalaos = 0;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
        totalAnimales++;
    }

    public String movimiento(){
        return "nadar";
    }

    public static int cantidadPeces(){
        return listado.size();
    }

    public static Pez crearSalmon(String nombre, int edad, String genero){
        salmones++;
        return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
    }

    public static Pez crearBacalao(String nombre, int edad, String genero){
        bacalaos++;
        return new Pez(nombre, edad, "oceano", genero, "gris", 6);
    }

    public String getColorEscamas(){
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas){
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas(){
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas){
        this.cantidadAletas = cantidadAletas;
    }

    public Pez() {
        this("", 0, "", "", "", 0);
    }
}