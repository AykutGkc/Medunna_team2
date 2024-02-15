Feature:Als Administrator; Anlegen / Aktualisieren / Anzeigen und Löschen neuer Ärzte

  Background:
    Given Der Benutzer geht zur Webseite
    Then  Klicken Sie auf das Benutzersymbol oben rechts
    And Klicken Sie auf die Schaltflache SignInn
    And Geben Sie einen gultigen "physicianName" ein
    And Geben Sie ein gultiges "physicianPassword" ein
    And  Klicken Sie auf die Schaltflache Sign in
    And  Klicken Sie auf die Schaltflache Items&Titles
    And Klicken Sie auf die Schaltflache Physician

  Scenario:TC01 Als Administrator zeigen die Pyhsicians an
    And Uberpruft, ob die Angaben des Arztes sichtbar sind

  Scenario:TC02 Als Administrator zeigen neu Pyhsician an
    Given Klicken Sie auf die Schaltflache Create a new Physician
    Then Klicken Sie auf die Schaltflache Use Search
    And "ssn-NummerPhsy" wird eingegeben
    And Klicken Sie auf die Schaltflache Search User
    And Uberprüft, ob die Angaben des Arztes gesehen worden sind

  Scenario Outline: TC03 Als Administrator legt neu Pyhsician an
    Given Klicken Sie auf die Schaltflache Create a new Physician
    Then Für Pyhsician "<First Name>" "<Last Name>" "<Birt Date>" "<Phone>"wird eingegeben
    And Verwaltung wahlt Spezialisierung
    And Bild hochgeladen
    And Admin gibt "250" ein
    And Klicken Sie auf die Schaltflache Save
    And die Bestatigung, dass die Registrierungsnachricht nicht empfangen werden konnte
    Examples:
      | First Name | Last Name | Birt Date  | Phone      |
      | chris      | Gross     | 15.02.1998 | 4462002009 |

  Scenario: TC04 Als Administrator löcht ein Pyhsician
    Given Klicken Sie auf die Schaltflache Delete eines beliebigen Arztes in der Arzteliste
    Then Bestatigen Sie, dass die Loschung stattgefunden hat.
