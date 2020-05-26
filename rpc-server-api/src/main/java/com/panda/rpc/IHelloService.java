package com.panda.rpc;

public interface IHelloService {
    String sayHello(double money);

    /**
     * 保存用户
     */
    String saveUser(User user);
}
