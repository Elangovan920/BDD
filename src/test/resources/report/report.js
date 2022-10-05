$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/search.feature");
formatter.feature({
  "name": "login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@all"
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should be in facebook home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefnitions.the_user_should_be_in_facebook_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "to check login functionality with valid creditionals",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@all"
    },
    {
      "name": "@group1"
    }
  ]
});
formatter.step({
  "name": "the user fills the valid login creditionals in username and password field",
  "rows": [
    {
      "cells": [
        "user",
        "pass"
      ]
    },
    {
      "cells": [
        "user1",
        "pass1"
      ]
    },
    {
      "cells": [
        "user2",
        "pass2"
      ]
    },
    {
      "cells": [
        "user3",
        "pass3"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefnitions.the_user_fills_the_valid_login_creditionals_in_username_and_password_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefnitions.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should navigate to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefnitions.the_user_should_navigate_to_the_home_page()"
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
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should be in facebook home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefnitions.the_user_should_be_in_facebook_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "to check login functionality with invalid creditionals",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@all"
    },
    {
      "name": "@group2"
    }
  ]
});
formatter.step({
  "name": "the user fills the invalid login creditionals in username and password field",
  "rows": [
    {
      "cells": [
        "user",
        "pass"
      ]
    },
    {
      "cells": [
        "user1",
        "pass1"
      ]
    },
    {
      "cells": [
        "user2",
        "pass2"
      ]
    },
    {
      "cells": [
        "user3",
        "pass3"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefnitions.the_user_fills_the_invalid_login_creditionals_in_username_and_password_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefnitions.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should navigate to the invalid page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefnitions.the_user_should_navigate_to_the_invalid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});