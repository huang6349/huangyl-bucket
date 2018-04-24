package org.hyl.bucket.commons.result.service.dto;

import org.hyl.bucket.commons.result.domain.Message;
import org.hyl.bucket.commons.result.enums.MessageEnum;
import org.hyl.bucket.commons.result.enums.NetworkEnum;

public class MessageDTO {

    private NetworkEnum network;

    private Integer state;

    private String message;

    private Object data;

    private String e;

    private Object params;

    public MessageDTO() {
    }

    public MessageDTO(NetworkEnum network, Integer state, String message, Object data, Object params) {
        this.network = network;
        this.state = state;
        this.message = message;
        this.data = data;
        this.params = params;
    }

    public MessageDTO(NetworkEnum network, Integer state, String message, Object data, String e, Object params) {
        this.network = network;
        this.state = state;
        this.message = message;
        this.data = data;
        this.e = e;
        this.params = params;
    }

    public static Message adapt(MessageDTO dto) {
        NetworkEnum network = dto.getNetwork();
        Message message = new Message();
        message.setState(MessageEnum.getState(network, dto.getState()));
        message.setMessage(MessageEnum.getMessage(network, dto.getMessage()));
        message.setData(dto.getData());
        message.setSuccess(network.isSuccess());
        message.setE(dto.getE());
        message.setParams(dto.getParams());
        return message;
    }

    public NetworkEnum getNetwork() {
        return network;
    }

    public void setNetwork(NetworkEnum network) {
        this.network = network;
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
                ", state=" + state +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", e='" + e + '\'' +
                ", params=" + params +
                '}';
    }
}
