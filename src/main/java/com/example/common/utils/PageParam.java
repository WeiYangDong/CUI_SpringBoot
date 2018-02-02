package com.example.common.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @author WeiYangDong
 * @date 2018/2/2 17:26
 * @deprecated 分页请求参数封装,仅适用于hibernate.
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PageParam {

    //当前页
    private Integer page = 1;

    //每页容量
    private Integer size = 10;

    public Integer getHibernatePage() {
        return page - 1;
    }

    public Integer getMybatisPage() {
        return page;
    }

    public void setPage(Integer page) {
        if (Objects.nonNull(page)) {
            this.page = page;
        }
    }

    public void setSize(Integer size) {
        if (Objects.nonNull(size)) {
            this.size = size;
        }
    }
}
