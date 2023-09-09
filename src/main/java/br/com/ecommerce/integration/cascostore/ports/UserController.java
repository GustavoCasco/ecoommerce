package br.com.ecommerce.integration.cascostore.ports;

import br.com.ecommerce.integration.cascostore.usercase.UserServiceUserCase;
import br.com.ecommerce.integration.cascostore.adapters.database.model.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceUserCase userCase;

    @PostMapping("/create_user")
    public ResponseEntity<Object> createUser (@RequestBody UserDto userDto ){
        try{
            userCase.createUser(userDto);
            return ResponseEntity.ok("Salvo com sucesso");
        }catch (Exception e){
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
