package com.hotteok.homepage.global.response;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public enum ResponseCode {
    SUCCESS("200","SUCCESS");

    private final String code;
    private final String message;
}
