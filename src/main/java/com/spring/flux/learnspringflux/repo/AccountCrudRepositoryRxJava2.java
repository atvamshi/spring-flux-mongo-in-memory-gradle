//package com.spring.flux.learnspringflux.repo;
//
//import com.mongodb.async.client.Observable;
//import com.spring.flux.learnspringflux.dao.Account;
//import org.springframework.data.repository.reactive.RxJava2CrudRepository;
//
///**
// * Project: learn-spring-flux
// * Package: com.spring.flux.learnspringflux.repo
// * <p>
// * User: vamshi
// * Date: 2019-03-23
// * Time: 09:13
// * <p>
// * Created with IntelliJ IDEA
// * To change this template use File | Settings | File Templates.
// */
//public interface AccountCrudRepositoryRxJava2
//        extends RxJava2CrudRepository<Account, String> {
//
//    Observable<Account> findAllByValue(Double value);
//    Single<Account> findFirstByOwner(Single<String> owner);
//}
