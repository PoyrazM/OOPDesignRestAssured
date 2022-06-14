package GET;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class GET_1Test {

    @Test
    void get_1Test(){

        Response response = get("https://reqres.in/api/users?page=2");


        System.out.println(response.asString());
        System.out.println(response.getBody().asString());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getContentType());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }

    @Test
    void get_2Test(){

        given()
                .get("https://reqres.in/api/users?page=2")
        .then()
                .statusCode(200)
                .body("data[1].id",equalTo(8))
                .log().all();


    }

}
