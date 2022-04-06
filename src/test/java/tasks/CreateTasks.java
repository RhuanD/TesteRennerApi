package tasks;
import io.restassured.http.ContentType;
import utils.Utils;

import static io.restassured.RestAssured.given;

public class CreateTasks {
    private Utils utils;
    public CreateTasks(){
        utils = new Utils();
    }

    public void requestCreate(){
        String request = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.ANY)
                .body("{\n" +
                        "    \"name\": \"" + utils.generateRandomName()+ "\",\n" +

                        "    \"job\": \"" + utils.generateRandomJob() + "\"\n" +
                        "}")
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201)
                .extract()
                .response()
                .asString();
        System.out.println(request);
    }
}
