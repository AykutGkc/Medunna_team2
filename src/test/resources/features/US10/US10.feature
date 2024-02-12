Feature: My Appoiment

  Background:
    Given Der Benutzer geht zur Webseite
    Then Klicken Sie auf das Benutzersymbol oben rechts
    And Klicken Sie auf die Schaltflache SignInn
    And Geben Sie einen gultigen "patientName" ein
    And Geben Sie ein gultiges "patientPassword" ein
    And Klicken Sie auf die Schaltflache Sign in
    And Klicken Sie auf die Schaltflache My Pages(Patient)
    And Klicken Sie auf die Schaltflache My Appoiment

  Scenario Outline: Bestätigen My Appoiment
    Given Geben Sie das Datum in das Feld "<from>" "<to>" ein.
    Then Der Benutzer bestatigt, dass die Terminliste und die Zeitfenster auf der Registerkarte My Appointments sichtbar sind.
    And Es wird bestatigt, dass der Benutzer die Informationen Patienten-ID, Startdatum, Enddatum, Status gesehen hat.
    Examples:
      |  from    |    to     |
      |01.02.2024| 10.02.2024|




