Feature:  All user - Create challenge
  A user want to create new challenge

  Scenario Outline: new challenge
    Given I'm authenticated as "<first_name_user>" "<last_name_user>"
    When I create a new challenge "<challenge_title>"
    Then I see the challenge display "<challenge_title>"

    Examples:
      | first_name_user | last_name_user | challenge_title         |
      | Nicolas               | Mine              | Ne pas manger de viande |
