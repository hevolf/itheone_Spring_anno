package com.evolf.cap06_Import.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class JamesImportSelector implements ImportSelector{
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata){
		//返回全类名的bean
		return new String[]{"com.enjoy.cap06_Import.bean.Fish","com.enjoy.cap06_Import.bean.Tiger"};
	}
}
