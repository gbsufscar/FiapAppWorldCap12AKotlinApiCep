package br.com.fiap.consultacep.service

import br.com.fiap.consultacep.model.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/*
Interface que define os métodos que serão utilizados
para acessar a API do ViaCEP (https://viacep.com.br/).
 */
interface CepService {

    //https://viacep.com.br/ws/01001000/json/
    @GET("{cep}/json/")
    fun getEndereco(@Path("cep") cep: String): Call<Endereco> // Call é uma classe do retrofit com resposta do servidor REST

    //https://viacep.com.br/ws/RS/Porto%20Alegre/Domingos/json/
    @GET("{uf}/{cidade}/{rua}/json/")
    fun getEnderecos(
        @Path("uf") uf: String,
        @Path("cidade") cidade: String,
        @Path("rua") rua: String
    ): List<Call<Endereco>>

}