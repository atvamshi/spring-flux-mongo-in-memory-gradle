package com.spring.flux.learnspringflux.repo;

import com.spring.flux.learnspringflux.dao.Account;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Project: learn-spring-flux
 * Package: com.spring.flux.learnspringflux.repo
 * <p>
 * User: vamshi
 * Date: 2019-03-23
 * Time: 09:13
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface AccountCrudRepositoryCrud
        extends ReactiveCrudRepository<Account, String> {

    Flux<Account> findAllByValue(String value);
    Mono<Account> findFirstByOwner(Mono<String> owner);
}
