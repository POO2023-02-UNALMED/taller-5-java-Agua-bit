package zooAnimales;

import gestion.Zona;

public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public class Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero
        totalAnimales++;
    }

    public class movimiento(){
        return void;
    }

    public static String totalPorTipo(){
        return "Mamiferos : " + Mamifero.cantidadMamiferos() + "\n" + "Aves : " + Ave.cantidadAves() + "\n" + "Reptiles : " + Reptil.cantidadReptiles() + "\n" + "Peces : " + Pez.cantidadPeces() + "\n" + "Anfibios : " +Anfibio.cantidadAnfibios();
    }

    public static toString(){
        if (this.zona == null){
            return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero
        }
        else{
            return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero + ", la zona en la que me ubico es " + this.zona + " en el " + this.zona.getZoo.getNombre();
        }
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getHabitat(){
        return this.habitat;
    }

    public void setHabitat(String habitat){
        this.habitat = habitat;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public static int getTotalAnimales(){
        return totalAnimales;
    }

    public static void setTotalAnimales(int to){
        totalAnimales = to;
    }
}