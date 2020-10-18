# Graphl-Springboot-Spock


Gradle:4.8.1
SpringBoot:2.1.17.RELEASE

Postman version>=7

If no postman is there directly you can run localhost:<portnumber>/playground


#sample schema to retrieve

type Query{
#retrieving all books
allBooks(id:Int!): Int
}
 


Sample query

query mine($id:Int=3){
  allBooks(id:$id)
}


This is for the fields which are considered as notnullable 
query mine($id:Int=3){
  allBooks(id:$id)
}

In query Variables
{
  "id":4
}

Check the kotlin that needs to added as it is mandatory and check the custom errors that has been added In the exception package 






