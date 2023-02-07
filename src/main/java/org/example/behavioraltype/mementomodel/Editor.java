package org.example.behavioraltype.mementomodel;

import java.util.ArrayList;
import java.util.List;

/**
 * 编辑器
 */
public class Editor {
    // 注入文档信息
    private Doc doc;
    private List<History> historyRecords;
    // 历史记录当前位置
    private int historyPosition = -1;

    public Editor(Doc doc) {
        System.out.println("<<<打开文档" + doc.getTitle());
        this.doc = doc; // 注入文档
        historyRecords = new ArrayList<>();// 初始化历史记录
        backup();// 保存一份历史记录
        show();//显示内容
    }

    private void backup() {
        historyRecords.add(doc.createHistory());
        historyPosition++;
    }

    public void append(String txt) {
        System.out.println("<<<插入操作");
        doc.setBody(doc.getBody() + txt);
        show();
    }

    public void save() {
        System.out.println("<<<存盘操作");
    }

    public void delete() {
        System.out.println("<<<删除操作");
        doc.setBody("");
        show();
    }

    private void show() {
        // 显示当前文本内容
        System.out.println(doc.getBody());
        System.out.println("文章结束>>>\n");
    }

    /**
     * 撤销键
     */
    public void undo() {
        // 撤销操作：如按下Ctr+Z，回到过去。
        System.out.println(">>>撤销操作");
        if (historyPosition == 0) {
            return;//到头了，不能再撤销了。
        }
        historyPosition--;//历史记录位置回滚一笔
        History history = historyRecords.get(historyPosition);
        doc.restoreHistory(history);//取出历史记录并恢复至文档
        show();
    }
}
