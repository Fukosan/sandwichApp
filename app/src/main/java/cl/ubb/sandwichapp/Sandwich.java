package cl.ubb.sandwichapp;

import java.io.Serializable;

public class Sandwich implements Serializable {
    String nombre;
    String idPic;
    String descripcion;
    int precio;

    public Sandwich(String nombre, String idPic, String descripcion , int precio)
    {
        this.nombre = nombre;
        this.idPic = idPic;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getIdPic()
    {
        return idPic;
    }
    public String getDescripcion()
    {
        return descripcion;
    }
    public int getPrecio()
    {
        return precio;
    }
}
