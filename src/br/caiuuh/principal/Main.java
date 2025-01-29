package br.caiuuh.principal;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        consultaCep meuConsultaCep = new consultaCep();
        arquivoJson meuArquivoJson = new arquivoJson();

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o seu CEP: ");
        String meuCep = leitura.nextLine();

        meuConsultaCep.Endereco(meuCep);
        meuArquivoJson.Json(meuCep);
    }
}

