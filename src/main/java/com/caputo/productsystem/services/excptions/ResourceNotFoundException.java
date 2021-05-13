package com.caputo.productsystem.services.excptions;


public class ResourceNotFoundException extends RuntimeException {
    public static final Long serialVersionUID = 1L;

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
