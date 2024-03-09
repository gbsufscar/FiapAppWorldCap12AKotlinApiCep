package br.com.fiap.consultacep.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/*
 Classe que fará o papel de cliente HTTP, fazendo as requisições para
 o servido REST da API do ViaCEP.
 */
class RetrofitFactory {

    // URL base da API
    private val URL = "https://viacep.com.br/ws/"

    // Cria uma instância (objeto) Retrofit com a URL base e o conversor Gson para JSON
    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    // Função que retorna uma instância do serviço. O Retrofit irá criar uma implementação dessa interface para nós.
    fun getCepService(): CepService {
        return retrofitFactory.create(CepService::class.java)
    }

}