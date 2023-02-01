package org.example.structuraltype.proxy.testdynamicproxy;

/**
 * 股市
 */
public interface StockMarket {
    /**
     * 购买股票
     * @param stockNo  股票代码
     * @param share 份额
     * @param price 价格
     */
    void purchaseShares(String stockNo, int share, double price);
}
