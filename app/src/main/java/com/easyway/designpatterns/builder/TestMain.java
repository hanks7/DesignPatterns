package com.easyway.designpatterns.builder;

/**
 * 构建者模式
 */
public class TestMain {

    public static void main(String[] args) {
//比如，配置打印日志，不订阅上下线
        PushConfig pushBuildConfig = new Builder()
                .setDebugModle(true)
                .setInitPresence(false)
                .build();


    }


}
