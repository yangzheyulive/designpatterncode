package com.study.designpatterncode.factory.abstractfactory.computer;

/**
 * 定义抽象电脑工厂类
 * 优点：
 * 应用抽象工厂模式符合GRASP纯虚构的模式，可以实现高内聚低耦合的设计目的，因此抽象工厂模式得到了广泛应用。
 * 缺点：
 * 添加新的产品对象时，难易扩展抽象工厂以便生产新种类的产品
 * 适用场景：
 * 1、系统需要屏蔽有关对象如何创建、如何组织和如何表示
 * 2、系统需要由关联的多个对象来构成
 * 3、有关联的多个对象需要一起应用并且它们的约束是强迫的(不可分离)
 * 4、你想提供一组对象而不显示他们的实现过程，只显示它们的接口
 * @author Joe
 * @create 2017-12-05 19:01
 **/

public  abstract class ComputerFactory {
    protected  Cpu iCpu;
    protected  HardDisc iHD;
    protected  MainBoard iMB;

    public  void Show(){
        try {
            System.out.println(this.getClass().getName() + "生产的电脑配置");
            System.out.println("CPU:" + iCpu.designCPU());
            System.out.println("HardDisk:" + iHD.designHardDisc());
            System.out.print("MainBoard:");
            iMB.Attach(iCpu);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
