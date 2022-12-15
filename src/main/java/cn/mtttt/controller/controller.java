package cn.mtttt.controller;

import cn.mtttt.bean.SchoolRoll;
import cn.mtttt.service.LatterService;
import cn.mtttt.service.OriginService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class controller {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("SpringDataSources/LatterDataSource.xml");
        LatterService latter = classPathXmlApplicationContext.getBean("latter", LatterService.class);
        List<SchoolRoll> schoolRolls = latter.selectSchoolRoll();
        for (SchoolRoll schoolRoll : schoolRolls) {
            System.out.println(schoolRoll);
        }
    }
    @Test
    public void test2(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("SpringDataSources/OriginDataSource.xml");
        OriginService origin = classPathXmlApplicationContext.getBean("origin", OriginService.class);
        List<SchoolRoll> schoolRolls = origin.selectSchoolRoll();
        for (SchoolRoll schoolRoll : schoolRolls) {
            System.out.println(schoolRoll);
        }
    }
}
