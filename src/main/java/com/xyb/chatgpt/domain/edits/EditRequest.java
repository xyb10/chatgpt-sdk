package com.xyb.chatgpt.domain.edits;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * @author 云深不知处
 * @description
 */
@Slf4j
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditRequest implements Serializable {

    /** 模型 */
    @NonNull
    private String model = Model.CODE_DAVINCI_EDIT_001.getCode();
    /** 输入 */
    @NonNull
    private String input;
    /** 修改描述 */
    @NonNull
    private String instruction;
    /** 控制温度【随机性】；0到2之间。较高的值(如0.8)将使输出更加随机，而较低的值(如0.2)将使输出更加集中和确定 */
    @Builder.Default
    private double temperature = 0.2;
    /** 多样性控制；使用温度采样的替代方法称为核心采样，其中模型考虑具有top_p概率质量的令牌的结果。因此，0.1 意味着只考虑包含前 10% 概率质量的代币 */
    @JsonProperty("top_p")
    private Double topP = 1d;
    /** 为每个提示生成的完成次数 */
    private Integer n = 1;

    @Getter
    @AllArgsConstructor
    public enum Model{
        /** text-davinci-edit-001 */
        TEXT_DAVINCI_EDIT_001("text-davinci-edit-001"),
        /** code-davinci-edit-001 */
        CODE_DAVINCI_EDIT_001("code-davinci-edit-001"),
        ;
        private String code;
    }

}
