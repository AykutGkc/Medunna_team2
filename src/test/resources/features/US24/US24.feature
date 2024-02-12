Feature: US24 My Appointments (Randevular) (Patient)

  Background:
    Given Der Benutzer geht zur Webseite
    And Klicken Sie auf das Benutzersymbol oben rechts
    And Klicken Sie auf die Schaltflache Registrieren
    And Geben Sie einen gultigen {string} einltigen Benutzernamen ein
    And Geben Sie ein gultiges {string} ein
    And Klicken Sie auf die Schaltflache Sign in
    And Klicken Sie auf die Schaltflache My Pages(Patient)
    And Klicken Sie auf die Schaltflache My Appoiment


  Scenario: TC01
    Given Geben Sie das Datum in das Feld "from" ein.
    Then Geben Sie das Datum in das Feld "to" ein.
    And Klicken Sie auf die Schaltfläche Show Test
    And Klicken Sie auf die Schaltfläche View Results
    And  Bestätigung, dass die Testergebnisse gesehen worden sind

  Scenario: TC02
    Given Geben Sie das Datum in das Feld "from" ein.
    Then Geben Sie das Datum in das Feld "to" ein.
    And Klicken Sie auf die Schaltflache Payment
    And Es stimmt, dass die Rechnung gesehen wurde