package com.hotteok.homepage.domain.home;

import com.hotteok.homepage.global.response.Response;
import com.hotteok.homepage.global.response.ResponseCode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@RequiredArgsConstructor
public class HomeController {
    private final HomeService homeService;

    @GetMapping()
    public ResponseEntity<Response> home() {
        return ResponseEntity.ok(Response.of(ResponseCode.SUCCESS));
    }
}
