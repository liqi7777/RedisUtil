package com.example.util;

import lombok.Data;

import java.util.List;

/**
 * @author Sky
 * create 2020/02/17
 * email sky.li@ixiaoshuidi.com
 **/
@Data
public class PageBean<T> {

    /**
     * 结果集
     */
    private List<T> list;

    /**
     * 第几页
     */
    private Integer pageNum;

    /**
     * 每页多少条记录
     */
    private Integer pageSize;

    /**
     * 查询记录数
     */
    private Integer total;

    /**
     * 总页数
     */
    private Integer pages;


    public PageBean(List<T> totalList, Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = totalList.size();
        this.pages = (this.total + this.pageSize - 1) / this.pageSize;
    }


    /**
     * 生成分页对象
     *
     * @param totalList
     * @param pageNum
     * @param pageSize
     * @param <T>
     * @return
     */
    public static <T> PageBean<T> generatePageBean(List<T> totalList, Integer pageNum, Integer pageSize) {
        PageBean<T> pageBean = new PageBean<>(totalList, pageNum, pageSize);
        int startPage = (pageNum - 1) * pageSize;
        int endPage = startPage + pageSize;
        pageBean.setList(totalList.subList(startPage, endPage > pageBean.getTotal() ? pageBean.getTotal() : endPage));
        return pageBean;
    }


}
