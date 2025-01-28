package br.com.alura.ScreenMatch2.models;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSerie(@JsonAlias("Title") String titulo, 
                        @JsonAlias("totalSeasons") Integer totalTemporadas, 
                        @JsonAlias("imdbRating") String avaliacao) {
}
