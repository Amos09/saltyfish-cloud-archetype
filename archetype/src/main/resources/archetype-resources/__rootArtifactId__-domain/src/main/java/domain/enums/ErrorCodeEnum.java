#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain.enums;

import com.saltyfish.framework.common.exception.IResultCode;
import lombok.AllArgsConstructor;

/**
 * 错误码枚举类
 */
@AllArgsConstructor
public enum ErrorCodeEnum implements IResultCode {

    SUCCESS(200, "操作成功"), SYSTEM_ERROR(500, "系统异常"), CONFIG_NOT_EXISTS(1001000001, "参数配置不存在"),
    DATA_NOT_EXISTS(401, "数据不存在!"),

    ;

    private Integer code;

    private String message;

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }


}
