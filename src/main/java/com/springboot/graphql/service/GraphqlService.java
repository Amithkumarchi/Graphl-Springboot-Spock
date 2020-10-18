package com.springboot.graphql.service;

import com.springboot.graphql.exception.GraphqlException;
import com.springboot.graphql.model.Book;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GraphqlService implements GraphQLQueryResolver {



    // to read the query.graphqls we are loading here

    @Value("classpath:query.graphqls")
    Resource resource;

    public List<Book> allBooks() throws Exception
    {
        throw new GraphqlException("Some name");


        /*return Arrays.asList(new Book(1,"a"),
                            new Book(2, "b"));
*/



    }





}
