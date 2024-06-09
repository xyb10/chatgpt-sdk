package com.xyb.chatgpt.domain.embedd;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author 云深不知处
 * @description 条目信息
 */
@Data
public class Item implements Serializable {

    private String object;
    private List<BigDecimal> embedding;
    private Integer index;

}
