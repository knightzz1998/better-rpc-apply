package cn.knightzz.rpc.provider.service.impl;

import cn.knightzz.rpc.provider.service.DemoService;
import io.knightzz.rpc.annotation.RpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 王天赐
 * @title: DemoServiceImpl
 * @projectName better-rpc-apply
 * @description:
 * @website <a href="https://knightzz.cn/">https://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2023-03-06 20:35
 */
@RpcService(
        interfaceClass = DemoService.class,
        interfaceClassName = "cn.knightzz.rpc.provider.service.DemoService",
        version = "1.0.0",
        group = "knightzz"
)
public class DemoServiceImpl implements DemoService {

    private final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public String hello(String name) {
        logger.info("调用 hello 方法, 传入参数为 name = {} ", name);
        return "hello : " + name;
    }
}
