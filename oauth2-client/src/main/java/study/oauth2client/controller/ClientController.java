package study.oauth2client.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

@RestController
@RequiredArgsConstructor
public class ClientController {

    private final RestTemplate restTemplate;

    @GetMapping("/")
    public ResponseEntity<?> test() {
        URI uri = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/api/boards")
                .queryParam("page", 4)
                .queryParam("size", 5)
                .encode(UTF_8)
                .build()
                .toUri();
        return restTemplate.getForEntity(uri, List.class);
    }

}
