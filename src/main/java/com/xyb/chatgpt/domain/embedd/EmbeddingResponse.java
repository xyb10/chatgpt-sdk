package com.xyb.chatgpt.domain.embedd;

import com.xyb.chatgpt.domain.other.Usage;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 云深不知处
 * @description 反馈对象
 */
@Data
public class EmbeddingResponse implements Serializable {

    private String object;
    private List<Item> data;
    private String model;
    private Usage usage;

}
