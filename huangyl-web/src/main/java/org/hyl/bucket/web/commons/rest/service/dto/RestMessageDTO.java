package org.hyl.bucket.web.commons.rest.service.dto;

import org.apache.commons.lang3.StringUtils;
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
        message.setState(RestMessageDTO.getState(network, dto.getType(), dto.getState()));
        message.setMessage(RestMessageDTO.getMessage(network, dto.getType(), dto.getMessage()));
        message.setData(dto.getData());
        message.setSuccess(network.isSuccess());
        message.setE(dto.getE());
        message.setParams(dto.getParams());
        return message;
    }

    public static Integer getState(NetworkEnum network) {
        return RestMessageDTO.getState(network, RestTypeEnum.DEFAULT);
    }

    public static String getMessage(NetworkEnum network) {
        return RestMessageDTO.getMessage(network, RestTypeEnum.DEFAULT, null);
    }

    public static Integer getState(NetworkEnum network, RestTypeEnum type) {
        return RestMessageDTO.getState(network, type, null);
    }

    public static String getMessage(NetworkEnum network, RestTypeEnum type) {
        return RestMessageDTO.getMessage(network, type, null);
    }

    public static Integer getState(NetworkEnum network, RestTypeEnum type, Integer state) {
        if (state != null) {
            return state;
        }
        switch (type) {
            case POST:
                state = (NetworkEnum.SUCCESS == network) ? RestMessageEnum.SUCCESS_POST.getState() : RestMessageEnum.ERROR_POST.getState();
                break;
            case DELETE:
                state = (NetworkEnum.SUCCESS == network) ? RestMessageEnum.SUCCESS_DELETE.getState() : RestMessageEnum.ERROR_DELETE.getState();
                break;
            case GET:
                state = (NetworkEnum.SUCCESS == network) ? RestMessageEnum.SUCCESS_GET.getState() : RestMessageEnum.ERROR_GET.getState();
                break;
            case PUT:
                state = (NetworkEnum.SUCCESS == network) ? RestMessageEnum.SUCCESS_PUT.getState() : RestMessageEnum.ERROR_PUT.getState();
                break;
            default:
                state = (NetworkEnum.SUCCESS == network) ? RestMessageEnum.SUCCESS.getState() : RestMessageEnum.ERROR.getState();
        }
        return state;
    }

    public static String getMessage(NetworkEnum network, RestTypeEnum type, String message) {
        if (StringUtils.isNoneBlank(message)) {
            return message;
        }
        switch (type) {
            case POST:
                message = (NetworkEnum.SUCCESS == network) ? RestMessageEnum.SUCCESS_POST.getMessage() : RestMessageEnum.ERROR_POST.getMessage();
                break;
            case DELETE:
                message = (NetworkEnum.SUCCESS == network) ? RestMessageEnum.SUCCESS_DELETE.getMessage() : RestMessageEnum.ERROR_DELETE.getMessage();
                break;
            case GET:
                message = (NetworkEnum.SUCCESS == network) ? RestMessageEnum.SUCCESS_GET.getMessage() : RestMessageEnum.ERROR_GET.getMessage();
                break;
            case PUT:
                message = (NetworkEnum.SUCCESS == network) ? RestMessageEnum.SUCCESS_PUT.getMessage() : RestMessageEnum.ERROR_PUT.getMessage();
                break;
            default:
                message = (NetworkEnum.SUCCESS == network) ? RestMessageEnum.SUCCESS.getMessage() : RestMessageEnum.ERROR.getMessage();
        }
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
