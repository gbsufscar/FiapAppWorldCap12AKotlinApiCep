package br.com.fiap.consultacep.model

import com.google.gson.annotations.SerializedName

/*
Classe que representa o endereço retornado pela API do ViaCEP (https://viacep.com.br/).
Ela é um modelo de dados que será utilizado para mapear o JSON retornado pela API.
 */
data class Endereco(
    val cep: String = "",
    @SerializedName("logradouro") val rua: String = "",
    @SerializedName("localidade") val cidade: String = "",
    val bairro: String = "",
    val uf: String = ""
)