Feature: Owner management
  As a pet owner
  In order to keep track of my pets
  I want to be able to enter information about myself and my pets

  Scenario: Entering the details of a new owner
    Given I am a new owner
    When I enter my details
    Then an owner record with my details is created

  Scenario: Updating the details of a known owner
    Given I am a known owner
    When I update my details
    Then my owner record reflects my updated details

  Scenario: Entering duplicate owner info
    Given I am a known owner
    When I attempt to create a new owner with the same details
    Then I am not allowed to create the duplicate owner

  Scenario: Entering a owner's pet information
    Given I am a new owner
    When I enter my details
    And I enter my dog's details
    Then my owner record shows my dog's details

  Scenario: Entering details of multiple pets
    Given I am a new owner
    When I enter my details
    And those of my dog and cat
    Then my owner record shows my dog's and cat's details
