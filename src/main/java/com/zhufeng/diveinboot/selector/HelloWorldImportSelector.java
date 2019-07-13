package com.zhufeng.diveinboot.selector;

import com.zhufeng.diveinboot.Annotation.SelectorMode;
import com.zhufeng.diveinboot.config.HelloCustConfiguration;
import com.zhufeng.diveinboot.config.HelloWorldConfiguration;

public class HelloWorldImportSelector extends SelectorModeImportSelector {


    @Override
    protected String[] selectImports(SelectorMode selectorMode) {
        if(SelectorMode.HELLOWORLD.equals(selectorMode)) {
            return new String[]{HelloWorldConfiguration.class.getName()};
        } else {
            return new String[]{HelloCustConfiguration.class.getName()};
        }
    }
}
