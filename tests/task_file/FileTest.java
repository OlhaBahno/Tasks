package task_file;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileTest {

    Operations op;
    @BeforeEach
    void setUp() {
        op = new Operations();
    }

    @ParameterizedTest
    @MethodSource("countWords")
    void count(String file, String find, int expect) {
        op.setFileName(file);
        op.readFile();

        assertEquals(op.count(find),expect);
    }

    public static Stream countWords() {

        return Stream.of(Arguments.of("file.txt","melon",7),
                Arguments.of("file.txt","ing",3),
                Arguments.of("new.txt","ing",5),
                Arguments.of("new.txt","water",2),
                Arguments.of("new.txt","ever",5),
                Arguments.of("new.txt","never",3)
        );
    }
}