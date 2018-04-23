package org.hyl.bucket.web.commons.rest;

import org.hyl.bucket.commons.result.domain.Message;
import org.hyl.bucket.commons.result.enums.NetworkEnum;
import org.hyl.bucket.web.commons.rest.enums.RestTypeEnum;
import org.hyl.bucket.web.commons.rest.service.dto.RestMessageDTO;

public interface RestUtil {

    static Message success() {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, RestTypeEnum.DEFAULT, null, null, null, null));
    }

    static Message success(Integer state) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, RestTypeEnum.DEFAULT, state, null, null, null));
    }

    static Message success(Integer state, String message) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, RestTypeEnum.DEFAULT, state, message, null, null));
    }

    static Message success(Integer state, String message, Object data) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, RestTypeEnum.DEFAULT, state, message, data, null));
    }

    static Message success(Integer state, String message, Object data, Object params) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, RestTypeEnum.DEFAULT, state, message, data, params));
    }

    static Message success(Integer state, Object data) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, RestTypeEnum.DEFAULT, state, null, data, null));
    }

    static Message success(Integer state, Object data, Object params) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, RestTypeEnum.DEFAULT, state, null, data, params));
    }

    static Message success(String message) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, RestTypeEnum.DEFAULT, null, message, null, null));
    }

    static Message success(String message, Object data) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, RestTypeEnum.DEFAULT, null, message, data, null));
    }

    static Message success(String message, Object data, Object params) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, RestTypeEnum.DEFAULT, null, message, data, params));
    }

    static Message success(Object data) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, RestTypeEnum.DEFAULT, null, null, data, null));
    }

    static Message success(Object data, Object params) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, RestTypeEnum.DEFAULT, null, null, data, params));
    }

    static Message success(RestTypeEnum type) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, type, null, null, null, null));
    }

    static Message success(RestTypeEnum type, Integer state) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, type, state, null, null, null));
    }

    static Message success(RestTypeEnum type, Integer state, String message) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, type, state, message, null, null));
    }

    static Message success(RestTypeEnum type, Integer state, String message, Object data) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, type, state, message, data, null));
    }

    static Message success(RestTypeEnum type, Integer state, String message, Object data, Object params) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, type, state, message, data, params));
    }

    static Message success(RestTypeEnum type, Integer state, Object data) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, type, state, null, data, null));
    }

    static Message success(RestTypeEnum type, Integer state, Object data, Object params) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, type, state, null, data, params));
    }

    static Message success(RestTypeEnum type, String message) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, type, null, message, null, null));
    }

    static Message success(RestTypeEnum type, String message, Object data) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, type, null, message, data, null));
    }

    static Message success(RestTypeEnum type, String message, Object data, Object params) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, type, null, message, data, params));
    }

    static Message success(RestTypeEnum type, Object data) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, type, null, null, data, null));
    }

    static Message success(RestTypeEnum type, Object data, Object params) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.SUCCESS, type, null, null, data, params));
    }

    static Message error(String e) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, RestTypeEnum.DEFAULT, null, null, null, e, null));
    }

    static Message error(String e, Integer state) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, RestTypeEnum.DEFAULT, state, null, null, e, null));
    }

    static Message error(String e, Integer state, String message) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, RestTypeEnum.DEFAULT, state, message, null, e, null));
    }

    static Message error(String e, Integer state, String message, Object data) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, RestTypeEnum.DEFAULT, state, message, data, e, null));
    }

    static Message error(String e, Integer state, String message, Object data, Object params) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, RestTypeEnum.DEFAULT, state, message, data, e, params));
    }

    static Message error(String e, Integer state, Object data) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, RestTypeEnum.DEFAULT, state, null, data, e, null));
    }

    static Message error(String e, Integer state, Object data, Object params) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, RestTypeEnum.DEFAULT, state, null, data, e, params));
    }

    static Message error(String e, String message) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, RestTypeEnum.DEFAULT, null, message, null, e, null));
    }

    static Message error(String e, String message, Object data) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, RestTypeEnum.DEFAULT, null, message, data, e, null));
    }

    static Message error(String e, String message, Object data, Object params) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, RestTypeEnum.DEFAULT, null, message, data, e, params));
    }

    static Message error(String e, Object data) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, RestTypeEnum.DEFAULT, null, null, data, e, null));
    }

    static Message error(String e, Object data, Object params) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, RestTypeEnum.DEFAULT, null, null, data, e, params));
    }

    static Message error(RestTypeEnum type, String e) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, type, null, null, null, e, null));
    }

    static Message error(RestTypeEnum type, String e, Integer state) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, type, state, null, null, e, null));
    }

    static Message error(RestTypeEnum type, String e, Integer state, String message) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, type, state, message, null, e, null));
    }

    static Message error(RestTypeEnum type, String e, Integer state, String message, Object data) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, type, state, message, data, e, null));
    }

    static Message error(RestTypeEnum type, String e, Integer state, String message, Object data, Object params) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, type, state, message, data, e, params));
    }

    static Message error(RestTypeEnum type, String e, Integer state, Object data) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, type, state, null, data, e, null));
    }

    static Message error(RestTypeEnum type, String e, Integer state, Object data, Object params) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, type, state, null, data, e, params));
    }

    static Message error(RestTypeEnum type, String e, String message) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, type, null, message, null, e, null));
    }

    static Message error(RestTypeEnum type, String e, String message, Object data) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, type, null, message, data, e, null));
    }

    static Message error(RestTypeEnum type, String e, String message, Object data, Object params) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, type, null, message, data, e, params));
    }

    static Message error(RestTypeEnum type, String e, Object data) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, type, null, null, data, e, null));
    }

    static Message error(RestTypeEnum type, String e, Object data, Object params) {
        return RestMessageDTO.adapt(new RestMessageDTO(NetworkEnum.ERROR, type, null, null, data, e, params));
    }
}
