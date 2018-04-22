package org.hyl.bucket.web.commons.rest.enums;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;

public enum Result {
    SUCCESS(HttpStatus.OK.value(), "请求成功"),
    SUCCESS_POST(HttpStatus.CREATED.value(), "新增数据成功"),
    SUCCESS_DELETE(HttpStatus.OK.value(), "删除数据成功"),
    SUCCESS_GET(HttpStatus.OK.value(), "查询数据成功"),
    SUCCESS_PUT(HttpStatus.OK.value(), "修改数据成功"),
    ERROR(HttpStatus.INTERNAL_SERVER_ERROR.value(), "请求失败，请稍后再试"),
    ERROR_POST(HttpStatus.INTERNAL_SERVER_ERROR.value(), "新增数据失败，请稍后再试"),
    ERROR_DELETE(HttpStatus.INTERNAL_SERVER_ERROR.value(), "删除数据失败，请稍后再试"),
    ERROR_GET(HttpStatus.INTERNAL_SERVER_ERROR.value(), "查询数据失败，请稍后再试"),
    ERROR_PUT(HttpStatus.INTERNAL_SERVER_ERROR.value(), "修改数据失败，请稍后再试");

    private final int state;

    private final String message;

    Result(int state, String message) {
        this.state = state;
        this.message = message;
    }

    public int getState() {
        return state;
    }

    public String getMessage() {
        return message;
    }

    public enum Network {
        SUCCESS(true), ERROR(false);

        private final boolean success;

        Network(boolean success) {
            this.success = success;
        }

        public boolean isSuccess() {
            return success;
        }
    }

    public enum Type {
        DEFAULT {
            @Override
            public int getState(Network network) {
                return getState(network, null);
            }

            @Override
            public String getMessage(Network network) {
                return getMessage(network, null);
            }

            @Override
            public int getState(Network network, Integer state) {
                return (state == null) ? ((Network.SUCCESS == network) ? SUCCESS.getState() : ERROR.getState()) : state;
            }

            @Override
            public String getMessage(Network network, String message) {
                return StringUtils.isBlank(message) ? ((Network.SUCCESS == network) ? SUCCESS.getMessage() : ERROR.getMessage()) : message;
            }
        },
        POST {
            @Override
            public int getState(Network network) {
                return getState(network, null);
            }

            @Override
            public String getMessage(Network network) {
                return getMessage(network, null);
            }

            @Override
            public int getState(Network network, Integer state) {
                return (state == null) ? ((Network.SUCCESS == network) ? SUCCESS_POST.getState() : ERROR_POST.getState()) : state;
            }

            @Override
            public String getMessage(Network network, String message) {
                return StringUtils.isBlank(message) ? ((Network.SUCCESS == network) ? SUCCESS_POST.getMessage() : ERROR_POST.getMessage()) : message;
            }
        },
        DELETE {
            @Override
            public int getState(Network network) {
                return getState(network, null);
            }

            @Override
            public String getMessage(Network network) {
                return getMessage(network, null);
            }

            @Override
            public int getState(Network network, Integer state) {
                return (state == null) ? ((Network.SUCCESS == network) ? SUCCESS_DELETE.getState() : ERROR_DELETE.getState()) : state;
            }

            @Override
            public String getMessage(Network network, String message) {
                return StringUtils.isBlank(message) ? ((Network.SUCCESS == network) ? SUCCESS_DELETE.getMessage() : ERROR_DELETE.getMessage()) : message;
            }
        },
        GET {
            @Override
            public int getState(Network network) {
                return getState(network, null);
            }

            @Override
            public String getMessage(Network network) {
                return getMessage(network, null);
            }

            @Override
            public int getState(Network network, Integer state) {
                return (state == null) ? ((Network.SUCCESS == network) ? SUCCESS_GET.getState() : ERROR_GET.getState()) : state;
            }

            @Override
            public String getMessage(Network network, String message) {
                return StringUtils.isBlank(message) ? ((Network.SUCCESS == network) ? SUCCESS_GET.getMessage() : ERROR_GET.getMessage()) : message;
            }
        },
        PUT {
            @Override
            public int getState(Network network) {
                return getState(network, null);
            }

            @Override
            public String getMessage(Network network) {
                return getMessage(network, null);
            }

            @Override
            public int getState(Network network, Integer state) {
                return (state == null) ? ((Network.SUCCESS == network) ? SUCCESS_PUT.getState() : ERROR_PUT.getState()) : state;
            }

            @Override
            public String getMessage(Network network, String message) {
                return StringUtils.isBlank(message) ? ((Network.SUCCESS == network) ? SUCCESS_PUT.getMessage() : ERROR_PUT.getMessage()) : message;
            }
        };

        public abstract int getState(Network network);

        public abstract String getMessage(Network network);

        public abstract int getState(Network network, Integer state);

        public abstract String getMessage(Network network, String message);
    }
}
