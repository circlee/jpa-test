package com.sample.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCustomerManager is a Querydsl query type for CustomerManager
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomerManager extends EntityPathBase<CustomerManager> {

    private static final long serialVersionUID = -234919492L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomerManager customerManager = new QCustomerManager("customerManager");

    public final QCustomer customer;

    public final QManager manager;

    public QCustomerManager(String variable) {
        this(CustomerManager.class, forVariable(variable), INITS);
    }

    public QCustomerManager(Path<? extends CustomerManager> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCustomerManager(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCustomerManager(PathMetadata metadata, PathInits inits) {
        this(CustomerManager.class, metadata, inits);
    }

    public QCustomerManager(Class<? extends CustomerManager> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer")) : null;
        this.manager = inits.isInitialized("manager") ? new QManager(forProperty("manager")) : null;
    }

}

