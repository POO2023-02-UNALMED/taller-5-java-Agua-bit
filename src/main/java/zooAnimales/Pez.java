package zooAnimales;

import java.util.ArrayList;
class Pez extends Animal {
    private static ArrayList<Pez> listado = new ArrayList<Pez>();
    public static int salmones = 0;
    public static int bacalaos = 0;
    private String colorEscamas;
    private int cantidadAletas;

    public class Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
        totalAnimales++;
    }

    public class movimiento(){
        return void;
    }

    public static int cantidadPeces(){
        return listado.size();
    }

    public static crearSalmon(String nombre, int edad, String genero){
        salmones++;
        return salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
    }

    public static crearBacalao(String nombre, int edad, String genero){
        bacalaos++;
        return bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
}