package co.edu.uniquindio.poo.tareaBuilder;

import java.time.LocalDateTime;
import java.util.Collection;

public class SerenataBuilder {

    private int duracion;
    private Collection<String> listaCanciones;
    private String lugar;
    private LocalDateTime fechaYHora;
    private TipoEvento tipoEvento;
    private Collection<String> listaInstrumentos;

    SerenataBuilder() {
    }

    public SerenataBuilder duracion(int duracion) {
        this.duracion = duracion;
        return this;
    }

    public SerenataBuilder listaCanciones(Collection<String> listaCanciones) {
        this.listaCanciones = listaCanciones;
        return this;
    }

    public SerenataBuilder lugar(String lugar) {
        this.lugar = lugar;
        return this;

    }

    public SerenataBuilder fechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
        return this;
    }

    public SerenataBuilder tipoEvento(TipoEvento tipoEvento){
        this.tipoEvento = tipoEvento;
        return this;
    }

    public SerenataBuilder listaInstrumentos(Collection<String> listaInstrumentos){
        this.listaInstrumentos = listaInstrumentos;
        return this;
    }

    public Serenata build(){
        return new Serenata(duracion, listaCanciones, lugar, fechaYHora, tipoEvento, listaInstrumentos);
    }

}
