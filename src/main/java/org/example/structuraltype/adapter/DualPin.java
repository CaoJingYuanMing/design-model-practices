package org.example.structuraltype.adapter;

/**
 * 双孔插头
 */
public interface DualPin {
    /**
     * 通电
     * @param live 火线
     * @param nul 地线
     */
    void electrify(int live, int nul);
}
