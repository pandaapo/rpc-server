package com.panda.rpc;

@RpcService(value = IHelloService.class, version = "v2.0")
public class HelloServiceImpl2 implements IHelloService {
    @Override
    public String sayHello(double money) {
        System.out.println("【v2.0】request int sayHello:" + money);
        return "【v2.0】Say Hello:" + money;
    }

    @Override
    public String saveUser(User user) {
        System.out.println("【v2.0】request in saveUser:" + user);
        return "【V2.0】SUCCESS";
    }
}
