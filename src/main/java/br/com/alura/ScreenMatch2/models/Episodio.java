package br.com.alura.ScreenMatch2.models;

import java.time.LocalDate;

public class Episodio {
    private Integer temporada;
    private String titulo;
    private Integer numero;
    private String avaliacao;
    private LocalDate dataLancamento;

    
    public Integer getTemporada() {
        return temporada;
    }
    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
    public LocalDate getDataLancamento() {
        return dataLancamento;
    }
    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    
}
