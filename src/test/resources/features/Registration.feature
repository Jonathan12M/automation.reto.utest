# Autor: Jonathan Perafan Moreno

@stories
  Feature: uTest Page
    As a user, want to create new account at utest page with registration form

    @scenario1
   Scenario Outline: New user registration page Utest
      Given A new user wants to register using the personal form
      When is registered correctly
      Then validate label on last step of form



