package org.hyl.bucket.commons.result.enums;

public enum MessageEnum {

    SUCCESS(200, "请求成功"),
    ERROR(500, "请求失败，请稍后再试");

    private final Integer state;

    private final String message;

    MessageEnum(Integer state, String message) {
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
