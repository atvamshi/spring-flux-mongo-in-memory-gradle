package com.spring.flux.learnspringflux.controller;

import com.spring.flux.learnspringflux.dao.Account;
import com.spring.flux.learnspringflux.repo.AccountCrudRepositoryMongo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Project: learn-spring-flux
 * Package: com.spring.flux.learnspringflux.controller
 * <p>
 * User: vamshi
 * Date: 2019-03-23
 * Time: 09:29
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/Accounts")
public class AccountReactiveController {

    private final AccountCrudRepositoryMongo accountCrudRepositoryMongo;

    public AccountReactiveController(AccountCrudRepositoryMongo accountCrudRepositoryMongo) {
        this.accountCrudRepositoryMongo = accountCrudRepositoryMongo;
    }

    @GetMapping("/{id}")
    public Mono<Account> getAccountById(@PathVariable String id) {
        return accountCrudRepositoryMongo.findById(id);
    }

    @GetMapping
    public Flux<Account> getAllAccounts() {
        return accountCrudRepositoryMongo.findAll();
    }

    @PostMapping
    public Flux<Account> saveAccounts(@RequestBody @Validated Flux<Account> account) {
        Flux<Account> accounts = accountCrudRepositoryMongo.saveAll(account);
        return accounts;
    }
}