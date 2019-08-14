package com.easyway.designpatterns.factory;

public class TestMain {


   static abstract class BMW {
        public BMW() {

        }
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


    public static class Factory {
        public BMW createBMW(int type) {
            switch (type) {

                case 320:
                    return new BMW320();

                case 523:
                    return new BMW523();

                default:
                    break;
            }
            return null;
        }
    }

    /**
     * 静态工厂(简单工厂) 静态指的是死的
     * @param args
     */
    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);
    }

}
