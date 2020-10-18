package com.springboot.graphql.exception;

import graphql.ErrorClassification;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GraphqlException extends  RuntimeException implements GraphQLError {

    private String errorCode;
    public GraphqlException() {
        super();
    }

    public GraphqlException(String message,String code) {
        super(message);
        this.errorCode=code;
    }

    public GraphqlException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public GraphqlException(Throwable throwable) {
        super(throwable);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorClassification getErrorType() {
        return null;
    }

    @Override
    public Map<String, Object> getExtensions() {

      Map<String,Object> map= new LinkedHashMap<>();
      map.put("errorCode",this.errorCode);
      map.put("errorMessage", this.getMessage());
      return  map;

    }
}