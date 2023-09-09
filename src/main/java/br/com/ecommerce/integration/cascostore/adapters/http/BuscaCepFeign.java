package br.com.ecommerce.integration.cascostore.adapters.http;

import br.com.ecommerce.integration.cascostore.adapters.http.vo.BuscaCepVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "buscacep", url = "https://viacep.com.br/")
public interface BuscaCepFeign {

    @RequestMapping(method = RequestMethod.GET, value = "ws/{numerocep}/json/")
    BuscaCepVO returnEndereco(@PathVariable(name = "numerocep") String zipCode);
}
