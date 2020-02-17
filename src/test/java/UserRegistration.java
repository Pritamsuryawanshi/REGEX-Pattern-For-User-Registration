import com.userregistration.UserRegistrationMain;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {
    //Object Created to access the main class
    UserRegistrationMain userRegistrationObject = new UserRegistrationMain();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistrationObject.checkForValidFirstName("Pritam");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        boolean result = userRegistrationObject.checkForValidFirstName("pritam");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenNotAlphabetic_ShouldReturnFalse() {
        boolean result = userRegistrationObject.checkForValidFirstName("1234");
        Assert.assertFalse(result);
    }
}
