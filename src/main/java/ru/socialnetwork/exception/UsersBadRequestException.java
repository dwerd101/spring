package ru.socialnetwork.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UsersBadRequestException extends RuntimeException{
    public UsersBadRequestException() {
        super();
    }

    public UsersBadRequestException(String message) {
        super(message);
    }

    public UsersBadRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsersBadRequestException(Throwable cause) {
        super(cause);
    }

    protected UsersBadRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
