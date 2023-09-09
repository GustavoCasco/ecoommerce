package br.com.ecommerce.integration.cascostore.adapters.http.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BuscaCepVO {

    String cep;
    String logradouro;
    String complemento;
    String bairro;
    String localidade;
    String uf;
}
