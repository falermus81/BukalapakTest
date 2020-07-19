package ApiTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class ApiTest {
    String urlTest = "https://jsonplaceholder.typicode.com/posts";

    @Test
    public void testGetDataFromServer() {
        Response response = RestAssured.when().get(urlTest);
        Assert.assertEquals(200, response.statusCode());
        //System.out.println(response.asString());
        DataBody[] dataBodies = response.getBody().as(DataBody[].class);
        Assert.assertEquals(Integer.class, dataBodies[0].userId.getClass());
        Assert.assertEquals(Integer.class, dataBodies[0].id.getClass());
        Assert.assertEquals(String.class, dataBodies[0].title.getClass());
        Assert.assertEquals(String.class, dataBodies[0].body.getClass());
    }

    @Test
    public void testPostDataToServer() {
        Response response = RestAssured.given().body("{\"title\":\"recommendation\",\"body\":\"motorcycle\",\"userId\":12}").when().post(urlTest);
        Assert.assertEquals(201, response.statusCode());
        DataBody dataBody = response.body().as(DataBody.class);
        Assert.assertEquals(101, dataBody.id.intValue());
    }
}
