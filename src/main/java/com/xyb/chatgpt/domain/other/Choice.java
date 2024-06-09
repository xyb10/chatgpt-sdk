package com.xyb.chatgpt.domain.other;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 云深不知处
 * @description 对话信息
 */
@Data
public class Choice implements Serializable {

    private long index;
    private String text;
    private Object logprobs;
    @JsonProperty("finish_reason")
    private String finishReason;

}
