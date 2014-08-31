$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/resources/Developer.feature");
formatter.feature({
  "line": 1,
  "name": "Life of IT guys",
  "description": "In order to get good salary\r\nAs a IT guy\r\nI want to keep my boss happy",
  "id": "life-of-it-guys",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 18,
  "name": "I am a good developer",
  "description": "",
  "id": "life-of-it-guys;i-am-a-good-developer;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@developer"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am a \"good\" developer",
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
        "US"
      ],
      "line": 10
    },
    {
      "cells": [
        "XSLT",
        "UK"
      ],
      "line": 11
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I go to work",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I \"complete\" the work",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "My boss \"praises\" me",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "My manager \"hates\" me",
  "matchedColumns": [
    3
  ],
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "good",
      "offset": 8
    }
  ],
  "location": "Developer.I_am_good_developer(String,DataTable)"
});
formatter.result({
  "duration": 145021606,
  "status": "passed"
});
formatter.match({
  "location": "Developer.I_go_to_work()"
});
formatter.result({
  "duration": 126652,
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
  "duration": 132042,
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
  "duration": 85846,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hates",
      "offset": 12
    }
  ],
  "location": "Developer.My_Manager_likes_me(String)"
});
formatter.result({
  "duration": 123957,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "I am a good developer",
  "description": "",
  "id": "life-of-it-guys;i-am-a-good-developer;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@developer"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am a \"midd\" developer",
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
        "US"
      ],
      "line": 10
    },
    {
      "cells": [
        "XSLT",
        "UK"
      ],
      "line": 11
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I go to work",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I \"left\" the work",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "My boss \"opposes\" me",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "My manager \"likes\" me",
  "matchedColumns": [
    3
  ],
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "midd",
      "offset": 8
    }
  ],
  "location": "Developer.I_am_good_developer(String,DataTable)"
});
formatter.result({
  "duration": 490439,
  "status": "passed"
});
formatter.match({
  "location": "Developer.I_go_to_work()"
});
formatter.result({
  "duration": 64289,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "left",
      "offset": 3
    }
  ],
  "location": "Developer.I_complete_the_work(String)"
});
formatter.result({
  "duration": 261387,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "opposes",
      "offset": 9
    }
  ],
  "location": "Developer.My_boss_praises_me(String)"
});
formatter.result({
  "duration": 134351,
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
  "duration": 123957,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "I am a good developer",
  "description": "",
  "id": "life-of-it-guys;i-am-a-good-developer;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@developer"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am a \"bad\" developer",
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
        "US"
      ],
      "line": 10
    },
    {
      "cells": [
        "XSLT",
        "UK"
      ],
      "line": 11
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I go to work",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I \"incomp\" the work",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "My boss \"irritate\" me",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "My manager \"kills\" me",
  "matchedColumns": [
    3
  ],
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "bad",
      "offset": 8
    }
  ],
  "location": "Developer.I_am_good_developer(String,DataTable)"
});
formatter.result({
  "duration": 378416,
  "status": "passed"
});
formatter.match({
  "location": "Developer.I_go_to_work()"
});
formatter.result({
  "duration": 94315,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "incomp",
      "offset": 3
    }
  ],
  "location": "Developer.I_complete_the_work(String)"
});
formatter.result({
  "duration": 185936,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "irritate",
      "offset": 9
    }
  ],
  "location": "Developer.My_boss_praises_me(String)"
});
formatter.result({
  "duration": 88156,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kills",
      "offset": 12
    }
  ],
  "location": "Developer.My_Manager_likes_me(String)"
});
formatter.result({
  "duration": 85461,
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
  "duration": 642113,
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
  "duration": 106249,
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
  "duration": 84306,
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
  "duration": 78917,
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
  "duration": 337609,
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
  "duration": 112023,
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
  "duration": 92390,
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
  "duration": 199409,
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
  "duration": 495058,
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
  "duration": 122802,
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
  "duration": 103554,
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
  "duration": 98549,
  "status": "passed"
});
});