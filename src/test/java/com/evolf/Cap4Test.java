
import com.evolf.cap04_Lazy.config.Cap4MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap4Test {
    @Test
    public void test01(){
        //不加@lazy  容器创建过程中就创建bean
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap4MainConfig.class);

        System.out.println("IOC容器创建完成........");
//        app.getBean("person");//执行获取的时候才创建并初始化bean
        app.getBean("person");//执行获取的时候才创建并初始化bean

    }
}
