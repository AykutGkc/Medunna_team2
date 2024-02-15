Feature: US24 My Appointments (Randevular) (Patient)

  Background:
    Given Der Benutzer geht zur Webseite
    And Klicken Sie auf das Benutzersymbol oben rechts
    And Klicken Sie auf die Schaltflache SignInn
    And Geben Sie einen gultigen "patientName" ein
    And Geben Sie ein gultiges "patientPassword" ein
    And Klicken Sie auf die Schaltflache Sign in
    And Klicken Sie auf die Schaltflache My Pages(Patient)
    And Klicken Sie auf die Schaltflache My Appoiment


  Scenario: TC01
    Given Geben Sie das Datum in das Feld "<from>" "<to>" ein.
    And Klicken Sie auf die Schaltflache Show Test
    And Klicken Sie auf die Schaltflache View Results
    And  Bestatigung, dass die Testergebnisse gesehen worden sind

  Scenario: TC02
    Given Geben Sie das Datum in das Feld "<from>" "<to>" ein.
    And Klicken Sie auf die Schaltflache Show Invoice
    And Es stimmt, dass die Rechnung gesehen wurde
