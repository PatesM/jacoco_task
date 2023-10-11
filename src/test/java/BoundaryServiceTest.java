import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.maxqa.BoundaryService;

import java.util.stream.Stream;

@DisplayName("Testing the implementation of the BoundaryService class")
public class BoundaryServiceTest {
    private final BoundaryService boundaryService = new BoundaryService();

    static Stream<Arguments> getCatalog_argsProviderFactory() {
        return Stream.of(
                Arguments.of(
                        new int[]{5, 4, 3, 2, 1},
                        1
                )
        );
    }

    @DisplayName("Testing the findMin method")
    @ParameterizedTest(name = "Getting the minimum value")
    @MethodSource("getCatalog_argsProviderFactory")
    public void getCatalog_shouldGetListTitlesOfArticles(int[] marks, int minValueExpected) {
        System.out.println("Low test coverage BoundaryServiceTest");
//        int minValueActual = boundaryService.findMin(marks);
//        Assertions.assertEquals(minValueExpected, minValueActual);
    }
}
