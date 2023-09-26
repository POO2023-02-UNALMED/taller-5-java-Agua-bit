package zooAnimales;

import java.util.ArrayList;
class Ave extends Animal {
    private static ArrayList<Ave> listado = new ArrayList<Ave>();
    public static int halcones = 0;
    public static int aguilas = 0;
    private String colorPlumas;

    public class Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.colorPlumas = colorPlumas;
        listado.add(this);
        totalAnimales++;
    }

    public class movimiento(){
        return void;
    }

    public static int cantidadAves(){
        return listado.size();
    }

    public static crearHalcon(String nombre, int edad, String genero){
        halcones++;
        return halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
    }

    public static crearAguila(String nombre, int edad, String genero){
        aguilas++;
        return aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}