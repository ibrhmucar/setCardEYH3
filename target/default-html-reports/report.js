$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/DashboardPage.feature");
formatter.feature({
  "name": "As a User, User can use all dashboard functions",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User on the main URL",
  "keyword": "Given "
});
formatter.match({
  "location": "com.setcard.step_defs.LoginStepDefs.userOnTheMainURL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The Users can enter information successfully Firmalar page.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "User get new Vergi Numarası",
  "keyword": "Given "
});
formatter.match({
  "location": "com.setcard.step_defs.DashBoardStepDefs.userGetNewVergiNumarası()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the valid credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.setcard.step_defs.LoginStepDefs.userEnterTheValidCredentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to Firmalar page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.setcard.step_defs.DashBoardStepDefs.userNavigateToFirmalarPageSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can click Firma Ekle button successfully",
  "keyword": "And "
});
formatter.match({
  "location": "com.setcard.step_defs.DashBoardStepDefs.userCanClickFirmaEkleButtonSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter all information",
  "keyword": "Then "
});
formatter.match({
  "location": "com.setcard.step_defs.DashBoardStepDefs.enterAllInformation()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User on the main URL",
  "keyword": "Given "
});
formatter.match({
  "location": "com.setcard.step_defs.LoginStepDefs.userOnTheMainURL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The Users Check Numbers",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "User enter the valid credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.setcard.step_defs.LoginStepDefs.userEnterTheValidCredentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to Firmalar page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.setcard.step_defs.DashBoardStepDefs.userNavigateToFirmalarPageSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User check the numbers of the company information",
  "keyword": "And "
});
formatter.match({
  "location": "com.setcard.step_defs.DashBoardStepDefs.userCheckTheNumbersOfTheCompanyInformation()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "As a Admin User, User can login with credentials.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User on the main URL",
  "keyword": "Given "
});
formatter.match({
  "location": "com.setcard.step_defs.LoginStepDefs.userOnTheMainURL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The User can login successfully with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "User enter the valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.setcard.step_defs.LoginStepDefs.userEnterTheValidCredentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to log in",
  "keyword": "Then "
});
formatter.match({
  "location": "com.setcard.step_defs.LoginStepDefs.userShouldBeAbleToLogIn()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "The User cannot login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enter \"\u003cemail\u003e\" and \"\u003cpassword\u003e\" and should be able to see \"\u003cmessage\u003e\" message",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "message"
      ]
    },
    {
      "cells": [
        "",
        "Setcard12",
        "Bu alan zorunludur"
      ]
    },
    {
      "cells": [
        "ibrahimucar@gmail.com",
        "",
        "Bu alan zorunludur"
      ]
    },
    {
      "cells": [
        "",
        "",
        "Bu alan zorunludur"
      ]
    },
    {
      "cells": [
        "ibrahimucar@gmail.com",
        "Abcdefg",
        "Kullanıcı adınız veya şifreniz yanlış."
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User on the main URL",
  "keyword": "Given "
});
formatter.match({
  "location": "com.setcard.step_defs.LoginStepDefs.userOnTheMainURL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The User cannot login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "User enter \"\" and \"Setcard12\" and should be able to see \"Bu alan zorunludur\" message",
  "keyword": "When "
});
formatter.match({
  "location": "com.setcard.step_defs.LoginStepDefs.userEnterAndAndShouldBeAbleToSeeMessage(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User on the main URL",
  "keyword": "Given "
});
formatter.match({
  "location": "com.setcard.step_defs.LoginStepDefs.userOnTheMainURL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The User cannot login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "User enter \"ibrahimucar@gmail.com\" and \"\" and should be able to see \"Bu alan zorunludur\" message",
  "keyword": "When "
});
formatter.match({
  "location": "com.setcard.step_defs.LoginStepDefs.userEnterAndAndShouldBeAbleToSeeMessage(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User on the main URL",
  "keyword": "Given "
});
formatter.match({
  "location": "com.setcard.step_defs.LoginStepDefs.userOnTheMainURL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The User cannot login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "User enter \"\" and \"\" and should be able to see \"Bu alan zorunludur\" message",
  "keyword": "When "
});
formatter.match({
  "location": "com.setcard.step_defs.LoginStepDefs.userEnterAndAndShouldBeAbleToSeeMessage(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User on the main URL",
  "keyword": "Given "
});
formatter.match({
  "location": "com.setcard.step_defs.LoginStepDefs.userOnTheMainURL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The User cannot login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "User enter \"ibrahimucar@gmail.com\" and \"Abcdefg\" and should be able to see \"Kullanıcı adınız veya şifreniz yanlış.\" message",
  "keyword": "When "
});
formatter.match({
  "location": "com.setcard.step_defs.LoginStepDefs.userEnterAndAndShouldBeAbleToSeeMessage(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});