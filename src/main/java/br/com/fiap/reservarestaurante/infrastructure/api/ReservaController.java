package br.com.fiap.reservarestaurante.infrastructure.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservas")
@RequiredArgsConstructor
public class ReservaController {

  @GetMapping("/hola")
  public ResponseEntity<String> hola() {
    return ResponseEntity.ok("hola");
  }
}
