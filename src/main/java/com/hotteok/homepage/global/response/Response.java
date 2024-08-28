package com.hotteok.homepage.global.response;

public record Response(
        String code,
        String message
) {
    public static Response of(ResponseCode responseCode) {
        return new Response(responseCode.getCode(), responseCode.getMessage());
    }
}
