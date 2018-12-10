package com.evolf.cap02_Filter.config;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class JamesTypeFilter implements TypeFilter{
	private ClassMetadata classMetadata;

	/*
	 * MetadataReader:读取到当前正在扫描类的信息
	 * MetadataReaderFactory:可以获取到其他任何类信息
	 */

	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		//获取当前类 		注解的信息
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		//获取当前正在扫描的 	类信息
		classMetadata = metadataReader.getClassMetadata();
		//获取当前 			类资源(类的路径)
		Resource resource = metadataReader.getResource();

		String className = classMetadata.getClassName();
		System.out.println("----->"+className);
		if(className.contains("Dao")){//当类包含er字符, 则匹配成功,返回true
			return true;
		}
		return false;
	}

}
