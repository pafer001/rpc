package com.rpc.test;

import com.rpc.server.RpcServer;

public class ServerTest {

    public static void main(String[] args) throws ClassNotFoundException {
        RpcServer server = new RpcServer();
        server.start(9998, "qjm.rpc.test");
    }

}
