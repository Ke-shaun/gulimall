package com.atguigu.gulimall.product.vo;

import lombok.Data;

@Data
public class AttrRespVo extends AttrVo{

    /**
     * 分类名称
     */
    private String catelogName;
    /**
     * 所属分组名字
     */
    private String groupName;
}
