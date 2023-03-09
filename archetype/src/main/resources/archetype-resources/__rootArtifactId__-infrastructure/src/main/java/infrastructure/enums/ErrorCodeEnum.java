#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.infrastructure.enums;


import ${groupId}.framework.common.exception.IResultCode;
import lombok.AllArgsConstructor;

/**
 * 错误码枚举类
 *
 */
@AllArgsConstructor
public enum ErrorCodeEnum implements IResultCode {
    
    CONFIG_NOT_EXISTS(1001000001, "参数配置不存在"),

    ;

    private Integer code;
    private String message;

    @Override
    public Integer getCode() {
        return this.code;
    }

    public void setCode(final Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
