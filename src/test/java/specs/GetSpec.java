package specs;

import Assertions.LaunchAssertions;
import handlers.GetHandler;
import models.Launch;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.hasKey;

public class GetSpec {

    GetHandler handler = new GetHandler();
    LaunchAssertions launchAssertions = new LaunchAssertions();


    @Test
    public void verify200Response() {
        Launch response = given()
                .spec(handler.getRequestSpec())
                .when()
                .get()
                .then()
                .spec(handler.getResponseSpec())
                .and()
                .extract()
                .response()
                .as(Launch.class);
        launchAssertions.verifyResponse(response);
    }

    @Test
    public void verify400Response() {
        given()
                .get("https://api.spacexdata.com/v4/launches/latest/1")
                .then()
                .statusCode(404);
    }

    @Test
    public void validateSchema(){
        given()
                .spec(handler.getRequestSpec())
                .when()
                .get()
                .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("schema/launch.json"));
    }


}