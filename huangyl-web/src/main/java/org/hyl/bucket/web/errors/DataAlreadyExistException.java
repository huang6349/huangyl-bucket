package org.hyl.bucket.web.errors;

import org.hyl.bucket.web.commons.rest.enums.RestTypeEnum;
import org.springframework.http.HttpStatus;

public class DataAlreadyExistException extends InternalServerErrorException {

    private static final long serialVersionUID = -161437062350979297L;

    private static final Integer STATE = HttpStatus.CONFLICT.value();

    private static final String MESSAGE = "数据已存在，请勿重复添加";

    public DataAlreadyExistException() {
        super(MESSAGE, RestTypeEnum.POST, STATE);
    }

    public DataAlreadyExistException(Object params) {
        super(MESSAGE, RestTypeEnum.POST, STATE, params);
    }

    public DataAlreadyExistException(Object params, Object data) {
        super(MESSAGE, RestTypeEnum.POST, STATE, params, data);
    }

    public DataAlreadyExistException(String message) {
        super(message, RestTypeEnum.POST, STATE);
    }

    public DataAlreadyExistException(String message, Object params) {
        super(message, RestTypeEnum.POST, STATE, params);
    }

    public DataAlreadyExistException(String message, Object params, Object data) {
        super(message, RestTypeEnum.POST, STATE, params, data);
    }
}
