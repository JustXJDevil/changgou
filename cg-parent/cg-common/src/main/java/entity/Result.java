package entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 描述
 *
 * @author 三国的包子
 * @version 1.0
 * @package entity *
 * @since 1.0
 */
@ApiModel(description = "Result",value = "Result")
public class Result<T> implements Serializable {
    @ApiModelProperty(value = "is successful,true or false",required = true)
    private boolean flag;//是否成功
    @ApiModelProperty(value = "state code,20000:success,20001:fail,20002:username or password error,20003:Insufficient permissions," +
            "20004:remote call fail,20005:Repetitive operation,20006:no corresponding buying data",required = true)
    private Integer code;//返回码
    @ApiModelProperty(value = "message",required = true)
    private String message;//返回消息
    @ApiModelProperty(value = "data",required = true)
    private T data;//返回数据

    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = (T) data;
    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result() {
        this.flag = true;
        this.code = StatusCode.OK;
        this.message = "操作成功!";
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
