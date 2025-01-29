package br.caiuuh.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class consultaCep {

    public void Endereco (String cep) {
        String endereco = "http://viacep.com.br/ws/"+ cep +"/json";

        try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(response.body());
            }
            catch (IOException | InterruptedException e) {
                throw  new RuntimeException("CEP INVALIDO!");
            }
        }

}

