package br.com.alura.ScreenMatch2.principal;

import java.util.Scanner;

import br.com.alura.ScreenMatch2.service.ConsumoApi;

public class Principal {
    public void exibeMenu() {
        Scanner leitura = new Scanner(System.in);
        ConsumoApi consumo = new ConsumoApi();

        final String ENDERECO = "https://www.omdbapi.com/?t=";
        final String API_KEY = "&apikey=3493ff3d";

        System.out.println("Digite o nome da série para a busca: ");
        var nomeSerie = leitura.nextLine();
        var consumoApi = new ConsumoApi();
		var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        
    }
}
