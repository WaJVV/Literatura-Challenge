package com.devWay.LiteruraChallenge.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
@Entity
@Table(name = "libros")
public class Libro {

    @Id
    private Long Id;
    private String tituloLibro;
    private String nombreAutor;
    private Date fechaNacimiento;
    private Date fechaFallecido;
    private String idiomas;
    private Integer cantidadDescargas;

    public Libro() {
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaFallecido() {
        return fechaFallecido;
    }

    public void setFechaFallecido(Date fechaFallecido) {
        this.fechaFallecido = fechaFallecido;
    }

    public Integer getCantidadDescargas() {
        return cantidadDescargas;
    }

    public void setCantidadDescargas(Integer cantidadDescargas) {
        this.cantidadDescargas = cantidadDescargas;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "tituloLibro='" + tituloLibro + '\'' +
                ", nombreAutor='" + nombreAutor + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", fechaFallecido=" + fechaFallecido +
                ", idiomas='" + idiomas + '\'' +
                ", cantidadDescargas=" + cantidadDescargas +
                '}';
    }
}
