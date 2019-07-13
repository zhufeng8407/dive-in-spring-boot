package com.zhufeng.diveinboot.selector;

import com.zhufeng.diveinboot.Annotation.SelectorMode;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.lang.Nullable;

public abstract class SelectorModeImportSelector implements ImportSelector {

    public static final String DEFAULT_SELECTOR_MODE_ATTRIBUTE_NAME = "selectorMode";

    protected String getSelecteModeAttributeName() {
        return DEFAULT_SELECTOR_MODE_ATTRIBUTE_NAME;
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

//        Class<?> annType = GenericTypeResolver.resolveTypeArgument(getClass(), SelectorModeImportSelector.class);
//        Assert.state(annType != null, "Unresolvable type argument for SelectorModeImportSelector");

        AnnotationAttributes attributes = AnnotationAttributes
                .fromMap(importingClassMetadata.getAnnotationAttributes(
                        importingClassMetadata.getAnnotationTypes().iterator().next(), true));
        if (attributes == null) {
            throw new IllegalArgumentException(String.format(
                    "@%s is not present on importing class '%s' as expected",
                    getClass().getName(), importingClassMetadata.getClassName()));
        }

        SelectorMode selectorMode = attributes.getEnum(getSelecteModeAttributeName());
        String[] imports = selectImports(selectorMode);
        if (imports == null) {
            throw new IllegalArgumentException("Unknown SelectorMode: " + selectorMode);
        }
        return imports;
    }


    @Nullable
    protected abstract String[] selectImports(SelectorMode selectorMode);
}
