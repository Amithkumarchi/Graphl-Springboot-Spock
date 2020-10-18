package com.springboot.graphql.exception;

public class GraphqlException extends  RuntimeException {

    public GraphqlException() {
        super();
    }

    public GraphqlException(String message) {
        super(message);
    }

    public GraphqlException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public GraphqlException(Throwable throwable) {
        super(throwable);
    }

}