package com.fxz.channel.common.cache;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/**
 * 缓存接口
 *
 * @author fxz
 */
public interface Cache {
    Boolean set(String key, Object value);

    Object get(String key);

    Boolean set(String key, Integer expr, TimeUnit timeUnit);

    Boolean checkExsit(String key);
}
