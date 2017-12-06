package com.study.designpatterncode.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * 测试类
 *
 * @author Joe
 * @create 2017-12-06 10:49
 **/

public class client {
    public  static  List<LoadBalacer> loadBalacers = new ArrayList<>();
    public static  CountDownLatch latch = new CountDownLatch(4);
    public static void main(String[] args) {
//        LoadBalacer b1 = LoadBalacer.getInstance();
//        LoadBalacer b2 = LoadBalacer.getInstance();
//        LoadBalacer b3 = LoadBalacer.getInstance();
//        LoadBalacer b4 = LoadBalacer.getInstance();

//        //检查是否相同，是单一实例
//        if((b1 == b2) && (b2 == b3) && (b3 == b4)){
//            System.out.println("Same instance");
//        }

        try {
            for(int i = 0; i < 4; i++){
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        LoadBalacer l =  LoadBalacer.getInstance();
                        loadBalacers.add(l);
                        System.out.println(Thread.currentThread().getName() + "运行==" + l);
                        latch.countDown();

                    }
                }).start();
            }
            latch.await();
            for(int i = 0; i < loadBalacers.size() - 1; i++) {
                if(loadBalacers.get(i) == loadBalacers.get(i + 1)){
                    System.out.println(i + "和" + (i + 1) + "的实例相同");
                }
                System.out.println("i:" + i + "=====" + loadBalacers.get(i));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        //负载均衡：随机选择一个服务期来运行
//        System.out.println(b1.getServer());
//        System.out.println(b2.getServer());
//        System.out.println(b3.getServer());
//        System.out.println(b4.getServer());
    }
}
