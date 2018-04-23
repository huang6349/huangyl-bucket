package org.hyl.bucket.web.commons.rest.enums;

import org.springframework.http.HttpStatus;

public enum RestMessageEnum {
    SUCCESS(HttpStatus.OK.value(), "请求成功"),
    SUCCESS_POST(HttpStatus.CREATED.value(), "新增数据成功"),
    SUCCESS_DELETE(HttpStatus.OK.value(), "删除数据成功"),
    SUCCESS_GET(HttpStatus.OK.value(), "查询数据成功"),
    SUCCESS_PUT(HttpStatus.OK.value(), "修改数据成功"),
    ERROR(HttpStatus.BAD_REQUEST.value(), "请求失败，请稍后再试"),
    ERROR_POST(HttpStatus.BAD_REQUEST.value(), "新增数据失败，请稍后再试"),
    ERROR_DELETE(HttpStatus.BAD_REQUEST.value(), "删除数据失败，请稍后再试"),
    ERROR_GET(HttpStatus.BAD_REQUEST.value(), "查询数据失败，请稍后再试"),
    ERROR_PUT(HttpStatus.BAD_REQUEST.value(), "修改数据失败，请稍后再试");

    private final Integer state;

    private final String message;

    RestMessageEnum(Integer state, String message) {
        this.state = state;
        this.message = message;
    }

    public Integer getState() {
        return state;
    }

    public String getMessage() {
        return message;
    }
}
