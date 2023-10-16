import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.maxqa.BoundaryService;

@Story(value = "Testing the implementation of the BoundaryService class")
public class BoundaryServiceTest {
    private final BoundaryService boundaryService = new BoundaryService();

    @Test
    @DisplayName("Getting the minimum value")
    @Description("Should return the minimum value")
    public void getCatalog() {
        System.out.println("Low test coverage BoundaryServiceTest");
//        int[] values = {5, 4, 3, 2, 1};
//        int expectedResult = Arrays.stream(values).min().getAsInt();
//        int actualResult = boundaryService.findMin(values);
//        Assertions.assertEquals(expectedResult, actualResult);
    }
}
