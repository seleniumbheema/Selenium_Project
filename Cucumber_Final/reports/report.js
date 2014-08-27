$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/resources/Developer.feature");
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
  "duration": 140313239,
  "status": "passed"
});
formatter.match({
  "location": "Developer.I_go_to_work()"
});
formatter.result({
  "duration": 147824,
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
  "duration": 151673,
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
  "duration": 143589,
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
  "duration": 153597,
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
  "duration": 309890,
  "status": "passed"
});
formatter.match({
  "location": "Developer.I_go_to_work()"
});
formatter.result({
  "duration": 137045,
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
  "duration": 160912,
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
  "duration": 165531,
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
  "duration": 123956,
  "status": "passed"
});
formatter.uri("com/resources/tester.feature");
formatter.feature({
  "line": 1,
  "name": "Life of techical",
  "description": "In order to impress great tech\r\nAs a Innovator\r\nI want to keep my people thinkers",
  "id": "life-of-techical",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 18,
  "name": "i works to Microsoft",
  "description": "",
  "id": "life-of-techical;i-works-to-microsoft;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I work in \"Micro\"",
  "matchedColumns": [
    0
  ],
  "rows": [
    {
      "cells": [
        "tech",
        "country"
      ],
      "line": 9
    },
    {
      "cells": [
        "Java",
        "India"
      ],
      "line": 10
    },
    {
      "cells": [
        "Sel",
        "Pak"
      ],
      "line": 11
    },
    {
      "cells": [
        "SAP",
        "Germany"
      ],
      "line": 12
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I met \"Nadella\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "He \"white\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "he is a \"naughty\" person",
  "matchedColumns": [
    3
  ],
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "Micro",
      "offset": 11
    }
  ],
  "location": "Teste.I_works(String,DataTable)"
});
formatter.result({
  "duration": 1491707,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nadella",
      "offset": 7
    }
  ],
  "location": "Teste.I_met(String)"
});
formatter.result({
  "duration": 132810,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "white",
      "offset": 4
    }
  ],
  "location": "Teste.He(String)"
});
formatter.result({
  "duration": 142049,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naughty",
      "offset": 9
    }
  ],
  "location": "Teste.he_is(String)"
});
formatter.result({
  "duration": 135889,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "i works to Microsoft",
  "description": "",
  "id": "life-of-techical;i-works-to-microsoft;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I work in \"Apple\"",
  "matchedColumns": [
    0
  ],
  "rows": [
    {
      "cells": [
        "tech",
        "country"
      ],
      "line": 9
    },
    {
      "cells": [
        "Java",
        "India"
      ],
      "line": 10
    },
    {
      "cells": [
        "Sel",
        "Pak"
      ],
      "line": 11
    },
    {
      "cells": [
        "SAP",
        "Germany"
      ],
      "line": 12
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I met \"tim\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "He \"european\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "he is a \"silent\" person",
  "matchedColumns": [
    3
  ],
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "Apple",
      "offset": 11
    }
  ],
  "location": "Teste.I_works(String,DataTable)"
});
formatter.result({
  "duration": 383416,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tim",
      "offset": 7
    }
  ],
  "location": "Teste.I_met(String)"
});
formatter.result({
  "duration": 134735,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "european",
      "offset": 4
    }
  ],
  "location": "Teste.He(String)"
});
formatter.result({
  "duration": 95470,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "silent",
      "offset": 9
    }
  ],
  "location": "Teste.he_is(String)"
});
formatter.result({
  "duration": 148593,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "i works to Microsoft",
  "description": "",
  "id": "life-of-techical;i-works-to-microsoft;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I work in \"samsu\"",
  "matchedColumns": [
    0
  ],
  "rows": [
    {
      "cells": [
        "tech",
        "country"
      ],
      "line": 9
    },
    {
      "cells": [
        "Java",
        "India"
      ],
      "line": 10
    },
    {
      "cells": [
        "Sel",
        "Pak"
      ],
      "line": 11
    },
    {
      "cells": [
        "SAP",
        "Germany"
      ],
      "line": 12
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I met \"larry\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "He \"Indian\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "he is a \"copy\" person",
  "matchedColumns": [
    3
  ],
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "samsu",
      "offset": 11
    }
  ],
  "location": "Teste.I_works(String,DataTable)"
});
formatter.result({
  "duration": 472342,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "larry",
      "offset": 7
    }
  ],
  "location": "Teste.I_met(String)"
});
formatter.result({
  "duration": 160527,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Indian",
      "offset": 4
    }
  ],
  "location": "Teste.He(String)"
});
formatter.result({
  "duration": 138969,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "copy",
      "offset": 9
    }
  ],
  "location": "Teste.he_is(String)"
});
formatter.result({
  "duration": 170151,
  "status": "passed"
});
});