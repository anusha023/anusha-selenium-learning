Feature: account holder withdraw wcash

Scenario: account has sufficiant cash
Given the account has sufficiant funds
And   card should be working
And   atm mission should have sufficiant cash
When  account holder withdraw £30 
Then  card should be come out 
And   money should be withdraw
 