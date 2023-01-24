package com.devsuperior.dscommerce.services.exceptions;

public class ForbiddenExceptions extends RuntimeException{

    public ForbiddenExceptions(String msg){
        super(msg);
    }
}
