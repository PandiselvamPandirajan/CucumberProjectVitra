$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Asus/eclipse-workspace/VitraProject/FeatureFiles/Login.feature");
formatter.feature({
  "name": "To Validate Login Functionality of Vitra Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Validate Login with Valid username and Invalid Password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To Launch the Chrome browser and hit the Vitra Url",
  "keyword": "Given "
});
formatter.match({
  "location": "VitraLogin.to_Launch_the_Chrome_browser_and_hit_the_Vitra_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Enter Valid Email in Email Field",
  "keyword": "When "
});
formatter.match({
  "location": "VitraLogin.to_Enter_Valid_Email_in_Email_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Enter Invalid Password in Password Field",
  "keyword": "And "
});
formatter.match({
  "location": "VitraLogin.to_Enter_Invalid_Password_in_Password_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Click the login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "To Close the Chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "VitraLogin.to_Close_the_Chrome_browser()"
});
formatter.result({
  "status": "skipped"
});
});