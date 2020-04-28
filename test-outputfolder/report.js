$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/CreateUser.feature");
formatter.feature({
  "name": "Creating new user portal",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create useer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.launch_Chrome_Browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter url \"http://www.newtours.demoaut.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_url(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Register user link",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.click_on_Register_user_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter FirstName as \"Bacd0\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_FirstName_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter LastName as \"Sirvi\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_LastName_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Phone Number as \"1234567890\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_Phone_Number_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter EmailID as \"abcd@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_EmailID_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Adress as \"Hyderabad\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_Adress_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter City as \"Kondapur\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_City_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter State/Province as \"Tel State\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_State_Province_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Postal Code as \"500084\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_Postal_Code_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Country as \"TOGO\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_Country_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter User Name as \"MyUser\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_User_Name_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Password  \"abc@1234\" and confirm password \"abc@1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_Password_and_confirm_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.closeBrowsser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Create multiple user data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Enter url \"http://www.newtours.demoaut.com/\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click on Register user link",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter FirstName as \"\u003cFirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter LastName as \"\u003cLastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Phone Number as \"\u003cPhoneNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter EmailID as \"\u003cEmailID\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Adress as \"\u003cAddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter City as \"\u003cCity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter State/Province as \"\u003cState\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Postal Code as \"\u003cPinCode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Country as \"\u003cCountry\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter User Name as \"\u003cUserName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Password  \"\u003cPassword\u003e\" and confirm password \"\u003cConfirmPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Firstname",
        "LastName",
        "PhoneNumber",
        "EmailID",
        "Address",
        "City",
        "State",
        "PinCode",
        "Country",
        "UserName",
        "Password",
        "ConfirmPassword"
      ]
    },
    {
      "cells": [
        "fone",
        "lastone",
        "1234567890",
        "abc@gmail.com",
        "adone",
        "cone",
        "S1",
        "52112",
        "INDIA",
        "userone",
        "password1",
        "password1"
      ]
    },
    {
      "cells": [
        "ftwo",
        "lasttwo",
        "9876543210",
        "def@gmail.com",
        "adtwo",
        "ctwo",
        "S2",
        "12345",
        "TOGO",
        "usertwo",
        "password2",
        "password3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create multiple user data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Enter url \"http://www.newtours.demoaut.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_url(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Register user link",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.click_on_Register_user_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter FirstName as \"fone\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_FirstName_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter LastName as \"lastone\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_LastName_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Phone Number as \"1234567890\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_Phone_Number_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter EmailID as \"abc@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_EmailID_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Adress as \"adone\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_Adress_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter City as \"cone\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_City_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter State/Province as \"S1\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_State_Province_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Postal Code as \"52112\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_Postal_Code_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Country as \"INDIA\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_Country_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter User Name as \"userone\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_User_Name_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Password  \"password1\" and confirm password \"password1\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_Password_and_confirm_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.closeBrowsser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Create multiple user data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Enter url \"http://www.newtours.demoaut.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_url(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Register user link",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.click_on_Register_user_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter FirstName as \"ftwo\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_FirstName_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter LastName as \"lasttwo\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_LastName_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Phone Number as \"9876543210\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_Phone_Number_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter EmailID as \"def@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_EmailID_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Adress as \"adtwo\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_Adress_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter City as \"ctwo\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_City_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter State/Province as \"S2\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_State_Province_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Postal Code as \"12345\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_Postal_Code_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Country as \"TOGO\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_Country_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter User Name as \"usertwo\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_User_Name_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Password  \"password2\" and confirm password \"password3\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.enter_Password_and_confirm_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefnetions.CreateUserSteps.closeBrowsser()"
});
formatter.result({
  "status": "skipped"
});
});