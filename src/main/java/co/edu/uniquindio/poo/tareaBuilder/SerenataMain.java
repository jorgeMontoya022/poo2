package co.edu.uniquindio.poo.tareaBuilder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class SerenataMain {
        public static void main(String[] args) {
                serenata();
        }

        private static void serenata() {
                Serenata serenata1 = Serenata.builder()
                                .duracion(13)
                                .fechaYHora(LocalDateTime.of(2024, 3, 5, 0, 0))
                                .listaCanciones(new ArrayList<>(Arrays.asList("feliz cumpleaños", "las mañanitas")))
                                .build();

                Serenata serenata2 = Serenata.builder()
                                //.tipoEvento(TipoEvento.ANIVERSARIO)
                                .listaInstrumentos(
                                                new ArrayList<>(Arrays.asList("piano", "guitarra", "bateria", "bajo",
                                                                "conga", "bongo")))
                                .lugar("Finca la carmelita")
                                .fechaYHora(LocalDateTime.of(2024, 7, 6, 4, 6))
                                .build();

                System.out.println("serenata1 " + " " + "lugar: " + serenata1.getLugar());
                System.out.println("Serenata2 " + " " + "Fecha y lugar: " + serenata2.getFechaYHora() + " "
                                + "listaInstrumentos" + " " + serenata2.getListaInstrumentos());

        }
}
