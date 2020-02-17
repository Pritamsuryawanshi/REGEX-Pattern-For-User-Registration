import com.userregistration.UserRegistrationMain;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {
    //Object Created to access the main class
    UserRegistrationMain userRegistrationObject = new UserRegistrationMain();

    //TESTING FOR FIRST NAME
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean validFirstNameResult1 = userRegistrationObject.checkForValidFirstName("Pritam");
        Assert.assertTrue(validFirstNameResult1);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        boolean validFirstNameResult2 = userRegistrationObject.checkForValidFirstName("pritam");
        Assert.assertFalse(validFirstNameResult2);
    }

    @Test
    public void givenFirstName_WhenNotAlphabetic_ShouldReturnFalse() {
        boolean validFirstNameResult3 = userRegistrationObject.checkForValidFirstName("1234");
        Assert.assertFalse(validFirstNameResult3);
    }

    //TESTING FOR LAST NAME
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean validLastNameResult1 = userRegistrationObject.checkForValidLastName("Suryawanshi");
        Assert.assertTrue(validLastNameResult1);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse() {
        boolean validLastNameResult2 = userRegistrationObject.checkForValidFirstName("suryawanshi");
        Assert.assertFalse(validLastNameResult2);
    }

    @Test
    public void givenLastName_WhenNotAlphabetic_ShouldReturnFalse() {
        boolean validLastNameResult3 = userRegistrationObject.checkForValidFirstName("1234");
        Assert.assertFalse(validLastNameResult3);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
    boolean validEmailIdResult1 = userRegistrationObject.checkForValidEmailId("pritam.surya110@gmail.com");
    Assert.assertTrue(validEmailIdResult1);
    }

    @Test
    public void givenEmailId_WhenImproper_ShouldReturnFalse() {
        boolean validEmailIdResult2 = userRegistrationObject.checkForValidEmailId("pritam.@gmail.com");
        Assert.assertFalse(validEmailIdResult2);
    }

    @Test
    public void givenEmailId_WhenImproper_ShouldReturnFalse2() {
        boolean validEmailIdResult3 = userRegistrationObject.checkForValidEmailId("abc.@gmail.com");
        Assert.assertFalse(validEmailIdResult3);
    }
}

