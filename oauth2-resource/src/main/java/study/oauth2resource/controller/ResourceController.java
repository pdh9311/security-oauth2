package study.oauth2resource.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class ResourceController {

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok()
                .body(Arrays.asList("test1", "test2", "test3"));
    }

}
