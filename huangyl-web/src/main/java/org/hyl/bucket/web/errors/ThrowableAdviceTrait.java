package org.hyl.bucket.web.errors;

import org.hyl.bucket.commons.result.domain.Message;
import org.hyl.bucket.web.commons.rest.RESTful;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface ThrowableAdviceTrait {

    @ExceptionHandler(BindException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    default Message handleBindException(final BindException e) {
        return RESTful.error(e.getClass().getName(), HttpStatus.BAD_REQUEST.value(), e.getBindingResult().getFieldError().getDefaultMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    default Message handleMethodArgumentNotValidException(final MethodArgumentNotValidException e) {
        return RESTful.error(e.getClass().getName(), HttpStatus.BAD_REQUEST.value(), e.getBindingResult().getFieldError().getDefaultMessage());
    }

    @ExceptionHandler(InternalServerErrorException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    default Message handleInternalServerErrorException(final InternalServerErrorException e) {
        return RESTful.error(e.getType(), e.getClass().getName(), e.getState(), e.getMessage(), e.getData(), e.getParams());
    }

    @ExceptionHandler(Throwable.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    default Message handleThrowable(final Throwable throwable) {
        return RESTful.error(throwable.getClass().getName());
    }
}
