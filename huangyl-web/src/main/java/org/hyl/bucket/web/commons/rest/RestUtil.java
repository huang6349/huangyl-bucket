package org.hyl.bucket.web.commons.rest;

import org.hyl.bucket.commons.result.domain.Message;
import org.hyl.bucket.web.commons.rest.enums.Result;
import org.hyl.bucket.web.commons.rest.service.dto.MessageDTO;

public interface RestUtil {

    static Message success() {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, Result.Type.DEFAULT, null, null, null, null));
    }

    static Message success(Integer state) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, Result.Type.DEFAULT, state, null, null, null));
    }

    static Message success(Integer state, String message) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, Result.Type.DEFAULT, state, message, null, null));
    }

    static Message success(Integer state, String message, Object data) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, Result.Type.DEFAULT, state, message, data, null));
    }

    static Message success(Integer state, String message, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, Result.Type.DEFAULT, state, message, data, params));
    }

    static Message success(Integer state, Object data) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, Result.Type.DEFAULT, state, null, data, null));
    }

    static Message success(Integer state, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, Result.Type.DEFAULT, state, null, data, params));
    }

    static Message success(String message) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, Result.Type.DEFAULT, null, message, null, null));
    }

    static Message success(String message, Object data) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, Result.Type.DEFAULT, null, message, data, null));
    }

    static Message success(String message, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, Result.Type.DEFAULT, null, message, data, params));
    }

    static Message success(Object data) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, Result.Type.DEFAULT, null, null, data, null));
    }

    static Message success(Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, Result.Type.DEFAULT, null, null, data, params));
    }

    static Message success(Result.Type type) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, type, null, null, null, null));
    }

    static Message success(Result.Type type, Integer state) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, type, state, null, null, null));
    }

    static Message success(Result.Type type, Integer state, String message) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, type, state, message, null, null));
    }

    static Message success(Result.Type type, Integer state, String message, Object data) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, type, state, message, data, null));
    }

    static Message success(Result.Type type, Integer state, String message, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, type, state, message, data, params));
    }

    static Message success(Result.Type type, Integer state, Object data) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, type, state, null, data, null));
    }

    static Message success(Result.Type type, Integer state, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, type, state, null, data, params));
    }

    static Message success(Result.Type type, String message) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, type, null, message, null, null));
    }

    static Message success(Result.Type type, String message, Object data) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, type, null, message, data, null));
    }

    static Message success(Result.Type type, String message, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, type, null, message, data, params));
    }

    static Message success(Result.Type type, Object data) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, type, null, null, data, null));
    }

    static Message success(Result.Type type, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.SUCCESS, type, null, null, data, params));
    }

    static Message error(String e) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, Result.Type.DEFAULT, null, null, null, e, null));
    }

    static Message error(String e, Integer state) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, Result.Type.DEFAULT, state, null, null, e, null));
    }

    static Message error(String e, Integer state, String message) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, Result.Type.DEFAULT, state, message, null, e, null));
    }

    static Message error(String e, Integer state, String message, Object data) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, Result.Type.DEFAULT, state, message, data, e, null));
    }

    static Message error(String e, Integer state, String message, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, Result.Type.DEFAULT, state, message, data, e, params));
    }

    static Message error(String e, Integer state, Object data) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, Result.Type.DEFAULT, state, null, data, e, null));
    }

    static Message error(String e, Integer state, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, Result.Type.DEFAULT, state, null, data, e, params));
    }

    static Message error(String e, String message) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, Result.Type.DEFAULT, null, message, null, e, null));
    }

    static Message error(String e, String message, Object data) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, Result.Type.DEFAULT, null, message, data, e, null));
    }

    static Message error(String e, String message, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, Result.Type.DEFAULT, null, message, data, e, params));
    }

    static Message error(String e, Object data) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, Result.Type.DEFAULT, null, null, data, e, null));
    }

    static Message error(String e, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, Result.Type.DEFAULT, null, null, data, e, params));
    }

    static Message error(Result.Type type, String e) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, type, null, null, null, e, null));
    }

    static Message error(Result.Type type, String e, Integer state) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, type, state, null, null, e, null));
    }

    static Message error(Result.Type type, String e, Integer state, String message) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, type, state, message, null, e, null));
    }

    static Message error(Result.Type type, String e, Integer state, String message, Object data) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, type, state, message, data, e, null));
    }

    static Message error(Result.Type type, String e, Integer state, String message, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, type, state, message, data, e, params));
    }

    static Message error(Result.Type type, String e, Integer state, Object data) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, type, state, null, data, e, null));
    }

    static Message error(Result.Type type, String e, Integer state, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, type, state, null, data, e, params));
    }

    static Message error(Result.Type type, String e, String message) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, type, null, message, null, e, null));
    }

    static Message error(Result.Type type, String e, String message, Object data) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, type, null, message, data, e, null));
    }

    static Message error(Result.Type type, String e, String message, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, type, null, message, data, e, params));
    }

    static Message error(Result.Type type, String e, Object data) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, type, null, null, data, e, null));
    }

    static Message error(Result.Type type, String e, Object data, Object params) {
        return MessageDTO.adapt(new MessageDTO(Result.Network.ERROR, type, null, null, data, e, params));
    }
}
