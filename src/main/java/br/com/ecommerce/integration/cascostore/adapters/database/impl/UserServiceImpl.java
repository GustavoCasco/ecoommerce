package br.com.ecommerce.integration.cascostore.adapters.database.impl;

import br.com.ecommerce.integration.cascostore.adapters.database.AddresService;
import br.com.ecommerce.integration.cascostore.adapters.database.UserService;
import br.com.ecommerce.integration.cascostore.model.dto.UserDto;
import br.com.ecommerce.integration.cascostore.model.entity.AcessEntity;
import br.com.ecommerce.integration.cascostore.model.entity.CompliancePolicyEntity;
import br.com.ecommerce.integration.cascostore.model.entity.UserEntity;
import br.com.ecommerce.integration.cascostore.adapters.database.AcessService;
import br.com.ecommerce.integration.cascostore.adapters.database.CompliancePolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private AcessService acessService;

    @Autowired
    private AddresService addresService;

    @Autowired
    private CompliancePolicyService compliancePolicyService;

    @Autowired
    private UserService userService;

    private void createUser(UserDto userDto){
        UserEntity userEntity =  UserEntity.builder()
                .name(userDto.getName())
                .age(userDto.getAge())
                .numberPhone(userDto.getNumberPhone())
                .documentNumber(userDto.getDocumentNumber())
                .build();

        AcessEntity acessEntity =  AcessEntity.builder()
                .email(userDto.getEmail())
                .keyword(userDto.getKeyword())
                .build();

        CompliancePolicyEntity compliancePolicyEntity =  CompliancePolicyEntity.builder()
                .marketingIndicator(userDto.getMarketingIndicator())
                .complianceIndicator(userDto.getComplianceIndicator())
                .build();

        acessService.save(acessEntity);
        compliancePolicyService.save(compliancePolicyEntity);
        userService.save(userEntity);

    }

}
