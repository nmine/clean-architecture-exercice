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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});