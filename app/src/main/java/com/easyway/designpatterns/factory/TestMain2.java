package com.easyway.designpatterns.factory;

/**
 * https://segmentfault.com/a/1190000015050674
 */
public class TestMain2 {


    static abstract class BMW {

    }

    public static class BMW320 extends BMW {
        public BMW320() {
            System.out.println("制造-->BMW320");
        }
    }

    public static class BMW523 extends BMW {
        public BMW523() {
            System.out.println("制造-->BMW523");
        }
    }


    interface FactoryBMW {
        BMW createBMW();
    }

    public static class FactoryBMW320 implements FactoryBMW {

        @Override
        public BMW320 createBMW() {

            return new BMW320();
        }

    }

    public static class FactoryBMW523 implements FactoryBMW {
        @Override
        public BMW523 createBMW() {

            return new BMW523();
        }
    }

    /**
     * 工厂方法模式实例
     *
     * @param args
     */
    public static void main(String[] args) {
        FactoryBMW factoryBMW320 = new FactoryBMW320();
        BMW bmw320 = factoryBMW320.createBMW();

        FactoryBMW factoryBMW523 = new FactoryBMW523();
        BMW bmw523 = factoryBMW523.createBMW();
    }

}
