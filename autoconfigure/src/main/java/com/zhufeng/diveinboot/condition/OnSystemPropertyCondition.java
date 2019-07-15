package com.zhufeng.diveinboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class OnSystemPropertyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
        Map<String, Object> annotationAttributes = metadata
                .getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());

        String propertyName = (String) annotationAttributes.get("name");
        String proertyValue = (String) annotationAttributes.get("value");

        String javaPropertyValue = System.getProperty(propertyName);

        return proertyValue.equals(javaPropertyValue);
    }
}
