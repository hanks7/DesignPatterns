package com.easyway.designpatterns.builder;

public class Bean {
    /**
     * 是否是debug模式
     */
    public final boolean debugModel;
    /**
     * 是否订阅上下线
     */
    public final boolean initPresence;
    /**
     * 是否注册推送
     */
    public final boolean initPush;

    Bean(Builder builder) {
        this.debugModel = builder.debugModel;
        this.initPresence = builder.initPresence;
        this.initPush = builder.initPush;
    }


}
