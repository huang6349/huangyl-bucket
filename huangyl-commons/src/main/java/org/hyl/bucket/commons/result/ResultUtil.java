package org.hyl.bucket.commons.result;

import org.hyl.bucket.commons.result.domain.Message;
import org.hyl.bucket.commons.result.enums.NetworkEnum;
import org.hyl.bucket.commons.result.service.dto.MessageDTO;

public interface ResultUtil {

    static Message success() {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.SUCCESS, null, null, null, null));
    }

    static Message success(Integer state) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.SUCCESS, state, null, null, null));
    }

    static Message success(Integer state, String message) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.SUCCESS, state, message, null, null));
    }

    static Message success(Integer state, String message, Object data) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.SUCCESS, state, message, data, null));
    }

    static Message success(Integer state, String message, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.SUCCESS, state, message, data, params));
    }

    static Message success(Integer state, Object data) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.SUCCESS, state, null, data, null));
    }

    static Message success(Integer state, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.SUCCESS, state, null, data, params));
    }

    static Message success(String message) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.SUCCESS, null, message, null, null));
    }

    static Message success(String message, Object data) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.SUCCESS, null, message, data, null));
    }

    static Message success(String message, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.SUCCESS, null, message, data, params));
    }

    static Message success(Object data) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.SUCCESS, null, null, data, null));
    }

    static Message success(Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.SUCCESS, null, null, data, params));
    }

    static Message error(String e) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.ERROR, null, null, null, e, null));
    }

    static Message error(String e, Integer state) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.ERROR, state, null, null, e, null));
    }

    static Message error(String e, Integer state, String message) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.ERROR, state, message, null, e, null));
    }

    static Message error(String e, Integer state, String message, Object data) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.ERROR, state, message, data, e, null));
    }

    static Message error(String e, Integer state, String message, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.ERROR, state, message, data, e, params));
    }

    static Message error(String e, Integer state, Object data) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.ERROR, state, null, data, e, null));
    }

    static Message error(String e, Integer state, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.ERROR, state, null, data, e, params));
    }

    static Message error(String e, String message) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.ERROR, null, message, null, e, null));
    }

    static Message error(String e, String message, Object data) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.ERROR, null, message, data, e, null));
    }

    static Message error(String e, String message, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.ERROR, null, message, data, e, params));
    }

    static Message error(String e, Object data) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.ERROR, null, null, data, e, null));
    }

    static Message error(String e, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(NetworkEnum.ERROR, null, null, data, e, params));
    }
}
