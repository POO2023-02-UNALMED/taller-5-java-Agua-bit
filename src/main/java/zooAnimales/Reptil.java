package zooAnimales;

import java.util.ArrayList;
class Reptil extends Animal {
    private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
    public static int iguanas = 0;
    public static int serpientes = 0;
    private String colorEscamas;
    private int largoCola;

    public class Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola:
        listado.add(this);
        totalAnimales++;
    }

    public class movimiento(){
        return void;
    }

    public static int cantidadReptiles(){
        return listado.size();
    }

    public static Reptil crearIguana(String nombre, int edad, String genero){
        iguanas++;
        return iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        serpientes++;
        return serpientes = new Reptil(nombre, edad, "jungla", genero, "blanca", 1);
    }

    public String getColorEscamas(){
        return this.colorEscamas;
    }

    public void setColorEscamas(String colorEscamas){
        this.colorEscamas = colorEscamas;
    }
    public int getLargoCola(){
        return this.largoCola;
    }

    public int setLargoCola(int largoCola){
        this.largoCola = largoCola;
    }
}