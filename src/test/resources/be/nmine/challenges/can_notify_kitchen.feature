Feature:  All user - Create challenge
  A user want to create new challenge

  Scenario Outline: new challenge
    Given I'm authenticated as "<first_name_user>" "<last_name_user>"
    When I create a new challenge with title "<challenge_title>" and category "<category>"
    Then I see the challenge display "<challenge_title>"  with title "<challenge_title>" and category "<category>"

    Examples:
      | first_name_user | last_name_user | challenge_title           | category     |
      | Nicolas         | Mine           | Ne pas manger de sucre    | alimentation |
      | Bilbo           | Sacquet        | Aller à la salle de sport | exercices    |


  Scenario Outline: invalid challenge
    Given I'm authenticated as "<first_name_user>" "<last_name_user>"
    When I create an existing challenge with title "<challenge_title>" and category "<category>"
    Then I see the modification no any new challenge is created

    Examples:
      | first_name_user | last_name_user | challenge_title | category     |
      | Seldon          | Hari           |                 | alimentation |
      | Bilbo           | Sacquet        |                 | exercices    |
