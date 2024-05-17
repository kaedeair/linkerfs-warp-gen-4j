package project.linkerfs.linkerfswarpgen4j.common;

public enum ResponseCode implements ResponseCodeBaseEnum {

    SUCCESS(200, "Succuess"),
    NOT_FOUND(404, "Not Found"),
    VALIDATION_ERROR(400, "Validation Error"),
    FAILURE(500, "Failure");
    private long code;
    private String message;

    ResponseCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
