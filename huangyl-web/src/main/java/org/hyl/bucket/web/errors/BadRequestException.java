package org.hyl.bucket.web.errors;

import org.hyl.bucket.web.commons.rest.enums.Result;
import org.springframework.http.HttpStatus;

public class BadRequestException extends InternalServerErrorException {

    private static final long serialVersionUID = 684358578747862921L;

    private static final Integer STATE = HttpStatus.BAD_REQUEST.value();

    public BadRequestException(String message) {
        super(message, STATE);
    }

    public BadRequestException(String message, Result.Type type) {
        super(message, type, STATE);
    }

    public BadRequestException(String message, Result.Type type, Object params) {
        super(message, type, STATE, params);
    }

    public BadRequestException(String message, Result.Type type, Object params, Object data) {
        super(message, type, STATE, params, data);
    }

    public BadRequestException(String message, Object params) {
        super(message, STATE, params);
    }

    public BadRequestException(String message, Object params, Object data) {
        super(message, STATE, params, data);
    }
}
