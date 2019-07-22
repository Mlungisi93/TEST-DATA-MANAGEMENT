package com.expleo.tdm.Steps;

import com.expleo.tdm.libREST;
import com.google.gson.JsonObject;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Step;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class commentSteps {
    private JsonObject jsonObject;
    private RequestSpecification request;
    private String  url;
    private Response response; //ws

   // @Step
    public void setupRESTFullService(String _url) {
        jsonObject = new JsonObject();
        request = given().contentType("application/json");
        url = _url;
        request = request.body(jsonObject).when();
        response = request.post(url + "/comments");
        System.out.println(response.getStatusCode());
    }

    public static void main(String[] args) {
        commentSteps commentSteps=new commentSteps();
        commentSteps.setupRESTFullService("http://localhost:3000");
    }

   /* @Step
    public void submitNewComment(String comment) {
        jsonObject.addProperty("body", comment);
        jsonObject.addProperty("postId", "1");
        request = request.body(jsonObject).when();
        request.post(url + "/comments");
        response = request.post(url + "/comments");
    }
 @Step
    public void verifyReturnCode(int returnCode) {
       request.then().statusCode(returnCode);
     System.out.println("verifyReturnCode: StatusCode="+response.getStatusCode());
     assertThat(response.getStatusCode(), equalTo(returnCode));
    }


    @Step
    public Integer getLastCommentId() {
        return libREST.getLastCommentId(url);
    }

    @Step
    public void deleteCommentWithId(Integer commentId) {
        request.when().delete(url+"/comments/{id}", commentId);
    }
    */
}
