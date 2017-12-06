package com.study.designpatterncode.factory.factorymethod.multidocdemo;

/**
 * 具体工厂类--报告，包括介绍、结果、结论、总结、文献
 *
 * @author Joe
 * @create 2017-12-05 15:56
 **/

public class Report extends Document {

    @Override
    public void createPages() {
        pages.add(new IntroductionPage());
        pages.add(new ResultPage());
        pages.add(new ConclusionPage());
        pages.add(new SummaryPage());
        pages.add(new BibliographyPage());
    }
}
