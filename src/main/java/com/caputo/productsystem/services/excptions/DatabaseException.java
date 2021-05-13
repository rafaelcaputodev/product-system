package com.caputo.productsystem.services.excptions;


public class DatabaseException extends RuntimeException {
    public static final Long serialVersionUID = 1L;

    public DatabaseException(String message) {
        super(message);
    }
}
