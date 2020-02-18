import com.userregistration.UserRegistrationMain;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {
    // Object created to access the main class
    UserRegistrationMain userRegistrationObject = new UserRegistrationMain();

    // TESTING FOR VALID FIRST NAME
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean validFirstNameResult = userRegistrationObject.checkForValidFirstName("Pritam");
        Assert.assertTrue(validFirstNameResult);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        boolean invalidFirstNameResult1 = userRegistrationObject.checkForValidFirstName("pritam123");
        Assert.assertFalse(invalidFirstNameResult1);
    }

    @Test
    public void givenFirstName_WhenNotAlphabetic_ShouldReturnFalse() {
        boolean invalidFirstNameResult2 = userRegistrationObject.checkForValidFirstName("1234");
        Assert.assertFalse(invalidFirstNameResult2);
    }

    // TESTING FOR VALID LAST NAME
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean validLastNameResult = userRegistrationObject.checkForValidLastName("Suryawanshi");
        Assert.assertTrue(validLastNameResult);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse() {
        boolean invalidLastNameResult1 = userRegistrationObject.checkForValidFirstName("suryawanshi");
        Assert.assertFalse(invalidLastNameResult1);
    }

    @Test
    public void givenLastName_WhenNotAlphabetic_ShouldReturnFalse() {
        boolean invalidLastNameResult2 = userRegistrationObject.checkForValidFirstName("1234");
        Assert.assertFalse(invalidLastNameResult2);
    }

    // TESTING FOR VALID EMAIL ID
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean validEmailIdResult = userRegistrationObject.checkForValidEmailId("pritam.surya110@gmail.com");
        Assert.assertTrue(validEmailIdResult);
    }

    @Test
    public void givenEmailId_WhenImproper_ShouldReturnFalse() {
        boolean invalidEmailIdResult1 = userRegistrationObject.checkForValidEmailId("pritam.@gmail.com");
        Assert.assertFalse(invalidEmailIdResult1);
    }

    @Test
    public void givenEmailId_WhenImproper_ShouldReturnFalse2() {
        boolean invalidEmailIdResult2 = userRegistrationObject.checkForValidEmailId("abc.@gmail.com");
        Assert.assertFalse(invalidEmailIdResult2);
    }

    // TESTING FOR VALID PHONE NUMBER
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        boolean validPhoneNumberResult = userRegistrationObject.checkForValidPhoneNumber("91 8169842509");
        Assert.assertTrue(validPhoneNumberResult);
    }

    @Test
    public void givenPhoneNumber_WhenImproper_ShouldReturnFalse() {
        boolean invalidPhoneNumberResult1 = userRegistrationObject.checkForValidPhoneNumber("918169842509");
        Assert.assertFalse(invalidPhoneNumberResult1);
    }

    // TESTING FOR VALID PASSWORD BY RULE ONE
    @Test
    public void givenPassword_ByRuleOne_WhenProper_ShouldReturnTrue() {
        boolean validPasswordResultByRuleOne = userRegistrationObject.checkForValidPassword("passcode");
        Assert.assertTrue(validPasswordResultByRuleOne);
    }

    @Test
    public void givenPassword_ByRuleOne_WhenImproper_ShouldReturnFalse1() {
        boolean invalidPasswordResultByRuleOne1 = userRegistrationObject.checkForValidPassword("pass");
        Assert.assertFalse(invalidPasswordResultByRuleOne1);
    }

    @Test
    public void givenPassword_ByRuleOne_WhenBlank_ShouldReturnFalse2() {
        boolean invalidPasswordResultByRuleOne2 = userRegistrationObject.checkForValidPassword(" ");
        Assert.assertFalse(invalidPasswordResultByRuleOne2);
    }

    // TESTING FOR VALID PASSWORD BY RULE TWO
    @Test
    public void givenPassword_ByRuleTwo_WhenProper_ShouldReturnTrue() {
        boolean validPasswordResultByRuleTwo = userRegistrationObject.checkForValidPasswordByRuleTwo("passCode");
        Assert.assertTrue(validPasswordResultByRuleTwo);
    }

    @Test
    public void givenPassword_ByRuleTwo_WhenImproper_ShouldReturnFalse() {
        boolean validPasswordResultByRuleTwo = userRegistrationObject.checkForValidPasswordByRuleTwo("passcode");
        Assert.assertFalse(validPasswordResultByRuleTwo);
    }

    // TESTING FOR VALID PASSWORD BY RULE THREE
    @Test
    public void givenPassword_ByRuleThree_WhenProper_ShouldReturnTrue() {
        boolean validPasswordResultByRuleThree = userRegistrationObject.checkForValidPasswordByRuleThree("Passcode123");
        Assert.assertTrue(validPasswordResultByRuleThree);
    }

    @Test
    public void givenPassword_ByRuleThree_WhenImproper_ShouldReturnFalse() {
        boolean invalidPasswordResultByRuleThree = userRegistrationObject.checkForValidPasswordByRuleThree("Passcode");
        Assert.assertFalse(invalidPasswordResultByRuleThree);
    }

    // TESTING FOR VALID PASSWORD BY RULE FOUR
    @Test
    public void givenPassword_ByRuleFour_WhenProper_ShouldReturnTrue() {
        boolean validPasswordResultByRuleFour = userRegistrationObject.checkForValidPasswordByRuleFour("Passcode@123");
        Assert.assertTrue(validPasswordResultByRuleFour);
    }

    @Test
    public void givenPassword_ByRuleFour_WhenImproper_ShouldReturnFalse() {
        boolean invalidPasswordResultByRuleFour = userRegistrationObject.checkForValidPasswordByRuleFour("Passcode123");
        Assert.assertFalse(invalidPasswordResultByRuleFour);
    }
}

