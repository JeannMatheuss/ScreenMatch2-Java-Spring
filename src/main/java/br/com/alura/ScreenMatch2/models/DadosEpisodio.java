package br.com.alura.ScreenMatch2.models;

import com.fasterxml.jackson.annotation.JsonAlias;

record DadosEpisodio(@JsonAlias("Title") String titulo, 
                    @JsonAlias("Episode") Integer numero,
                    @JsonAlias("imdbRating") String avaliacao,
                    @JsonAlias("Released") String dataLancamento) {
} 
