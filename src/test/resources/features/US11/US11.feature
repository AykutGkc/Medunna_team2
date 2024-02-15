Feature: Der Termin von Arzt US11
  Background: Sign in Web Seite
    Given Der Benutzer geht zur Webseite
    Then Klicken Sie auf das Benutzersymbol oben rechts
    Then Klicken Sie auf die Schaltflache Sign in
    When Geben Sie "m85055" in Feld Yourname
    And Geben Sie ein gultiges "m85055" ein
    
    Scenario: afdsa
      Given Klicken Sie auf die Schaltflache My Pages
      Then Klicken Sie auf die Schaltflache My Appoiment
      Then Klicken Sie auf die Schaltflache Edit von Patienten
