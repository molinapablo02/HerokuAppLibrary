import org.testng.annotations.BeforeClass;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Base {

    @BeforeClass
    public static void setUpRestAssured() {
        RestAssured.basePath = "https://qa-library-dev.herokuapp.com";
        RestAssured.baseURI = "/api/";

        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .addHeader("ContentType", ContentType.JSON.toString()).addHeader("Accept", ContentType.JSON.toString())
                .build();

        RestAssured.requestSpecification = requestSpecification;

    }

}
