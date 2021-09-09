package ru.socialnetwork.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DataOfUsersNotFoundException extends RuntimeException{
    public DataOfUsersNotFoundException() {
    }

    public DataOfUsersNotFoundException(String message) {
        super(message);
    }

    public DataOfUsersNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataOfUsersNotFoundException(Throwable cause) {
        super(cause);
    }

    public DataOfUsersNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
