$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ATM.feature");
formatter.feature({
  "line": 1,
  "name": "ATM Card feature",
  "description": "User should be asked for the PIN once ATM card is inserted into the ATM\r\nUser should be given warning message if PIN number entered is wrong.\r\nUser should be authenticated successfully if PIN number entered is correct",
  "id": "atm-card-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Enter correct PIN at ATM",
  "description": "",
  "id": "atm-card-feature;enter-correct-pin-at-atm",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I insert the ATM card in ATM machine",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I am asked to enter the PIN",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter the correct PIN",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should be able to see option to withdraw money",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iInsertTheATMCardInATMMachine()"
});
formatter.result({
  "duration": 90370714,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAmAskedToEnterThePIN()"
});
formatter.result({
  "duration": 37853,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterTheCorrectPIN()"
});
formatter.result({
  "duration": 34153,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldBeAbleToSeeOptionToWithdrawMoney()"
});
formatter.result({
  "duration": 28177,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Enter wrong PIN at ATM",
  "description": "",
  "id": "atm-card-feature;enter-wrong-pin-at-atm",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I insert the ATM card in ATM machine",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I am asked to enter the PIN",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter the correct PIN",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I should not be able to see option to withdraw money",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iInsertTheATMCardInATMMachine()"
});
formatter.result({
  "duration": 61760,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAmAskedToEnterThePIN()"
});
formatter.result({
  "duration": 16507,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterTheCorrectPIN()"
});
formatter.result({
  "duration": 21346,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldNotBeAbleToSeeOptionToWithdrawMoney()"
});
formatter.result({
  "duration": 19638,
  "status": "passed"
});
});