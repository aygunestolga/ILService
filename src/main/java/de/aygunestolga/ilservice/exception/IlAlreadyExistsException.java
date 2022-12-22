package de.aygunestolga.ilservice.exception;

public class IlAlreadyExistsException extends RuntimeException {
    public IlAlreadyExistsException(String msg) {
        super(msg);
    }
}
