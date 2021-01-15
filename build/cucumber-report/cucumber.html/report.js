$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LoginPage.feature");
formatter.feature({
  "name": "Guru99 Bank login page feature",
  "description": "  As a user i wants to verify the login page feature.",
  "keyword": "Feature"
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
  "name": "As a user i navigate to url \"http://www.demo.guru99.com/V4/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "demp.guru99.com.steps.LoginPageSteps.as_a_user_i_navigate_to_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify userId and Password label",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "UserId label is \"UserID\"",
  "keyword": "Then "
});
formatter.match({
  "location": "demp.guru99.com.steps.LoginPageSteps.userid_label_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Password Label is \"Password\"",
  "keyword": "And "
});
formatter.match({
  "location": "demp.guru99.com.steps.LoginPageSteps.password_Label_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LoginPage.feature");
formatter.feature({
  "name": "Guru99 Bank login page feature",
  "description": "  As a user i wants to verify the login page feature.",
  "keyword": "Feature"
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
  "name": "As a user i navigate to url \"http://www.demo.guru99.com/V4/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "demp.guru99.com.steps.LoginPageSteps.as_a_user_i_navigate_to_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify alert text",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter userId as \"\" and password \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "demp.guru99.com.steps.LoginPageSteps.i_enter_userId_as_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get a alert with text \"User or Password is not valid\"",
  "keyword": "Then "
});
formatter.match({
  "location": "demp.guru99.com.steps.LoginPageSteps.i_get_a_alert_with_text(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
