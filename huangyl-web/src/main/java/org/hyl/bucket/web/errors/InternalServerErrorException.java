package org.hyl.bucket.web.errors;

import org.hyl.bucket.web.commons.rest.enums.RestTypeEnum;
import org.springframework.http.HttpStatus;

public class InternalServerErrorException extends RuntimeException {

    private static final long serialVersionUID = -3554796752939797569L;

    private RestTypeEnum type = RestTypeEnum.DEFAULT;

    private Integer state = HttpStatus.INTERNAL_SERVER_ERROR.value();

    private Object params;

    private Object data;

    public InternalServerErrorException(String message) {
        super(message);
    }

    public InternalServerErrorException(String message, RestTypeEnum type) {
        super(message);
        this.type = type;
    }

    public InternalServerErrorException(String message, RestTypeEnum type, Integer state) {
        super(message);
        this.type = type;
        this.state = state;
    }

    public InternalServerErrorException(String message, RestTypeEnum type, Integer state, Object params) {
        super(message);
        this.type = type;
        this.state = state;
        this.params = params;
    }

    public InternalServerErrorException(String message, RestTypeEnum type, Integer state, Object params, Object data) {
        super(message);
        this.type = type;
        this.state = state;
        this.params = params;
        this.data = data;
    }

    public InternalServerErrorException(String message, RestTypeEnum type, Object params) {
        super(message);
        this.type = type;
        this.params = params;
    }

    public InternalServerErrorException(String message, RestTypeEnum type, Object params, Object data) {
        super(message);
        this.type = type;
        this.params = params;
        this.data = data;
    }

    public InternalServerErrorException(String message, Integer state) {
        super(message);
        this.state = state;
    }

    public InternalServerErrorException(String message, Integer state, Object params) {
        super(message);
        this.state = state;
        this.params = params;
    }

    public InternalServerErrorException(String message, Integer state, Object params, Object data) {
        super(message);
        this.state = state;
        this.params = params;
        this.data = data;
    }

    public InternalServerErrorException(String message, Object params) {
        super(message);
        this.params = params;
    }

    public InternalServerErrorException(String message, Object params, Object data) {
        super(message);
        this.params = params;
        this.data = data;
    }

    public RestTypeEnum getType() {
        return type;
    }

    public void setType(RestTypeEnum type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
