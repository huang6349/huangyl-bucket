package org.hyl.bucket.commons.result.enums;

public enum Result {
    SUCCESS(200, "请求成功"),
    ERROR(500, "请求失败，请稍后再试");

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
        SUCCESS(true) {
            @Override
            public int getState(Integer state) {
                return (state != null) ? state : Result.SUCCESS.getState();
            }

            @Override
            public String getMessage(String message) {
                return (message != null) ? message : Result.SUCCESS.getMessage();
            }
        },
        ERROR(false) {
            @Override
            public int getState(Integer state) {
                return (state != null) ? state : Result.ERROR.getState();
            }

            @Override
            public String getMessage(String message) {
                return (message != null) ? message : Result.ERROR.getMessage();
            }
        };

        private final boolean success;

        Network(boolean success) {
            this.success = success;
        }

        public boolean isSuccess() {
            return success;
        }

        public abstract int getState(Integer state);

        public abstract String getMessage(String message);
    }
}
