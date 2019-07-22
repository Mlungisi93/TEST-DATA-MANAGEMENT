Feature: Should be able to add and delete comments
  As an API
  I want to be able to to post commands to the blog server
  So that the frontend can manage the blog

  Scenario: Adding a comment
    Given A local blog
    When I submit a new comment
    Then the submission should be successful

  Scenario: Deleting a comment
    Given A local blog
    When I delete a comment
    Then the deletion should be successful