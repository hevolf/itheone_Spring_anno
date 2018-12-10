package com.evolf.cap02_Filter.config;

import com.evolf.cap01.Person;
import com.evolf.cap02_Filter.controller.OrderController;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@Configuration
//扫描所有组件 service controller 等等 @ComponentScan
//ixcludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
//}
//useDefaultFilters = false 不适用默认配置
@ComponentScan(value = "com.evolf.cap02_Filter", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})//注解类型
}, useDefaultFilters = false) //excludeFilters 不扫描@Controller，useDefaultFilters = false所以默认没有要扫描的注解 //include有指定的扫描


//@ComponentScan(value = "com.evolf.cap02_Filter", includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {OrderController.class})//指定类型
//}, useDefaultFilters = false)
//
//@ComponentScan(value = "com.evolf.cap02_Filter", includeFilters = {
//        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {com.enjoy.cap2.config.JamesTypeFilter.class})//自定义类型
//}, useDefaultFilters = false)


//@ComponentScans(
//        value = {@ComponentScan(value = "com.evolf.cap02_Filter", includeFilters = {
//                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {com.evolf.cap02_Filter.config.JamesTypeFilter.class})//自定义类型
//        }, useDefaultFilters = false)
//                ,
//                @ComponentScan(value = "com.evolf.cap02_Filter", includeFilters = {
//                        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {OrderController.class})//指定类型
//                }, useDefaultFilters = false)}
//)
public class Cap2MainConfig {
    ////给容器中注册一个bean, 类型为返回值的类型, beanId名称未指定时默认为方法名
    @Bean
    public Person person02() {
        return new Person("caohaifeng", 20);
    }
}
