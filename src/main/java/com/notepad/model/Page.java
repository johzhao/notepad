package com.notepad.model;

import java.util.Collection;

/**
 * @author jzhao
 */
@SuppressWarnings("unused")
public class Page<T> {
    private int page;
    private int totalPage;
    private Collection<T> content;

    public Page(int page, int totalPage, Collection<T> content) {
        this.page = page;
        this.totalPage = totalPage;
        this.content = content;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public Collection<T> getContent() {
        return content;
    }

    public void setContent(Collection<T> content) {
        this.content = content;
    }
}
