package com.springboot.graphql.model;


import lombok.*;

@Builder
@Value
@Getter
@Setter
@AllArgsConstructor
public class Book {

int id;
String name;


}