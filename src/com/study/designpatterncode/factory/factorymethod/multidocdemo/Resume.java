package com.study.designpatterncode.factory.factorymethod.multidocdemo;

/**
 * 具体工厂类一个人简历，包括技能、教育、经验
 *
 * @author Joe
 * @create 2017-12-05 15:50
 **/

public class Resume extends Document {
    @Override
    public void createPages() {
        pages.add(new SkillsPage());
        pages.add(new EducationPage());
        pages.add(new ExperiencePage());
    }
}
