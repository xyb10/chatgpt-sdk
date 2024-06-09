package com.xyb.chatgpt.domain.images;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**

 * @author 云深不知处
 * @description 图片响应
 */
@Data
public class ImageResponse implements Serializable {
    /** 条目数据 */
    private List<Item> data;
    /** 创建时间 */
    private long created;
}
