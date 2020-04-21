Feature: Visit management
  As a pet owner
  In order to know when my pets have visited the vet
  I want to be able to keep track of their visits

  Scenario: Record a pet's visit to the vet
    Given I am a known customer
    And I own a dog
    When I record my dog's visit to the vet
    Then a visitation record is created for my dog

  Scenario: Record multiple pets' visit to the vet
    Given I am a known customer
    And I own a dog and a cat
    When I record my dog's visit to the vet
    And I record my cat's visit to the vet
    Then a visitation record is created for both my pets

  Scenario: Record multiple pets' visits to the vet
    Given I am a known customer
    And I own a dog and a cat
    When I record the dog's multiple visits to the vet
    And I record the cat's multiple visits to the vet
    Then visitation records are created for my dog and cat
