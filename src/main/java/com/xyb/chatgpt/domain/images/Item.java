package com.xyb.chatgpt.domain.images;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**

 * @author 云深不知处
 * @description 条目
 */
@Data
public class Item implements Serializable {

    private String url;
    @JsonProperty("b64_json")
    private String b64Json;

}
