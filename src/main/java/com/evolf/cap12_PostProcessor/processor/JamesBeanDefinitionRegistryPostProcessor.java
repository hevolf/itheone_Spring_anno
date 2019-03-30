package com.evolf.cap12_PostProcessor.processor;

import com.evolf.cap09_Autowired.bean.Moon;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;


//BeanDefinitionRegistryPostProcessor extends BeanFactoryPostProcessor
@Component
public class JamesBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor{

	//重写BeanFactoryPostProcessor
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("JamesBeanDefinitionProcessor..postProcessBeanFactory(),Bean的数量"+beanFactory.getBeanDefinitionCount());
	}

	//重写BeanDefinitionRegistryPostProcessor  （先执行）
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("amesBeanDefinition.postProcessBeanDefinitionRegistry()...bean的数量"+registry.getBeanDefinitionCount());
		//先定义bean 加入到registry  然后
		//RootBeanDefinition rbd = new RootBeanDefinition(Moon.class);
		AbstractBeanDefinition rbd = BeanDefinitionBuilder.rootBeanDefinition(Moon.class).getBeanDefinition();
		registry.registerBeanDefinition("hello", rbd);
	}

}
