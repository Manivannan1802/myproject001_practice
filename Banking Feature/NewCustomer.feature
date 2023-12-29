Feature:  New Customber page verification
Background:
 
		Given user launch chrome browser
    When user open url  "https://demo.guru99.com/v3/index.php"
    And User enters email as "mngr545375" and password as "Uhysapa"
    And Click on Login
    Then page title should be "Guru99 Bank Manager HomePage"

Scenario Outline: Check user can able to Add customer in the new customer page
Given Navigate to the new customer page
When User enter "<Customer Name>" as customer name
And User enter "<Gender>" as Gender
And User enter "<Date of Birth>" as DOB
And User enter "<Address>" as address field
And User enter "<City>" as city field
And User enter "<State>" as state field
And User enter "<PIN>" as Pin field
And User enter "<Mobile Number>" as mobile number
And User enter "<E-mail>" as email id 
And User enter "<Password>" as password field
And User click on submit button to add the customer
Then Page should be contain "Customer Registered Successfully!!!"



Examples:
| Customer Name | Gender | Date of Birth | Address           | City    | State      | PIN     | Mobile Number | E-mail         | Password |  
| Megs          | Female | 11-09-1996    | Vivekanda nagar   | Chennai | TamilNadu  | 600118  | +919787878298 | megs76@gmail.com | Test@123 |
#| Test          | Female | 11-09-1993    | Test nagar        | Chennai | TamilNadu  | 600118  | +919087878798 | mani5@gmail.com | Test@123 |  
#| Mani          | Male   | 11-09-1992    | MKB nagar         | Chennai | TamilNadu  | 600118  | +919780878798 | Test5@gmail.com | Test@123 |
#| Aarthi        | Female | 11-09-1999    | MR nagar          | Chennai | TamilNadu  | 600118  | +919789878798 | Aarthi5@gmail.com | Test@123 |

