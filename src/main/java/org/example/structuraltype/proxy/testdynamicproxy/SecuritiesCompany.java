package org.example.structuraltype.proxy.testdynamicproxy;

/**
 * 证券公司
 */
public class SecuritiesCompany implements StockMarket{
    @Override
    public void purchaseShares(String stockNo, int share, double price) {
        System.out.println("您购买了股票代码为 : " + stockNo + ", 份额为: " + share + ", 单价为: " + price);
        System.out.println("您购入金额为: " + share * price);
    }
}
