package project.linkerfs.linkerfswarpgen4j.dto.response;


import lombok.Data;
import project.linkerfs.linkerfswarpgen4j.common.ResponseCode;

@Data
public class ResponseDto<T> {
    private long code;
    private T data;
    private String msg;

    private ResponseDto(long code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static <T> ResponseDto<T> success() {
        return new ResponseDto<>(ResponseCode.SUCCESS.getCode(), null, ResponseCode.SUCCESS.getMessage());
    }

    public static <T> ResponseDto<T> success(T data) {
        return new ResponseDto<>(ResponseCode.SUCCESS.getCode(), data, ResponseCode.SUCCESS.getMessage());
    }

    public static <T> ResponseDto<T> fail(long code, String msg) {
        return new ResponseDto<>(code, null, msg);
    }

}
