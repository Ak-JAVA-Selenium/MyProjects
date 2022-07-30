#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Movie release date & region matching from diffrent websites

  @tag1
  Scenario Outline: Search movie on wikipedia and Get movie release date & region from wikipedia
    Given open <browserName> browser 
    And enter wikipedia https://en.wikipedia.org/wiki/Main_Page 
    When search <movie name> on wikipedia
    Then validate WikipediaPage <expectedtitle>
    And get movie <detail1> & <detail2> from WikipediaPage

    Examples: 
      | browserName  | movie name               | expectedtitle                        | detail1      | detail2 |     
      | chrome		   | K.G.F: Chapter 2         | K.G.F: Chapter 2 - Wikipedia         | Release date | Country |
      | firefox		   | Pushpa: The Rise         | Pushpa: The Rise - Wikipedia         | Release date | Country |
	    | edge		     | Beast (2022 Indian film) | Beast (2022 Indian film) - Wikipedia | Release date | Country |

@tag1
  Scenario Outline: Search movie on IMDb and Get movie release date & region from IMDb
    Given open <browserName> browser 
    And enter IMDb https://www.imdb.com/ 
    When search <movie name> on IMDb
    Then validate IMDbPage <expectedtitle>
    And get movie <detail1> & <detail2> from IMDbPage

    Examples: 
      | browserName  | movie name               | expectedtitle                           | detail1      | detail2           |     
      | chrome		   | K.G.F: Chapter 2         | K.G.F: Chapter 2 (2022) - IMDb          | Release date | Country of origin |
      | firefox		   | Pushpa: The Rise         | Pushpa: The Rise - Part 1 (2021) - IMDb | Release date | Country of origin |
	    | edge		     | Beast                    | Beast (2022) - IMDb                     | Release date | Country of origin |
	    
	    @tag1
  Scenario: Match release dates & regions
    Then validate release dates & regions of Wikipedia & IMDb
    
    
    
    