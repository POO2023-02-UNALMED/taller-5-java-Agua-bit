package gestion;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private static ArrayList<Zona> zonas = new ArrayList<Zona>();

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void agregarZonas(Zona zona) {
        this.zonas.add(zona);
    }

    public static ArrayList<Zona> getZona() {
        return this.zonas;
    }

    public static void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }

    public int cantidadTotalAnimales() {
        int i = 0;
        for (int e=0; e<this.zonas.size(); e++){
            suma += zonas.get(e).cantidadAnimales();
        }
        return i;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}