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

    public ArrayList<Zona> getZona() {
        return this.zonas;
    }

    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }

    public int cantidadTotalAnimales() {
        int i = 0;
        for (int e=0; e<this.zonas.size(); e++){
            i += zonas.get(e).cantidadAnimales();
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

    public Zoologico() {
        this(null, null);
    }
}