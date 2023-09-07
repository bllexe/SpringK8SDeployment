package com.tigris.springk8sdeployment.exception;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String message) {
        super(message);

    }
}
