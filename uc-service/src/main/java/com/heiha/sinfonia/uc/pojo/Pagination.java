package com.heiha.sinfonia.uc.pojo;

import com.heiha.sinfonia.uc.exception.PaginationException;

import java.io.Serializable;

public class Pagination {
    public static final int DEFAULT_PAGE_SIZE = Integer.MAX_VALUE;
    private Integer page;
    private Integer numPerPage;
    private Long total;

    public Pagination() {
        page = 1;
        numPerPage = DEFAULT_PAGE_SIZE;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        if (page < 1)
            throw new PaginationException("page number should greater than zero");
        this.page = page;
    }

    public Integer getNumPerPage() {
        return numPerPage;
    }

    public void setNumPerPage(Integer numPerPage) {
        if (numPerPage < 1)
            throw new PaginationException("Page size must not be less than one!");
        this.numPerPage = numPerPage;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
