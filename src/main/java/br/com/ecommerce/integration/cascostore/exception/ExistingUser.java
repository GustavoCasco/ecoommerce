package br.com.ecommerce.integration.cascostore.exception;

public class ExistingUser extends RuntimeException{
    
    public ExistingUser(String message){
        super(message);
    }
}
