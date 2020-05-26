package com.panda.rpc;

@RpcService(value = IHelloService.class, version = "v1.0")
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(double money) {
        System.out.println("【v1.0】request int sayHello:" + money);
        return "【v1.0】Say Hello:" + money;
    }

    @Override
    public String saveUser(User user) {
        System.out.println("【v1.0】request in saveUser:" + user);
        return "【V1.0】SUCCESS";
    }
}
