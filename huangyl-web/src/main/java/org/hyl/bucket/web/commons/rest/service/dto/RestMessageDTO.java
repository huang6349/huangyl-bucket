package org.hyl.bucket.web.commons.rest.service.dto;

import org.hyl.bucket.commons.result.domain.Message;
import org.hyl.bucket.commons.result.enums.NetworkEnum;
import org.hyl.bucket.commons.result.service.dto.MessageDTO;
import org.hyl.bucket.web.commons.rest.enums.RestMessageEnum;
import org.hyl.bucket.web.commons.rest.enums.RestTypeEnum;

public class RestMessageDTO extends MessageDTO {

    private RestTypeEnum type;

    public RestMessageDTO() {
    }

    public RestMessageDTO(NetworkEnum network, RestTypeEnum type, Integer state, String message, Object data, Object params) {
        super(network, state, message, data, params);
        this.type = type;
    }

    public RestMessageDTO(NetworkEnum network, RestTypeEnum type, Integer state, String message, Object data, String e, Object params) {
        super(network, state, message, data, e, params);
        this.type = type;
    }

    public static Message adapt(RestMessageDTO dto) {
        NetworkEnum network = dto.getNetwork();
        Message message = new Message();
        message.setState(RestMessageEnum.getState(network, dto.getType(), dto.getState()));
        message.setMessage(RestMessageEnum.getMessage(network, dto.getType(), dto.getMessage()));
        message.setData(dto.getData());
        message.setSuccess(network.isSuccess());
        message.setE(dto.getE());
        message.setParams(dto.getParams());
        return message;
    }

    public RestTypeEnum getType() {
        return type;
    }

    public void setType(RestTypeEnum type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "RestMessageDTO{" +
                "type=" + type +
                '}';
    }
}
