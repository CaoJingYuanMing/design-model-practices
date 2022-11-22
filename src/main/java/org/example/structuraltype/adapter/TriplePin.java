package org.example.structuraltype.adapter;

/**
 * 三孔插线头
 */
public interface TriplePin {
    // 参数分别为火线live，零线null，地线earth

    /**
     * 三孔插头通电模式
     * @param live 火线
     * @param nul 零线
     * @param earth 地线
     */
    void electrify(int live, int nul, int earth);
}
