package br.com.alura.ScreenMatch2.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
