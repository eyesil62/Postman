package ApiCalls;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class GetCall {
    @Test
    public void getCategories() {
        RestAssured.baseURI = "https://reqres.in/api/users?page=2";
        Response response =
        given().when().get(baseURI);
        int expectedStatus = 200;
        int actual = response.getStatusCode();
        Assert.assertEquals(expectedStatus,actual);
        System.out.println("actual = " + actual);
        System.out.println("response.body() = " + response.body().asString());
    }

}