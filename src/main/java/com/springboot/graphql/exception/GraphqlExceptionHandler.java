package com.springboot.graphql.exception;

import graphql.kickstart.spring.error.ThrowableGraphQLError;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
public class GraphqlExceptionHandler
{

    @ExceptionHandler(GraphqlException.class)
    public ThrowableGraphQLError check(GraphqlException e)
    {
        return new ThrowableGraphQLError(e);
    }
}
