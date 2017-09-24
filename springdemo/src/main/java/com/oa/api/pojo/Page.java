package com.oa.api.pojo;

/**
 * Created by Will on 2017/9/20.
 */
import java.util.ArrayList;
import java.util.List;

public class Page<T> {

    private int pageIndex = 1; // 当前页码
    private int pageSize = 1; // 每页显示条数
    private long count;// 总记录数
    private int pageCount;// 总页数
    private List<T> list = new ArrayList<T>();

    public Page(int pageIndex, int pageSize, long count2) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.count = count2;

        // 计算总页数
        this.pageCount =(int)( (count2 % pageSize) == 0 ? count2 / pageSize : (count2 / pageSize) + 1);
    }
    public Page(int pageIndex, int pageSize, long count2, List<T> list) {
        this(pageIndex, pageSize, count2);
        this.list = list;
    }
    public int getPageIndex() {
        return pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public long getCount() {
        return count;
    }

    public int getPageCount() {
        return pageCount;
    }

    public List<T> getList() {
        return list;
    }

}
