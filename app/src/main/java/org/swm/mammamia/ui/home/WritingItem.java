package org.swm.mammamia.ui.home;

public class WritingItem {
    String title;
    String category;
    String sake;

    public WritingItem(String title, String category, String sake) {
        this.title = title;
        this.category = category;
        this.sake = sake;
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
}
