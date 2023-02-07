package org.example.behavioraltype.mementomodel;

/**
 * 文档描述
 */
public class Doc {
    private String title;
    private String body;

    // 新建文档先命名
    public Doc(String title) {
        this.title = title;
        this.body = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public History createHistory() {
        return new History(body);//创建历史记录
    }

    public void restoreHistory(History history) {
        this.body = history.getBody();//恢复历史记录
    }
}
