package tasks;

import io.restassured.http.ContentType;
import utils.Utils;

import static io.restassured.RestAssured.given;

public class GetSingleUserTasks {
    private Utils utils;
    public GetSingleUserTasks(){
        utils = new Utils();
    }

    public void getSingleUser(){
        String request = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.ANY)
                .get("https://reqres.in/api/users/4")
                .then()
                .statusCode(200)
                .extract()
                .response()
                .asString();
        System.out.println(request);
    }
}
