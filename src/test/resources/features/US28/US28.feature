Feature: US28
  Background:
    Given Der Benutzer geht zur Webseite
    Then Klicken Sie auf das Benutzersymbol oben rechts
    Then Klicken Sie auf die Schaltflache Sign in im HomePage
    When Geben Sie "a85055" in Feld Yourname
    Then Geben Sie ein gultiges Password "a85055" ein
    And Klicken Sie auf die Schaltflache SignInSignIn
    Then Klicken Sie auf die Schaltflache Items&Titles

  Scenario: TC-01 Der Administrator kann ein neues Land erstellen
    Given Klicken Sie auf die Schaltflache Country
    Then Klicken Sie auf die Schaltflache Create a new Country
    Then Geben Sie ein Country Name "Mali" ein
    When Klicken Sie auf die Schaltflache Save in CountryNewPage
    And Es erscheint ein grünes Kontrollkästchen A new Country is created with identifier


  Scenario: TC-02 Der Administrator kann ein neue Stadt erstellen
    Given Klicken Sie auf die Schaltflache StateCity
    Then Klicken Sie auf die Schaltflache Create a new StateCity
    Then Geben Sie ein StateCity Name "Mittel Mali" ein
    When Klicken Sie auf die Schaltflache Save in cStateNewPage
    And Es erscheint ein grünes Kontrollkästchen A new Country is created with identifier

  Scenario:TC-03 Der Administrator kann ein Land löschen
    Given Klicken Sie auf die Schaltflache Country
    Then Löschen Sie ein Land
    And Es erscheint ein grünes Kontrollkästchen A new Country is deleted with identifier


