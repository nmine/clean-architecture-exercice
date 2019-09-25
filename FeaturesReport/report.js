$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("be/nmine/challenges/can_notify_kitchen.feature");
formatter.feature({
  "line": 1,
  "name": "All user - Create challenge",
  "description": "A user want to create new challenge",
  "id": "all-user---create-challenge",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "new challenge",
  "description": "",
  "id": "all-user---create-challenge;new-challenge",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I\u0027m authenticated as \"\u003cfirst_name_user\u003e\" \"\u003clast_name_user\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I create a new challenge with title \"\u003cchallenge_title\u003e\" and category \"\u003ccategory\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I see the challenge display \"\u003cchallenge_title\u003e\"  with title \"\u003cchallenge_title\u003e\" and category \"\u003ccategory\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "all-user---create-challenge;new-challenge;",
  "rows": [
    {
      "cells": [
        "first_name_user",
        "last_name_user",
        "challenge_title",
        "category"
      ],
      "line": 10,
      "id": "all-user---create-challenge;new-challenge;;1"
    },
    {
      "cells": [
        "Nicolas",
        "Mine",
        "Ne pas manger de sucre",
        "alimentation"
      ],
      "line": 11,
      "id": "all-user---create-challenge;new-challenge;;2"
    },
    {
      "cells": [
        "Bilbo",
        "Sacquet",
        "Aller à la salle de sport",
        "exercices"
      ],
      "line": 12,
      "id": "all-user---create-challenge;new-challenge;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "new challenge",
  "description": "",
  "id": "all-user---create-challenge;new-challenge;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I\u0027m authenticated as \"Nicolas\" \"Mine\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I create a new challenge with title \"Ne pas manger de sucre\" and category \"alimentation\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I see the challenge display \"Ne pas manger de sucre\"  with title \"Ne pas manger de sucre\" and category \"alimentation\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Nicolas",
      "offset": 22
    },
    {
      "val": "Mine",
      "offset": 32
    }
  ],
  "location": "UserStep.java:7"
});
formatter.result({
  "duration": 122373700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ne pas manger de sucre",
      "offset": 37
    },
    {
      "val": "alimentation",
      "offset": 75
    }
  ],
  "location": "ChallengeStep.java:12"
});
formatter.result({
  "duration": 1229400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ne pas manger de sucre",
      "offset": 29
    },
    {
      "val": "Ne pas manger de sucre",
      "offset": 66
    },
    {
      "val": "alimentation",
      "offset": 104
    }
  ],
  "location": "ChallengeStep.java:15"
});
formatter.result({
  "duration": 178800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "new challenge",
  "description": "",
  "id": "all-user---create-challenge;new-challenge;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I\u0027m authenticated as \"Bilbo\" \"Sacquet\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I create a new challenge with title \"Aller à la salle de sport\" and category \"exercices\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I see the challenge display \"Aller à la salle de sport\"  with title \"Aller à la salle de sport\" and category \"exercices\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Bilbo",
      "offset": 22
    },
    {
      "val": "Sacquet",
      "offset": 30
    }
  ],
  "location": "UserStep.java:7"
});
formatter.result({
  "duration": 78200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aller à la salle de sport",
      "offset": 37
    },
    {
      "val": "exercices",
      "offset": 78
    }
  ],
  "location": "ChallengeStep.java:12"
});
formatter.result({
  "duration": 71100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aller à la salle de sport",
      "offset": 29
    },
    {
      "val": "Aller à la salle de sport",
      "offset": 69
    },
    {
      "val": "exercices",
      "offset": 110
    }
  ],
  "location": "ChallengeStep.java:15"
});
formatter.result({
  "duration": 86700,
  "status": "passed"
});
});