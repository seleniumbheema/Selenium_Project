Feature: Life of IT guys
In order to get good salary
As a IT guy
I want to keep my boss happy

@developer
Scenario Outline: I am a good developer
Given I am a "<behav>" developer
|	tech	|	country	|
|	Java	|	US		|
|	XSLT	|	UK		|
When I go to work
Then I "<status>" the work
And My boss "<relation>" me
But My manager "<angry>" me
Examples:
|	behav	|	status	|	relation	|	angry	|
|	good	|	complete|	praises		|	hates	|
|	midd	|	left	|	opposes		|	likes	|
|	bad		|	incomp	|	irritate	|	kills	|



#Scenario: I am a bad developer
#Given I am a "bad" developer
#When I go to work
#Then I "mess" the work
#And My boss "hates" me
#But My manager "likes" me