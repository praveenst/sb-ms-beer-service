package tech.praveenst.sbmsbeerservice.repositories;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import tech.praveenst.sbmsbeerservice.domain.Beer;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
