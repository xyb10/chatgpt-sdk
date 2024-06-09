package com.xyb.chatgpt.domain.qa;

import com.xyb.chatgpt.domain.other.Usage;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 云深不知处
 */
@Data
public class QACompletionResponse implements Serializable {

    /** ID */
    private String id;
    /** 对象 */
    private String object;
    /** 模型 */
    private String model;
    /** 对话 */
    private QAChoice[] choices;
    /** 创建 */
    private long created;
    /** 耗材 */
    private Usage usage;

}
