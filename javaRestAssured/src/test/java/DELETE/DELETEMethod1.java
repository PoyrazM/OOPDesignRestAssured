package DELETE;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DELETEMethod1 {

    @Test
    public void delete(){
        given().
                delete("https://reqres.in/api/users/2").
        then().
                statusCode(204).
                log().all();
    }
}
