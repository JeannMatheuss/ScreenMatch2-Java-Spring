package br.com.alura.ScreenMatch2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.ScreenMatch2.service.ConsumoApi;

@SpringBootApplication
public class ScreenMatch2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatch2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&Season=1&apikey=3493ff3d");
		System.out.println(json);
	}

}
