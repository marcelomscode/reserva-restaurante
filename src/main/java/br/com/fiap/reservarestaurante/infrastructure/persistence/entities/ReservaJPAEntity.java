package br.com.fiap.reservarestaurante.infrastructure.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "reservas")
public class ReservaJPAEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "id", nullable = false, unique = true, length = 36)
  private String id;

  private String restauranteId;
}
