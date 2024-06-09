package com.xyb.chatgpt.domain.other;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**

 * @author 云深不知处
 */
@Data
public class OpenAiResponse<T> implements Serializable {

    private String object;
    private List<T> data;
    private Error error;


    @Data
    public class Error {
        private String message;
        private String type;
        private String param;
        private String code;
    }

}
