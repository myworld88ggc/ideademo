package com.oa.pojo;
import  javax.validation.constraints.*;

/**
 * Created by gao.guangcai on 2017-09-21.
 */

public class ActModelQueryParam {

    @Size(min=2,max=50)
    private String category;
    private int pageIndex;
    private int pageSize;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
