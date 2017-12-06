package com.study.designpatterncode.factory.factorymethod.multidocdemo;

/**
 * 测试类
 *
 * @author Joe
 * @create 2017-12-05 15:54
 **/

public class MyClient {
    public static void main(String[] args) {
        Document[] docs = new Document[2];
        docs[0] = new Resume();
        docs[1] = new Report();
        for(Document document : docs){
            System.out.println("\n" + document + "-----------");
            for(Page page : document.getPages()){
                //System.out.println("\t" + page);
                page.printContext();
            }
        }
    }
}
