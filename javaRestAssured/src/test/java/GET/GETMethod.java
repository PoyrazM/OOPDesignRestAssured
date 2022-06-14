package GET;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class GETMethod {

    @Test
    public void get(){

        given()
                .header("Content-Type","application/json")
                .get("https://reqres.in/api/users?page=2")
        .then()
                .statusCode(200)
                .body("data.id[0]",equalTo(7))
                .body("data.first_name",hasItems("Michael","Lindsay","Tobias"))
                .log().all();
    }
}
