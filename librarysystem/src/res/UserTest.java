package librarysystem.src.res;

import librarysystem.src.library.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void userCreationWithNullUserIdAndNullUserName() {
        assertThrows(IllegalArgumentException.class,
                () -> new User(null, null)
        );
    }

    @Test
    void userCreationWithNullUserId() {
        assertThrows(IllegalArgumentException.class,
                () -> new User(null, "Ali")
        );
    }

    @Test
    void userCreationWithNullUserName() {
        assertThrows(IllegalArgumentException.class,
                () -> new User(0, null)
        );
    }

    @Test
    void userCreationWithEmptyUserName() {
        assertThrows(IllegalArgumentException.class,
                () -> new User(0, "")
        );
    }

    @Test
    void userCreationWithUserNameOfSpaces() {
        assertThrows(IllegalArgumentException.class,
                () -> new User(0, "     ")
        );
    }

    @Test
    void setUserNameWithNullReturnsException() {
        User user = new User(0, "Ali");
        assertThrows(IllegalArgumentException.class,
                () -> user.setUserName(null)
        );
    }

    @Test
    void setUserNameWithEmptyStringReturnsException() {
        User user = new User(0, "Ali");
        assertThrows(IllegalArgumentException.class,
                () -> user.setUserName("")
        );
    }

    @Test
    void setUserNameWithStringOfSpacesException() {
        User user = new User(0, "Ali");
        assertThrows(IllegalArgumentException.class,
                () -> user.setUserName("     ")
        );
    }

    @Test
    void borrowNullBookReturnsIllegalArgumentException() {
        User user = new User(0, "Ali");
        assertThrows(IllegalArgumentException.class,
                () -> user.borrowBook(null)
        );
    }

    @Test
    void returnNullBookReturnsIllegalArgumentException() {
        User user = new User(0, "Ali");
        assertThrows(IllegalArgumentException.class,
                () -> user.returnBook(null)
        );
    }

    @Test
    void subscribeToNullBookReturnsIllegalArgumentException() {
        User user = new User(0, "Ali");
        assertThrows(IllegalArgumentException.class,
                () -> user.subscribeToBook(null)
        );
    }

    @Test
    void unsubscribeFromNullBookReturnsIllegalArgumentException() {
        User user = new User(0, "Ali");
        assertThrows(IllegalArgumentException.class,
                () -> user.unsubscribeFromBook(null)
        );
    }

    @Test
    void onNullBookAvailableReturnsIllegalArgumentException() {
        User user = new User(0, "Ali");
        assertThrows(IllegalArgumentException.class,
                () -> user.onBookAvailable(null)
        );
    }
}