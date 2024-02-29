package co.edu.uniquindio.poo.tareaBuilder;


import java.time.LocalDateTime;
import java.util.Collection;

public class Serenata {
    
    private int duracion;
    private Collection<String> listaCanciones;
    private String lugar;
    private LocalDateTime fechaYHora;
    private TipoEvento tipoEvento;
    private Collection<String> listaInstrumentos;
    
    public Serenata(int duracion, Collection<String> listaCanciones, String lugar, LocalDateTime fechaYHora,
            TipoEvento tipoEvento, Collection<String> listaInstrumentos) {
        this.duracion = duracion;
        this.listaCanciones = listaCanciones;
        this.lugar = lugar;
        this.fechaYHora = fechaYHora;
        this.tipoEvento = tipoEvento;
        this.listaInstrumentos = listaInstrumentos;
    }

    public int getDuracion() {
        return duracion;
    }

    public Collection<String> getListaCanciones() {
        return listaCanciones;
    }

    public String getLugar() {
        return lugar;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public Collection<String> getListaInstrumentos() {
        return listaInstrumentos;
    }

    public static SerenataBuilder builder(){
        return new SerenataBuilder();
    }
    
}
