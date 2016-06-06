Feature: Account Funtion

  Scenario: TC001-Create and Edit Account by Firefox
    Given I'm  on login page with Firefox
    When I fill "ACB" for invalid Username
    And I fill "ACB" for invalid Password
    And I press "Log in" button
    And I verify error message
    And I fill "khuongtran@hcmsfdg.vn" for valid Username
    And I fill "AtUk!0508@" for valid Password
    And I press Log in button
    When I click on Account tab
    And I click on New button
    And I fill in data into madatory fields and some fields
      | Field                    | Value                                    |
      | Account Name             | Tue Tran                                 |
      | Account Number           |                                 45345345 |
      | Account Site             |                                 45345435 |
      | Type                     | Customer - Channel                       |
      | Industry                 | Finance                                  |
      | Rating                   | Cold                                     |
      | Phone                    |                                 09675656 |
      | Fax                      |                               0967565656 |
      | Website                  | google.com                               |
      | Ticker Symbol            |                                  5645645 |
      | Ownership                | Private                                  |
      | Employees                | Khuong                                   |
      | Billing Street           | 366, Nguyen Trai, District 5, HCM City   |
      | Billing City             | CSCV                                     |
      | Billing State/Province   |                                  3432423 |
      | Billing Country          | Viet Nam                                 |
      | Shipping Street          | 102, Tang Nhon Phu, District 9, HCM City |
      | Shipping City            | Little Sai Gon                           |
      | Shipping State/Province  |                                 21321324 |
      | Shipping Zip/Postal Code |                                 34324234 |
      | Shipping Country         | Viet Nam                                 |
      | Customer Priority        | Low                                      |
      | Active                   | Yes                                      |
      | SLA                      | Platinum                                 |
      | SLA Serial Number        |                                  1231232 |
      | Upsell Opportunity       | Maybe                                    |
      | Description              | At the same time                         |
    And I click on Save button
    And I click on Edit button
    And I edit data into madatory fields and some fields
      | Field                    | Value                                        |
      | Account Name             | Tue Doanh                                    |
      | Account Number           |                                     12121212 |
      | Account Site             |                                        43242 |
      | Type                     | Installation Partner                         |
      | Industry                 | Environmental                                |
      | Rating                   | Warm                                         |
      | Phone                    |                                     09675656 |
      | Fax                      |                                   0967565656 |
      | Website                  | Nosalesforce.com                             |
      | Ticker Symbol            |                                      5645645 |
      | Ownership                | Subsidiary                                   |
      | Employees                | David                                        |
      | Billing Street           | 366, Dinh Tien Hoang, District 1, HCM City   |
      | Billing City             | CSCV                                         |
      | Billing State/Province   |                                      3432423 |
      | Billing Country          | Viet Nam                                     |
      | Shipping Street          | 102, To Ngoc Van, District Thu Duc, HCM City |
      | Shipping City            | Plazada                                      |
      | Shipping State/Province  |                                     21321324 |
      | Shipping Zip/Postal Code |                                     34324234 |
      | Shipping Country         | Viet Nam                                     |
      | Customer Priority        | Low                                          |
      | Active                   | No                                           |
      | SLA                      | Platinum                                     |
      | SLA Serial Number        |                                      1231232 |
      | Upsell Opportunity       | Maybe                                        |
      | Description              | Give informaton details                      |
    And I save edtion
    And I lougout Sales Appication in Salesforce
    Then I see all edited data is changed

  Scenario: TC002-Create and Edit Account by Chrome
    Given I'm  on login page with Chrome
    When I fill "ACB" for invalid Username by Chrome
    And I fill "ACB" for invalid Password by Chrome
    And I press "Log in" button by Chrome
    And I verify error message by Chrome
    And I fill "khuongtran@hcmsfdg.vn" for valid Username by Chrome
    And I fill "AtUk!0508@" for valid Password by Chrome
    And I press Log in button by Chrome
    When I click on Account tab by Chrome
    And I click on New button by Chrome
    And I fill in data into madatory fields and some fields by Chrome
      | Field                    | Value                                    |
      | Account Name             | Tue Tran                                 |
      | Account Number           |                                 45345345 |
      | Account Site             |                                 45345435 |
      | Type                     | Customer - Channel                       |
      | Industry                 | Finance                                  |
      | Rating                   | Cold                                     |
      | Phone                    |                                 09675656 |
      | Fax                      |                               0967565656 |
      | Website                  | google.com                               |
      | Ticker Symbol            |                                  5645645 |
      | Ownership                | Private                                  |
      | Employees                | Khuong                                   |
      | Billing Street           | 366, Nguyen Trai, District 5, HCM City   |
      | Billing City             | CSCV                                     |
      | Billing State/Province   |                                  3432423 |
      | Billing Country          | Viet Nam                                 |
      | Shipping Street          | 102, Tang Nhon Phu, District 9, HCM City |
      | Shipping City            | Little Sai Gon                           |
      | Shipping State/Province  |                                 21321324 |
      | Shipping Zip/Postal Code |                                 34324234 |
      | Shipping Country         | Viet Nam                                 |
      | Customer Priority        | Low                                      |
      | Active                   | Yes                                      |
      | SLA                      | Platinum                                 |
      | SLA Serial Number        |                                  1231232 |
      | Upsell Opportunity       | Maybe                                    |
      | Description              | At the same time                         |
    And I click on Save button by Chrome
    And I click on Edit button by Chrome
    And I edit data into madatory fields and some fields by Chrome
      | Field                    | Value                                        |
      | Account Name             | Tue Doanh                                    |
      | Account Number           |                                     12121212 |
      | Account Site             |                                        43242 |
      | Type                     | Installation Partner                         |
      | Industry                 | Environmental                                |
      | Rating                   | Warm                                         |
      | Phone                    |                                     09675656 |
      | Fax                      |                                   0967565656 |
      | Website                  | Nosalesforce.com                             |
      | Ticker Symbol            |                                      5645645 |
      | Ownership                | Subsidiary                                   |
      | Employees                | David                                        |
      | Billing Street           | 366, Dinh Tien Hoang, District 1, HCM City   |
      | Billing City             | CSCV                                         |
      | Billing State/Province   |                                      3432423 |
      | Billing Country          | Viet Nam                                     |
      | Shipping Street          | 102, To Ngoc Van, District Thu Duc, HCM City |
      | Shipping City            | Plazada                                      |
      | Shipping State/Province  |                                     21321324 |
      | Shipping Zip/Postal Code |                                     34324234 |
      | Shipping Country         | Viet Nam                                     |
      | Customer Priority        | Low                                          |
      | Active                   | No                                           |
      | SLA                      | Platinum                                     |
      | SLA Serial Number        |                                      1231232 |
      | Upsell Opportunity       | Maybe                                        |
      | Description              | Give informaton details                      |
    And I save edtion by Chrome
    And I lougout Sales Appication in Salesforce by Chrome
    Then I see all edited data is changed by Chrome

