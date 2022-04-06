package tasks;

import io.restassured.http.ContentType;
import utils.Utils;

import static io.restassured.RestAssured.given;

public class UpdateTasks {

    private Utils utils;


    public UpdateTasks(){
        utils = new Utils();
    }

    public void requestUpdate(){
        String request = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.ANY)
                .body("{\n" +
                        "    \"name\": \"" + utils.generateRandomName()+ "\",\n" +

                        "    \"job\": \"" + utils.generateRandomJob() + "\"\n" +
                        "}")
                .patch("https://reqres.in/api/users/5")
                .then()
                .statusCode(200)
                .extract()
                .response()
                .asString();
        System.out.println(request);
    }
}
