package com.xyb.chatgpt.domain.whisper;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 云深不知处
 * @description
 */
@Data
public class WhisperResponse implements Serializable {
    private String text;
}
