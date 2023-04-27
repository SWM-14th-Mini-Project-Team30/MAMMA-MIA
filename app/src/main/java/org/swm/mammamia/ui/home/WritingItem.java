package org.swm.mammamia.ui.home;

public class WritingItem {
    String title;
    String category;
    String sake;
    String content;
    int detail_pic;


    public WritingItem(String title, String category, String sake, String content, int detail_pic) {
        this.title = title;
        this.category = category;
        this.sake = sake;
        this.content = content;
        this.detail_pic= detail_pic;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSake() {
        return sake;
    }

    public void setSake(String sake) {
        this.sake = sake;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDetail_pic() {
        return detail_pic;
    }

    public void setDetail_pic(int detail_pic) {
        this.detail_pic = detail_pic;
    }
}
