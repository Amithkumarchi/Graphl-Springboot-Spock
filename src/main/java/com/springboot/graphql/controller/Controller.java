package com.springboot.graphql.controller;

import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.kickstart.execution.GraphQLQueryInvoker;
import graphql.kickstart.execution.GraphQLQueryResult;
import graphql.kickstart.execution.GraphQLRequest;
import graphql.kickstart.execution.input.GraphQLSingleInvocationInput;
import graphql.kickstart.servlet.input.GraphQLInvocationInputFactory;
import graphql.schema.GraphQLSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/books")
@RestController
public class Controller
{

    @Autowired
    private GraphQLInvocationInputFactory invocationInputFactory;

    @Autowired
    private GraphQLQueryInvoker queryInvoker;

    @PostMapping(value = "/posts")
    public ResponseEntity<GraphQLQueryResult> getAllBooks(@RequestBody String query)
    {

        GraphQLRequest request = GraphQLRequest.createQueryOnlyRequest(query);
        GraphQLSingleInvocationInput invocationInput = invocationInputFactory.create(request);
        GraphQLQueryResult result = queryInvoker.toGraphQLInvoker().query(invocationInput);
       return new ResponseEntity<GraphQLQueryResult>(result,HttpStatus.OK);
    }



}
