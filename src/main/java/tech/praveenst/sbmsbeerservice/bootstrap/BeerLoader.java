package tech.praveenst.sbmsbeerservice.bootstrap;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import tech.praveenst.sbmsbeerservice.domain.Beer;
import tech.praveenst.sbmsbeerservice.repositories.BeerRepository;

@Component public class BeerLoader implements CommandLineRunner {

  private final BeerRepository beerRepository;

  public BeerLoader(BeerRepository beerRepository) {
    this.beerRepository = beerRepository;
  }

  @Override public void run(String... args) throws Exception {
    loadBeerObjects();
  }

  // add beer objects when spring starts up to seed initial set of data in database
  private void loadBeerObjects() {
    if (beerRepository.count() == 0) {
      beerRepository.save(
          Beer.builder().beerName("Indian Pale Ale").beerStyle("PALE_ALE").quantityToBrew(2000).minOnHand(120)
              .upc(337010000001L).price(new BigDecimal("12.88")).build());

      beerRepository.save(
          Beer.builder().beerName("Dog Fish ").beerStyle("IPA").quantityToBrew(2000).minOnHand(100).upc(337010000002L)
              .price(new BigDecimal("19.98")).build());
    }
    // System.out.println("Beer count: " + beerRepository.count());
  }
}
