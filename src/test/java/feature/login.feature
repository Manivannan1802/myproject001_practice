Feature: Login

  

  Scenario: Successful login with valid credentials
  	Given user launch chrome browser
    When user open url  "https://admin-demo.nopcommerce.com/login"
    And User enters email as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then page title should be "Dashboard / nopCommerce administration"
    When user click on Logout link
    Then page title should be "Your store. Login"
    And Close browser
