
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

import io.restassured.response.Response;

public class Books extends Base {

    @Test
    public void GetBooks() {

        Response response = get("/books");
        ArrayList<String> bookList = response.path("data.title");
        Assert.assertTrue(bookList.size() >= 1, "no books returned");
    }
}
