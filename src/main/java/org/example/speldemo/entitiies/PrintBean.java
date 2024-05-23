package org.example.speldemo.entitiies;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


public class PrintBean implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // Perform custom processing before bean initialization
        System.out.println("Before Initialization: " + bean.getClass());
        return bean; // Return the bean as-is or modified
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // Perform custom processing after bean initialization
        System.out.println("After Initialization: " + bean.getClass());
        return bean; // Return the bean as-is or modified
    }
}
