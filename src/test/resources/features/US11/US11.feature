Feature: Der Termin von Arzt US11
  Background: Sign in Web Seite
    Given Der Benutzer geht zur Webseite
    Then Klicken Sie auf das Benutzersymbol oben rechts
    Then Klicken Sie auf die Schaltflache Sign in im HomePage
    When Geben Sie "m85055" in Feld Yourname
    Then Geben Sie ein gultiges Password "m85055" ein
    And Klicken Sie auf die Schaltflache SignInSignIn
    
    Scenario: TC-01 Der Arzt kann bestehender Termin vereinbaren
      Given Klicken Sie auf die Schaltflache My Pages
      Then Klicken Sie auf die Schaltflache My Appoiment
      Then Klicken Sie auf die Schaltflache Edit von Patienten
      Then Geben Sie ein "anammesis" in Anamnesis
      When Geben Sie ein "Treatment" in Treatment
      And Geben Sie ein "Diagnosis" in Diagnosis
      And Klicken Sie auf die Schaltflache Save in ApointmentPages
      And Es erscheint ein grünes Kontrollkästchen TheAppointmentIsupdatedWithIdentifier


    Scenario: TC-02 Der Arzt sollte einen Termin vereinbaren können
      Given Vereinbaren Sie mit Firstname "Müller", Lastname"Tho",SSN als NNN-NN-NNNN "111-22-4522",e-mail"abc@cbad.com",Phone"012-123-5673"
      Then Klicken Sie auf die Schaltflache Send an Appointment Request
      And Es erscheint ein grünes Kontrollkästchen Appointment registration saved!

    Scenario: TC-03 Der Arzt muss die Situation ändern
      Given Klicken Sie auf die Schaltflache My Pages
      Then Klicken Sie auf die Schaltflache My Appoiment
      Then Klicken Sie auf die Schaltflache Edit von Patienten
      When Klicken Sie auf die Schaltflache Status
      Then Wählen Sie Pending im Status
      And Klicken Sie auf die Schaltflache Save in ApointmentPages
      And Es erscheint ein grünes Kontrollkästchen TheAppointmentIsupdatedWithIdentifier