package POST;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class POSTMethod {

    @Test
    public void post(){

        JSONObject request = new JSONObject();

        request.put("name","Mertcan");
        request.put("job","QA Engineer");

        System.out.println(request);
        System.out.println(request.toJSONString());

        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
        when().
                post("https://reqres.in/api/users").
        then().
                statusCode(201).log().all();
    }
}

