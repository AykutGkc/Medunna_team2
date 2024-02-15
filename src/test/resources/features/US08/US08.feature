
Feature: Us08
  Background: A
    Given Der Benutzer geht zur Webseite
    And Meldet sich mit Ihrem registrierten Namen und Passwort auf der Website an.
    And Klickt auf den Benutzernamen
    And Klickt im Menu auf Password
    And Das aktuelle Passwort wird in das Feld Aktuelles Passwort eingegeben.
  Scenario: TC01
    Given Das neue Passwort wird in das neue Passwortfeld eingegeben.
    And Im Feld Neues Passwort bestätigen wird ein neues Passwort eingegeben.
    And Klicken Sie auf die Schaltfläche Speichern
    And Bestätigt, dass das Passwort erfolgreich geändert wurde.

  Scenario: TC02
    Given Geben Sie im Feld Neues Passwort Ihr acht-stelliges Passwort ein, das nur aus Zahlen besteht.
    And Passwort Ebene bestätigt, dass es sich um die erste Ebene handelt.
    And Geben Sie Ihr acht-stelliges Passwort, bestehend aus Kleinbuchstaben und Zahlen, in das Feld Neues Passwort ein.
    And Passwort Ebene bestätigt, dass es sich um die zweite Ebene handelt.

  Scenario: TC03
    Given Geben Sie im Feld Neues Passwort Ihr acht-stelliges Passwort ein, das nur aus Zahlen besteht.
    And Passwort Ebene bestätigt, dass es sich um die erste Ebene handelt.
    And Geben Sie Ihr acht-stelliges Passwort, bestehend aus Großbuchstabe und Zahlen, in das Feld Neues Passwort ein.
    And Passwort Ebene bestätigt, dass es sich um die zweite Ebene handelt.

  Scenario: TC04
    Given Geben Sie im Feld Neues Passwort Ihr acht-stelliges Passwort ein, das nur aus Kleinbuchstabe besteht.
    And Passwort Ebene bestätigt, dass es sich um die erste Ebene handelt.
    And Geben Sie Ihr acht-stelliges Passwort, bestehend aus Kleinbuchstaben und Zahlen, in das Feld Neues Passwort ein.
    And Passwort Ebene bestätigt, dass es sich um die zweite Ebene handelt.
