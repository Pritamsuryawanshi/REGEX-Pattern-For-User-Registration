import com.userregistration.UserRegistrationMain;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {
    // Object Created to access the main class
    UserRegistrationMain userRegistrationObject = new UserRegistrationMain();

    // TESTING FOR VALID FIRST NAME
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean validFirstNameResult = userRegistrationObject.checkForValidFirstName("Pritam");
        Assert.assertTrue(validFirstNameResult);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        boolean inValidFirstNameResult1 = userRegistrationObject.checkForValidFirstName("pritam");
        Assert.assertFalse(inValidFirstNameResult1);
    }

    @Test
    public void givenFirstName_WhenNotAlphabetic_ShouldReturnFalse() {
        boolean inValidFirstNameResult2 = userRegistrationObject.checkForValidFirstName("1234");
        Assert.assertFalse(inValidFirstNameResult2);
    }

    // TESTING FOR VALID LAST NAME
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean validLastNameResult = userRegistrationObject.checkForValidLastName("Suryawanshi");
        Assert.assertTrue(validLastNameResult);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse() {
        boolean inValidLastNameResult1 = userRegistrationObject.checkForValidFirstName("suryawanshi");
        Assert.assertFalse(inValidLastNameResult1);
    }

    @Test
    public void givenLastName_WhenNotAlphabetic_ShouldReturnFalse() {
        boolean inValidLastNameResult2 = userRegistrationObject.checkForValidFirstName("1234");
        Assert.assertFalse(inValidLastNameResult2);
    }

    // TESTING FOR VALID EMAIL ID
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean validEmailIdResult = userRegistrationObject.checkForValidEmailId("pritam.surya110@gmail.com");
        Assert.assertTrue(validEmailIdResult);
    }

    @Test
    public void givenEmailId_WhenImproper_ShouldReturnFalse() {
        boolean inValidEmailIdResult1 = userRegistrationObject.checkForValidEmailId("pritam.@gmail.com");
        Assert.assertFalse(inValidEmailIdResult1);
    }

    @Test
    public void givenEmailId_WhenImproper_ShouldReturnFalse2() {
        boolean inValidEmailIdResult2 = userRegistrationObject.checkForValidEmailId("abc.@gmail.com");
        Assert.assertFalse(inValidEmailIdResult2);
    }

    // TESTING FOR VALID PHONE NUMBER
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        boolean validPhoneNumberResult = userRegistrationObject.checkForValidPhoneNumber("91 8169842509");
        Assert.assertTrue(validPhoneNumberResult);
    }

    @Test
    public void givenPhoneNumber_WhenImproper_ShouldReturnFalse() {
        boolean inValidPhoneNumberResult1 = userRegistrationObject.checkForValidPhoneNumber("918169842509");
        Assert.assertFalse(inValidPhoneNumberResult1);
    }

    // TESTING FOR VALID PASSWORD
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean validPasswordResult = userRegistrationObject.checkForValidPassword("passcode");
        Assert.assertTrue(validPasswordResult);
    }

    @Test
    public void givenPassword_WhenImproper_ShouldReturnFalse() {
        boolean inValidPasswordResult1 = userRegistrationObject.checkForValidPassword("pass");
        Assert.assertFalse(inValidPasswordResult1);
    }

    @Test
    public void givenPassword_WhenBlank_ShouldReturnFalse2() {
        boolean inValidPasswordResult2 = userRegistrationObject.checkForValidPassword("  ");
        Assert.assertFalse(inValidPasswordResult2);
    }
}

