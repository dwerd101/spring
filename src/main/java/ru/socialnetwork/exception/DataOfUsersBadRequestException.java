package ru.socialnetwork.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DataOfUsersBadRequestException extends RuntimeException{
    public DataOfUsersBadRequestException() {
    }

    public DataOfUsersBadRequestException(String message) {
        super(message);
    }

    public DataOfUsersBadRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataOfUsersBadRequestException(Throwable cause) {
        super(cause);
    }

    public DataOfUsersBadRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
