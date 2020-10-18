package com.springboot.graphql.service;

import com.springboot.graphql.exception.GraphqlException;
import com.springboot.graphql.model.Book;
import graphql.ErrorClassification;
import graphql.GraphQLError;
import graphql.GraphqlErrorException;
import graphql.execution.DataFetcherResult;
import graphql.kickstart.execution.error.GenericGraphQLError;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.language.SourceLocation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GraphqlService implements GraphQLQueryResolver {



    // to read the query.graphqls we are loading here

    @Value("classpath:query.graphqls")
    Resource resource;

    public int allBooks() throws Exception
    {
 throw new GraphqlException("somename","FFAC");

        /*return Arrays.asList(new Book(1,"a"),
                            new Book(2, "b"));
*/



    }





}
