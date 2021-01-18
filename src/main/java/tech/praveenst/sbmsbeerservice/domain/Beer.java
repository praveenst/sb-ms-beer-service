package tech.praveenst.sbmsbeerservice.domain;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

public class Beer {
  @Id @GeneratedValue(generator = "UUID") @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  @Column(length = 36, columnDefinition = "varchar", updatable = false, nullable = false) private UUID id;

  @Version private long version;

  @CreationTimestamp @Column(updatable = false) private OffsetDateTime createdDate;

  @UpdateTimestamp private OffsetDateTime lastModifiedDate;

  private String beerName;
  //todo - BeerStyleEnum in BeerDto
  private String beerStyle;

  @Column(unique = true) private Long upc;
  private BigDecimal price;
  private Integer minOnHand;
  private Integer quantityToBrew;
}
