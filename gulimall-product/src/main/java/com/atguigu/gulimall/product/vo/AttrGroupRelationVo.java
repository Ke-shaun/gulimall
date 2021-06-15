package com.atguigu.gulimall.product.vo;

import lombok.Data;

@Data
public class AttrGroupRelationVo {

    // "attrId":1,"attrGroupId":2

    /**
     *  属性id
     * */
    private Long attrId;

    /**
     *  分组id
     * */
    private Long attrGroupId;
}
