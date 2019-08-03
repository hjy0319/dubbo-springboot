package com.springboot.dubbo.dubboprovider;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

/**
 * dubbo SPI测试
 *
 * @Author hujy
 * @Date Created in 2019-08-03 15:51
 * @Version 1.0
 */
public class DubboSPITest {
    public static void main(String[] args) {
        Protocol myprotocol = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("myprotocol");

        System.out.println(myprotocol.getDefaultPort());
    }
}
