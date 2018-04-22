package org.hyl.bucket.web.errors;

import org.hyl.bucket.web.commons.rest.enums.Result;
import org.springframework.http.HttpStatus;

public class DataAlreadyIDException extends InternalServerErrorException {

    private static final long serialVersionUID = 1636946067845716495L;

    private static final Integer STATE = HttpStatus.CONFLICT.value();

    private static final String MESSAGE = "数据编号已存在，请勿重复添加";

    public DataAlreadyIDException() {
        super(MESSAGE, Result.Type.POST, STATE);
    }

    public DataAlreadyIDException(Object params) {
        super(MESSAGE, Result.Type.POST, STATE, params);
    }

    public DataAlreadyIDException(Object params, Object data) {
        super(MESSAGE, Result.Type.POST, STATE, params, data);
    }

    public DataAlreadyIDException(String message) {
        super(message, Result.Type.POST, STATE);
    }

    public DataAlreadyIDException(String message, Object params) {
        super(message, Result.Type.POST, STATE, params);
    }

    public DataAlreadyIDException(String message, Object params, Object data) {
        super(message, Result.Type.POST, STATE, params, data);
    }
}
