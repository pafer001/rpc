package com.nettyrpc.hello;

public class HelloRpcImpl implements HelloRpc {

    @Override
    public String hello(String name) {
        return "hello " + name;
    }

}
