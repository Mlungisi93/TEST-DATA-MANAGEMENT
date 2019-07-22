package com.expleo.tdm.StepDefs;

import com.expleo.tdm.Steps.commentSteps;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;

import java.util.Iterator;

public class commentStepDefs {
    Integer lastId = -1;
    @Steps
    commentSteps RESTSSteps;

    @Given("^A local blog$")
    public void a_local_blog() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        RESTSSteps.setupRESTFullService("http://localhost:3000");
    }

    @When("^I submit a new comment$")
    public void i_submit_a_new_comment() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        String comment = "Ayanda's comment";
        //RESTSSteps.submitNewComment(comment);
    }

    @Then("^the submission should be successful$")
    public void the_submission_should_be_successful() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //RESTSSteps.verifyReturnCode(201);
    }

    @When("^I delete a comment$")
    public void iDeleteAComment() {

        //lastId = RESTSSteps.getLastCommentId();
        //System.out.println("Deleted id "+ lastId);

    }

    @Then("^the deletion should be successful$")
    public void theDeletionShouldBeSuccessful() {

        //RESTSSteps.deleteCommentWithId(lastId);
    }
}
