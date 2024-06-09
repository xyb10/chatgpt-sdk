package com.xyb.chatgpt.domain.embedd;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.List;

/**
 * @author 云深不知处
 * @description Creates a variation of a given image.
 */
@Slf4j
@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class EmbeddingRequest implements Serializable {

    /** 模型 */
    @NonNull
    @Builder.Default
    private String model = Model.TEXT_EMBEDDING_ADA_002.getCode();
    /** 输入信息 */
    @NonNull
    private List<String> input;
    @Setter
    private String user;

    @Getter
    @AllArgsConstructor
    public enum Model {
        TEXT_EMBEDDING_ADA_002("text-embedding-ada-002"),
        ;
        private String code;
    }

}
