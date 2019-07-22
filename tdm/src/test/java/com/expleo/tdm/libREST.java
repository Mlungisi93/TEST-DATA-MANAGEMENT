package com.expleo.tdm;

import static io.restassured.RestAssured.when;

public class libREST {
    public static Integer getLastCommentId(String url) {
       return when().get(url+ "/comments?_sort=id&_order=desc")
       .then().statusCode(200)
               .extract().response().body().path("[0].id");

    }
}
