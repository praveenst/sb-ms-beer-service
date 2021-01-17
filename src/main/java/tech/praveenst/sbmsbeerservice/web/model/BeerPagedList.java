package tech.praveenst.sbmsbeerservice.web.model;

import java.util.List;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

/***
 * Created by
 *   author: praveen.thangavelu
 *   date: 2021-01-17T11:31:07Z
 */


public class BeerPagedList extends PageImpl<BeerDto> {
  public BeerPagedList(List<BeerDto> content, Pageable pageable, long total) {
    super(content, pageable, total);
  }

  public BeerPagedList(List<BeerDto> content) {
    super(content);
  }
}
