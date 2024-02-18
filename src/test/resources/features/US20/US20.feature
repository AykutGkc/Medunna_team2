Feature: US20
  Background:
    Given Der Benutzer geht zur Webseite
    Then Klicken Sie auf das Benutzersymbol oben rechts
    Then Klicken Sie auf die Schaltflache Sign in im HomePage
    When Geben Sie "a85055" in Feld Yourname
    Then Geben Sie ein gultiges Password "a85055" ein
    And Klicken Sie auf die Schaltflache SignInSignIn
    Then Klicken Sie auf die Schaltflache Administration
    Then Klicken Sie auf die Schaltflache UserManagement


  Scenario: TC-01 Der Administrator sollte die Informationen der Benutzer sehen können
    Given Klicken Sie auf die Schaltflache Edit als Admin in User Management
    Then isDisplay Firstname, Lastname und E-mail

  Scenario: TC-02 Admin-Benutzer können es aktivieren und ihre Rollen als „ADMIN, USER, PATIENT, STAF und PHYSICIAN“ zuweisen.
    Given Klicken Sie auf die Schaltflache Edit als Admin in User Management
    Then Wählen Sie ROLE_USER in der Profiles
    Then Wählen Sie ROLE_PATIENT in der Profiles
    Then Wählen Sie ROLE_STAFF in der Profiles
    Then Wählen Sie ROLE_PHYSICIAN in der Profiles
    Then Wählen Sie ROLE_ADMIN in der Profiles
    Then Klicken Sie auf die Schaltflache Save in AdminUserManagementEdit
    And Es erscheint ein grünes Kontrollkästchen A user is updated with identifier user