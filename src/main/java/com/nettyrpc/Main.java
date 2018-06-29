package com.nettyrpc;


import com.nettyrpc.hello.HelloRpc;
import com.nettyrpc.hello.HelloRpcImpl;

public class Main {

    public static void main(String[] args) {
        HelloRpc helloRpc = new HelloRpcImpl();
        helloRpc = RPCProxy.create(helloRpc);
        System.err.println(helloRpc.hello("rpc"));
    }
}
