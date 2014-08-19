$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("practicepack/Developer.feature");
formatter.feature({
  "line": 1,
  "name": "Life of IT guys",
  "description": "In order to get good salary\r\nAs a IT guy\r\nI want to keep my boss happy",
  "id": "life-of-it-guys",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "I am a good developer",
  "description": "",
  "id": "life-of-it-guys;i-am-a-good-developer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am a \"good\" developer",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I go to work",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I \"complete\" the work",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "My boss \"praises\" me",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "My manager \"hate\" me",
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "good",
      "offset": 8
    }
  ],
  "location": "Developer.I_am_good_developer(String)"
});
formatter.result({
  "duration": 170379125,
  "status": "passed"
});
formatter.match({
  "location": "Developer.I_go_to_work()"
});
formatter.result({
  "duration": 194788,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "complete",
      "offset": 3
    }
  ],
  "location": "Developer.I_complete_the_work(String)"
});
formatter.result({
  "duration": 157063,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "praises",
      "offset": 9
    }
  ],
  "location": "Developer.My_boss_praises_me(String)"
});
formatter.result({
  "duration": 212881,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hate",
      "offset": 12
    }
  ],
  "location": "Developer.My_Manager_likes_me(String)"
});
formatter.result({
  "duration": 193248,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "I am a bad developer",
  "description": "",
  "id": "life-of-it-guys;i-am-a-bad-developer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I am a \"bad\" developer",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I go to work",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I \"mess\" the work",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "My boss \"hates\" me",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "My manager \"likes\" me",
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "bad",
      "offset": 8
    }
  ],
  "location": "Developer.I_am_good_developer(String)"
});
formatter.result({
  "duration": 336453,
  "status": "passed"
});
formatter.match({
  "location": "Developer.I_go_to_work()"
});
formatter.result({
  "duration": 167842,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mess",
      "offset": 3
    }
  ],
  "location": "Developer.I_complete_the_work(String)"
});
formatter.result({
  "duration": 196328,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hates",
      "offset": 9
    }
  ],
  "location": "Developer.My_boss_praises_me(String)"
});
formatter.result({
  "duration": 210186,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "likes",
      "offset": 12
    }
  ],
  "location": "Developer.My_Manager_likes_me(String)"
});
formatter.result({
  "duration": 160912,
  "status": "passed"
});
formatter.uri("practicepack/tester.feature");
formatter.feature({
  "line": 1,
  "name": "Life of techical",
  "description": "In order to impress great tech\r\nAs a Innovator\r\nI want to keep my people thinkers",
  "id": "life-of-techical",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "i works to Microsoft",
  "description": "",
  "id": "life-of-techical;i-works-to-microsoft",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I work in \"Microsoft\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I met \"nadellasatya\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "He \"notwilling\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "he is a \"cool\" person",
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "Microsoft",
      "offset": 11
    }
  ],
  "location": "Teste.I_works(String)"
});
formatter.result({
  "duration": 697157,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nadellasatya",
      "offset": 7
    }
  ],
  "location": "Teste.I_met(String)"
});
formatter.result({
  "duration": 347231,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "notwilling",
      "offset": 4
    }
  ],
  "location": "Teste.He(String)"
});
formatter.result({
  "duration": 276784,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cool",
      "offset": 9
    }
  ],
  "location": "Teste.he_is(String)"
});
formatter.result({
  "duration": 293337,
  "status": "passed"
});
});