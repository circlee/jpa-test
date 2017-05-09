package com.sample.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCustomerManagerId is a Querydsl query type for CustomerManagerId
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomerManagerId extends EntityPathBase<CustomerManagerId> {

    private static final long serialVersionUID = 1875637239L;

    public static final QCustomerManagerId customerManagerId = new QCustomerManagerId("customerManagerId");

    public final NumberPath<Long> custormer = createNumber("custormer", Long.class);

    public final NumberPath<Long> manager = createNumber("manager", Long.class);

    public QCustomerManagerId(String variable) {
        super(CustomerManagerId.class, forVariable(variable));
    }

    public QCustomerManagerId(Path<? extends CustomerManagerId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCustomerManagerId(PathMetadata metadata) {
        super(CustomerManagerId.class, metadata);
    }

}

