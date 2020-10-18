package com.springboot.graphql.service;

import com.springboot.graphql.exception.GraphqlException;
import graphql.ExceptionWhileDataFetching;
import graphql.GraphQLError;
import graphql.kickstart.execution.error.GenericGraphQLError;
import graphql.kickstart.execution.error.GraphQLErrorHandler;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class ErrorHandler implements GraphQLErrorHandler
{


    @Override
    public List<GraphQLError> processErrors(List<GraphQLError> errors) {


       return errors.stream().map(this::handleErrors).collect(Collectors.toList());
    }


    private GraphQLError handleErrors(GraphQLError e)
    {
 GraphQLError error=null;
         if (e.getMessage().contains("somename"))
        {
         error=e;
         }
        return error;
    }
}
