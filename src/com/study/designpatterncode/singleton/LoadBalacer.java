package com.study.designpatterncode.singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * 多线程环境
 *
 * @author Joe
 * @create 2017-12-06 10:43
 **/

public class LoadBalacer {
    private static LoadBalacer balancer = null;

    //服务器队列
    private ArrayList<String> servers = new ArrayList<>();
    private Random random = new Random();

    //构造函数
    protected  LoadBalacer(){
        servers.add("ServerI");
        servers.add("ServerII");
        servers.add("ServerIII");
        servers.add("ServerIV");
        servers.add("ServerV");
    }

    //返回单例， 需要保证线程安全
    public static synchronized  LoadBalacer getInstance(){
        if(balancer == null){
            balancer = new LoadBalacer();
        }
        return balancer;
    }

    public String getServer(){
        int r = random.nextInt(servers.size());
        return servers.get(r);
    }
}
