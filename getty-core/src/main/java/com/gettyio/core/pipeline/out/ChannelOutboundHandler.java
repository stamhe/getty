/**
 * 包名：org.getty.core.pipeline.out
 * 版权：Copyright by www.getty.com
 * 描述：
 * 邮箱：189155278@qq.com
 * 时间：2019/9/27
 */
package com.gettyio.core.pipeline.out;

import com.gettyio.core.channel.AioChannel;
import com.gettyio.core.pipeline.ChannelboundHandler;

/**
 * 类名：ChannelOutboundHandler.java
 * 描述：
 * 修改人：gogym
 * 时间：2019/9/27
 */
public interface ChannelOutboundHandler extends ChannelboundHandler {


    /**
     * 消息写出
     *
     * @param aioChannel 通道
     * @param obj        数据
     * @throws Exception 异常
     */
    void channelWrite(AioChannel aioChannel, Object obj) throws Exception;


    /**
     * 消息编码
     *
     * @param aioChannel 通道
     * @param obj        数据
     * @throws Exception 异常
     */
    void encode(AioChannel aioChannel, Object obj) throws Exception;

}
