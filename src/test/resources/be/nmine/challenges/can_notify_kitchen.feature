Feature:  All user - Create challenge
  A user want to create new challenge

  Scenario Outline: new challenge
    Given I'm authenticated as "<first_name_user>" "<last_name_user>"
    When I create a new challenge with title "<challenge_title>" and category "<category>"
    Then I see the challenge display "<challenge_title>"  with title "<challenge_title>" and category "<category>"

    Examples:
      | first_name_user | last_name_user | challenge_title               |  category         |
      | Nicolas         | Mine           | Ne pas manger de sucre       |  alimentation     |
