package com.evolf.cap01;

        import com.evolf.cap01.config.MainConfig;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.annotation.AnnotationConfigApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest2 {
    public static void main(String[] args) {
        //加载xml
//        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
//        Person person = (Person) app.getBean("person");
//        System.out.println(person);

        ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);
//        Person person = (Person) app.getBean("person2");//person02?
//        System.out.println(person);

        String[] namesForBean = app.getBeanNamesForType(Person.class);
        for(String name:namesForBean){
            System.out.println(name);
        }
    }
}
