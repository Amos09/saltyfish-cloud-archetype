package com.saltyfish.client.constant;

import com.saltyfish.framework.common.constant.RpcConstants;

/**
 * API 相关的枚举
 */
public class ApiConstants {

    private ApiConstants() {
    }

    /**
     * 服务名
     * <p>
     * 注意，需要保证和 spring.application.name 保持一致
     */
    public static final String NAME = "archetype-server";

    public static final String PREFIX = RpcConstants.RPC_API_PREFIX + "/archetype";

    public static final String VERSION = "1.0.0";

}
