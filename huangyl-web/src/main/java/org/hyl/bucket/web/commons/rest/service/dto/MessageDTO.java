package org.hyl.bucket.web.commons.rest.service.dto;

import org.hyl.bucket.commons.result.domain.Message;
import org.hyl.bucket.web.commons.rest.enums.Result;

public class MessageDTO {

    private Result.Network network;

    private Result.Type type;

    private Integer state;

    private String message;

    private Object data;

    private String e;

    private Object params;

    public MessageDTO() {
    }

    public MessageDTO(Result.Network network, Result.Type type, Integer state, String message, Object data, Object params) {
        this.network = network;
        this.type = type;
        this.state = state;
        this.message = message;
        this.data = data;
        this.params = params;
    }

    public MessageDTO(Result.Network network, Result.Type type, Integer state, String message, Object data, String e, Object params) {
        this.network = network;
        this.type = type;
        this.state = state;
        this.message = message;
        this.data = data;
        this.e = e;
        this.params = params;
    }

    public static Message adapt(MessageDTO dto) {
        Result.Type type = dto.getType();
        Result.Network network = dto.getNetwork();
        Message message = new Message();
        message.setState(type.getState(network, dto.getState()));
        message.setMessage(type.getMessage(network, dto.getMessage()));
        message.setData(dto.getData());
        message.setSuccess(network.isSuccess());
        message.setE(dto.getE());
        message.setParams(dto.getParams());
        return message;
    }

    public Result.Network getNetwork() {
        return network;
    }

    public void setNetwork(Result.Network network) {
        this.network = network;
    }

    public Result.Type getType() {
        return type;
    }

    public void setType(Result.Type type) {
        this.type = type;
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
        return "MessageDTO{" +
                "network=" + network +
                ", type=" + type +
                ", state=" + state +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", e='" + e + '\'' +
                ", params=" + params +
                '}';
    }
}
