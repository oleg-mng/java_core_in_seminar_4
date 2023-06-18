package org.inwork;

public class AnimalRunException extends AnimalException{

    public AnimalRunException(String message, String name, int distance) {
        super(message, name, distance);
    }
}
