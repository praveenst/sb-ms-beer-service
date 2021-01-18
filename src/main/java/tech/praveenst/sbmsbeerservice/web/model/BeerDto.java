package tech.praveenst.sbmsbeerservice.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * Created by
 *   author: praveen.thangavelu
 *   date: 2021-01-17T11:16:26Z
 */

@Data //this one gets getters and setters + equals and hashcode
@NoArgsConstructor @AllArgsConstructor @Builder public class BeerDto {
  //required
  private String beerName;
  private BeerStyleEnum beerStyle;
  private Long upc;
  private BigDecimal price;
  //nullable - optional
  private UUID id;
  private Integer quantityOnHand;
  private OffsetDateTime createdDate;
  private OffsetDateTime lastModifiedDate;
  private Long version;

}

