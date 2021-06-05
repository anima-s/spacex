package handlers;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.lessThan;

public class GetHandler {

    RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri("https://api.spacexdata.com/")
            .setContentType(ContentType.JSON)
            .setBasePath("v4/launches/latest")
            .build();

    ResponseSpecification responseSpec = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectResponseTime(lessThan(5000L))
            .expectBody("$", hasKey("id"))
            .build();

    public RequestSpecification getRequestSpec(){
        return requestSpec;
    }

    public ResponseSpecification getResponseSpec(){
        return responseSpec;
    }
}