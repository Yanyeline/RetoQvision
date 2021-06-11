Feature: Create a new user

  Scenario Outline: Create a new user in Utest
    Given User is on the home page
    When Enter registration information
      | firstName       | <firstName>       |
      | lastName        | <lastName>        |
      | email           | <email>           |
      | birthMonth      | <birthMonth>      |
      | birthDay        | <birthDay>        |
      | birthYear       | <birthYear>       |
      | languages       | <languages>       |
      | city            | <city>            |
      | postalCode      | <postalCode>      |
      | country         | <country>         |
      | MobileDevice    | <MobileDevice>    |
      | model           | <model>           |
      | operatingSystem | <operatingSystem> |
      | createPassword  | <createPassword>  |
      | confirmPassword | <confirmPassword> |

    Then Create the new user and enter the application
      | email          | <email>          |
      | createPassword | <createPassword> |
    Examples:
      | firstName | lastName | email             | birthMonth | birthDay | birthYear | languages | city     | postalCode | country  | MobileDevice | model     | operatingSystem | createPassword | confirmPassword |
      | Claudia   | Loaiza   | claul98@gmail.com | August     | 3        | 1998      | Spanish   | Medellín | 050040     | colombia | Apple        | iphone 11 | iOS 14          | Yanye980803    | Yanye980803     |
