package Steps;

import Base.BaseUtil;
import Transformation.EmailTransform;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.jsoup.Connection;

import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil {

    private BaseUtil base;

    public LoginStep(BaseUtil base){
        this.base = base;
    }

    @Then("^I should see the userform page$")
    public void IShouldSeeTheUserformPage() {
        System.out.println("The driver is: "+ base.StepInfo);

        System.out.println("Ishould see userform page");
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
    }

    @Given("^I navigate to the login page2$")
    public void iNavigateToTheLoginPage2() {
    }
    @Given("^I navigate to the login page3$")
    public void iNavigateToTheLoginPage3() {
    }

    @And("^I enter the username as admin and password as admit$")
    public void iEnterTheUsernameAsAdminAndPasswordAsAdmit() {
    }

    @And("^I click login button$")
    public void IClickLoginButton() {

        System.out.println("Click login button");
    }


    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) {

        /*List<List<String>> data = table.raw();


        System.out.println("The value is: "+ data.get(0).get(0).toString());
        System.out.println("The value is: "+ data.get(0).get(1).toString());
        */
        List<User> users = new ArrayList<User>();

        users = table.asList(User.class);

        for (User user: users){
            System.out.println("The user name is: "+user.username);
            System.out.println("The user name is: "+user.password);
        }
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) {
        System.out.println("The user name is: "+ userName);
        System.out.println("The user name is: "+ password);

    }

    @And("^I enter the users email address as Email:([^\"]*)$")
    public void iEnterTheUsersEmailAddressAsEmailAdmin(@Transform(EmailTransform.class) String email) {

        System.out.println("The email Address name is: "+ email);


    }

    public class User {

        public String username;
        public String password;

        public User(String userName, String passWord){
            username = userName;
            password = passWord;
        }

    }
}
