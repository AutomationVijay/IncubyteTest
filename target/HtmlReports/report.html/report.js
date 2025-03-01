$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/Registration.feature");
formatter.feature({
  "name": "Registration Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC_1 - Open Registration Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on dashboard for tenant",
  "keyword": "Given "
});
formatter.match({
  "location": "com.example.steps.RegistrationStep.user_is_on_dashboard_for_tenant()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Create an Account",
  "keyword": "Then "
});
formatter.match({
  "location": "com.example.steps.RegistrationStep.user_click_on_Create_an_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user is on registration page",
  "keyword": "And "
});
formatter.match({
  "location": "com.example.steps.RegistrationStep.verify_user_is_on_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});