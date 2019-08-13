package com.easyway.designpatterns.builder;

public class Builder {
    boolean debugModel = false;
    boolean initPresence = true;
    boolean initPush = true;



    /**
     * 设置是否打印log
     *
     * @param debugModel
     * @return true 打印
     */
    public Builder setDebugModle(boolean debugModel) {
        this.debugModel = debugModel;
        return this;
    }

    /**
     * 设置是否订阅上下线
     *
     * @param initPresence
     * @return true 订阅
     */
    public Builder setInitPresence(boolean initPresence) {
        this.initPresence = initPresence;
        return this;
    }

    /**
     * 是否注册推送
     *
     * @param initJPush
     * @return
     */
    public Builder setInitPush(boolean initJPush) {
        this.initPush = initJPush;
        return this;
    }

    /**
     * 关键方法，在配置完成后进行build就创建好配置了
     *
     * @return
     */
    public Bean build() {
        return new Bean(this);
    }


}
