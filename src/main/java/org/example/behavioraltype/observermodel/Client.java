package org.example.behavioraltype.observermodel;

/**
 * 观察者模式
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 缺点: 每次都是由消费者来询问有无货物
         * 如果消费者数量大，不但会影响性能，而且代码会一直做无用功地询问
         */

        /*
        Shop shop = new Shop();
        Buyer wukong = new Buyer("悟空", shop);
        Buyer shaseng = new Buyer("沙僧", shop);
        Buyer bajie = new Buyer("八戒", shop);

        wukong.buy();// 悟空购买：无商品
        bajie.buy();// 八戒购买：无商品
        shaseng.buy();// 沙僧购买：无商品
        bajie.buy();// 八戒购买：无商品

        // 师傅忍不住了，也加入了购买行列。
        Buyer tangseng = new Buyer("唐僧", shop);
        // 唐僧购买：无商品
        tangseng.buy();

        // 除了八戒其他人都放弃了
        bajie.buy();// 八戒购买：无商品
        bajie.buy();// 八戒购买：无商品

        // 商店终于进货了
        shop.setProduct("最新旗舰手机");
        // 八戒购买：最新旗舰手机
        bajie.buy();
        */

        /**
         * 重构后
         * 使用观察者模式，改为由商店来通知大家取货和换货
         */
        Shop shop = new Shop();
        Buyer tanSir = new PhoneFans("果粉唐僧", shop);
        Buyer barJeet = new HandChopper("剁手族八戒", shop);

        // 买家注册
        shop.register(tanSir);
        shop.register(barJeet);

        // 商店到货
        shop.setProduct("猪肉炖粉条");
        // 通知所有购买者
        shop.notifyBuyers();

        shop.setProduct("水果手机【爱疯叉】");
        // 通知所有购买者
        shop.notifyBuyers();
    }
}
