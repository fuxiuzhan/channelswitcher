package com.fxz.channel.common.codec;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;

import java.util.List;

/**
 * 编解码器
 *
 * @author fxz
 */
public class NettyCodec extends MessageToMessageCodec {
    @Override
    protected void encode(ChannelHandlerContext ctx, Object msg, List out) throws Exception {

    }

    @Override
    protected void decode(ChannelHandlerContext ctx, Object msg, List out) throws Exception {

    }
}
