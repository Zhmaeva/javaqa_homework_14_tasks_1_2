package ru.netology.domain.exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String massage) {
        super(massage);
    }

}
