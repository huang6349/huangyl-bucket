package org.hyl.bucket.commons.result.domain;

import java.io.Serializable;

public class Message implements Serializable {

    private static final long serialVersionUID = 1659800316659610661L;

    private Integer state;

    private String message;

    private Object data;

    private Boolean success;

    private String e;

    private Object params;

    public Message() {
    }

    public Message(Integer state, String message, Object data, Boolean success, Object params) {
        this.state = state;
        this.message = message;
        this.data = data;
        this.success = success;
        this.params = params;
    }

    public Message(Integer state, String message, Object data, Boolean success, String e, Object params) {
        this.state = state;
        this.message = message;
        this.data = data;
        this.success = success;
        this.e = e;
        this.params = params;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "Message{" +
                "state=" + state +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", success=" + success +
                ", e='" + e + '\'' +
                ", params=" + params +
                '}';
    }
}
