package com.easyui.pojo;

/**
 * easyui 分页
 * AlbertXe
 * 2020/2/5 10:42
 */
public class Page {
    /**
     * 页码数
     */
    private int page;
    /**
     * 每页条数
     */
    private int rows;
    /**
     * 升或降
     */
    private String order;
    /**
     *  排序字段
     */
    private String sort;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
