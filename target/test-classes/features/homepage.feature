Feature: Home page
  As a team lead, when I enter correct login information,
  I should be able to login

  Background:
    Given user on the login page

  @wip
  Scenario: login as team lead
#    Given user on the login page
    When user logs in as a team lead
    Then homepage should be displayed
#    And the Title should be correct

    @learn
    Scenario: login as a student team member
#    Given user on the login page
      When user logs in as a student team member
      Then homepage should be displayed

   @teacher
  Scenario: login as a teacher
#    Given user on the login page
    When user logs in as a teacher
    Then homepage should be displayed