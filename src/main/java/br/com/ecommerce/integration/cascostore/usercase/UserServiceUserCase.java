package br.com.ecommerce.integration.cascostore.usercase;

import br.com.ecommerce.integration.cascostore.adapters.http.BuscaCepFeign;
import br.com.ecommerce.integration.cascostore.adapters.http.vo.BuscaCepVO;
import br.com.ecommerce.integration.cascostore.adapters.database.AddresService;
import br.com.ecommerce.integration.cascostore.adapters.database.UserService;
import br.com.ecommerce.integration.cascostore.adapters.database.model.dto.UserDto;
import br.com.ecommerce.integration.cascostore.adapters.database.model.entity.AcessEntity;
import br.com.ecommerce.integration.cascostore.adapters.database.model.entity.AddresEntity;
import br.com.ecommerce.integration.cascostore.adapters.database.model.entity.CompliancePolicyEntity;
import br.com.ecommerce.integration.cascostore.adapters.database.model.entity.UserEntity;
import br.com.ecommerce.integration.cascostore.adapters.database.AcessService;
import br.com.ecommerce.integration.cascostore.adapters.database.CompliancePolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceUserCase {

    @Autowired
    private AcessService acessService;

    @Autowired
    private AddresService addresService;

    @Autowired
    private CompliancePolicyService compliancePolicyService;

    @Autowired
    private UserService userService;

    @Autowired
    private BuscaCepFeign buscaCepFeign;

    public void createUser(UserDto userDto) throws Exception {

        BuscaCepVO address = buscaCepFeign.returnEndereco(userDto.getZipCode());

        var isExisting = validationCreateAcess(userDto.getEmail());

        if (!isExisting) {
            AcessEntity acessEntity =  AcessEntity.builder()
                    .email(userDto.getEmail())
                    .keyword(userDto.getKeyword())
                    .build();

            AddresEntity addresEntity =  AddresEntity.builder()
                    .homeNumber( Integer.parseInt(userDto.getHomeNumber()))
                    .state(address.getUf())
                    .city(address.getLocalidade())
                    .neighborhood(address.getBairro())
                    .street(address.getLogradouro())
                    .zipCode(Long.parseLong(userDto.getZipCode())).build();


            CompliancePolicyEntity compliancePolicyEntity =  CompliancePolicyEntity.builder()
                    .marketingIndicator(userDto.getMarketingIndicator())
                    .complianceIndicator(userDto.getComplianceIndicator())
                    .build();

            UserEntity userEntity =  UserEntity.builder()
                    .name(userDto.getName())
                    .age(userDto.getAge())
                    .numberPhone(userDto.getNumberPhone())
                    .documentNumber(userDto.getDocumentNumber())
                    .acessEntity(acessEntity)
                    .addresEntity(addresEntity)
                    .compliancePolicyEntity(compliancePolicyEntity)
                    .build();

            userService.save(userEntity);
        }

        throw new Exception("Usuario já existente");

    }

    private Boolean validationCreateAcess(String email) {

        return acessService.existsByEmail(email);
    }

}
