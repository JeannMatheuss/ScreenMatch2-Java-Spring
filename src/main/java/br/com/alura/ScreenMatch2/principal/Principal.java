package br.com.alura.ScreenMatch2.principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import br.com.alura.ScreenMatch2.models.DadosSerie;
import br.com.alura.ScreenMatch2.models.DadosTemporada;
import br.com.alura.ScreenMatch2.service.ConsumoApi;
import br.com.alura.ScreenMatch2.service.ConverterDados;

public class Principal {
    public void exibeMenu() {
        Scanner leitura = new Scanner(System.in);
        ConsumoApi consumo = new ConsumoApi();
        ConverterDados conversor = new ConverterDados();

        final String ENDERECO = "https://www.omdbapi.com/?t=";
        final String API_KEY = "&apikey=3493ff3d";

        System.out.println("Digite o nome da série para a busca: ");
        var nomeSerie = leitura.nextLine();
        var consumoApi = new ConsumoApi();
		var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);

        List<DadosTemporada> temporadas = new ArrayList<>();

		if (dados.totalTemporadas() != null) {
			for (int i = 1; i <= dados.totalTemporadas(); i++) {
				json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + "&Season=" + i + API_KEY);
				DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
				temporadas.add(dadosTemporada);
			}
		}		

        temporadas.forEach(System.out::println);

        // for (int i = 0; i < dados.totalTemporadas(); i++) {
        //     List<DadosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
        //     for (int j = 0; j < episodiosTemporada.size(); j++) {
        //         System.out.println(episodiosTemporada.get(j).titulo());
        //     }
        // }

        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

        List<String> nomes = Arrays.asList("Jean", "Maria Alice", "João", "Thiago", "Ianny");

        nomes.stream()
            .sorted()
            .forEach(System.out::println);
    }
}
