package org.hyl.bucket.commons.result.enums;

public enum NetworkEnum {

    SUCCESS(true) {
        @Override
        public int getState(Integer state) {
            return (state != null) ? state : MessageEnum.SUCCESS.getState();
        }

        @Override
        public String getMessage(String message) {
            return (message != null) ? message : MessageEnum.SUCCESS.getMessage();
        }
    },
    ERROR(false) {
        @Override
        public int getState(Integer state) {
            return (state != null) ? state : MessageEnum.ERROR.getState();
        }

        @Override
        public String getMessage(String message) {
            return (message != null) ? message : MessageEnum.ERROR.getMessage();
        }
    };

    private final boolean success;

    NetworkEnum(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public abstract int getState(Integer state);

    public abstract String getMessage(String message);
}
