# Autor: Jonathan Perafan Moreno

@stories
Feature: uTest Page
   As a user, want to create new account at utest page with registration form

   @scenario1
   Scenario Outline: New user registration page Utest
      Given A new user wants to register using the personal form
      When is registered correctly
         | firstName      | lastName      | email        | monthBirth      | dayBirth      | yearBirth      | languageSpoken      | city      | postalCode      | country         | computerOs      | computerVersion      | computerLanguage      | mobileBrand      | mobileModel      | mobileOs      | password      |
         | <strfirstName> | <strlastName> | <stremail>   | <strmonthBirth> | <strdayBirth> | <stryearBirth> | <strlanguageSpoken> | <strcity> | <strpostalCode> | <strcountry>    | <strcomputerOs> | <strcomputerVersion> | <strcomputerLanguage> | <strmobileBrand> | <strmobileModel> | <strmobileOs> | <strpassword> |
      Then validate label on last step of form
         | lastStepLabel     |
         | <strlastStepLabel>|
   Examples:
         | strfirstName | strlastName | stremail            | strmonthBirth | strdayBirth | stryearBirth | strlanguageSpoken | strcity  | strpostalCode | strcountry    | strcomputerOs | strcomputerVersion | strcomputerLanguage | strmobileBrand | strmobileModel | strmobileOs   | strpassword |  strlastStepLabel |
         | Pepito       | Peres       | pepito346@gmail.com | February      | 13          | 1976         | Spanish           | Medellin | 050031        | Colombia      | Windows       | 10                 | Spanish             | Xiaomi         | Mi 4           | Android 4.4.4 | pepito456   |  Welcome to the world´s largest |





