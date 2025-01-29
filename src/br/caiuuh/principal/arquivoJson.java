package br.caiuuh.principal;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class arquivoJson {

    public void Json(String cepJson) throws IOException {

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        FileWriter escrita = new FileWriter("cep.json");
        escrita.write(gson.toJson(cepJson));
        escrita.close();
    }
}
