package tasks;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class GetListUserTasks {
    public GetListUserTasks(){

    }

    public void getListUser(){
        String request = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.ANY)
                .queryParam("page", "1")
                .get("https://reqres.in/api/users/")
                .then()
                .statusCode(200)
                .extract()
                .response()
                .asString();
        System.out.println(request);
    }
}
