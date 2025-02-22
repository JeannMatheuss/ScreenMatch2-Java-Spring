package br.com.alura.ScreenMatch2.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(@JsonAlias("Title") String titulo, 
                            @JsonAlias("Episode") Integer numero,
                            @JsonAlias("imdbRating") String avaliacao,
                            @JsonAlias("Released") String dataLancamento) {

    public String Titulo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Titulo'");
    }
}
