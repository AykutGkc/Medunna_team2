

Feature: Kayıt için email ve username bilgileri girililebilmelidir
  Scenario: US02 TC01 Gecerli bir username olmalı, boşluk olmamalı
    Given kullanıcı_iki_bir, "https://medunna.com/" sayfasına gider
    And kulanıcı_iki_bir user ikonuna tikla
    And kullanıcı_iki_bir Register'i tıklar.
    And kullanıcı_iki_bir SSN input'a "011-08-5678" girer
    And kullanıcı_iki_bir First Name inputa "Kaya" girer
    And kullanıcı_iki_bir Last Name inputa "Zinar" girer
    And kullancı_iki_bir Usurname inputa "fethizinar2" girer
    And kullanıcı_iki_bir Email inputa "fethi2@gmail.com" girer
    And kullanıcı_iki_bir New Password inputa "fethi4321" girer
    And kullanıcı_iki_bir Confirm the new password inputa "fethi1234" girer
    And kullanıcı_iki_bir Register buttona tıklar
    Then kullanıcı_iki_bir Kayıdın kabul edildiği onaylanır.


  Scenario: US02 TC02 Username input boş bırakılamaz
    Given kullanıcı_iki_iki, "https://medunna.com/" sayfasına gider
    And kulanıcı_iki_iki user ikonuna tikla
    And kullanıcı_iki_iki Register'i tıklar.
    And kullanıcı_iki_iki Username inputa tıklar ve bir şey yazmaz
    And Kullanıcı_iki_iki Email inpua tıklar
    Then Kullanıcı_iki_iki Username inputu altında Your username is required görüldüğünü onaylar.


  Scenario: US02 TC03 Email adresinde @ ve . işareti girmelidir
    Given kullanıcı_iki_uc, "https://medunna.com/" sayfasına gider
    And kulanıcı_iki_uc user ikonuna tikla
    And kullanıcı_iki_uc Register'i tıklar.
    And Kullanıcı_iki_uc Email inpua tıklar ve "fkaya@gmail.com" adresini girer
    And kullanıcı_iki_uc Username inputa tıklar ve bir şey yazmaz
    Then Kullanıcı_iki_uc Email inputu altında Your email is required uyarısın görmez.

  Scenario: US02 TC04 Email adresinde @ ve . işareti olmadan kayıt yapılamaz
    Given kullanıcı_iki_dört, "https://medunna.com/" sayfasına gider
    And kulanıcı_iki_dört user ikonuna tikla
    And kullanıcı_iki_dört Register'i tıklar.
    And Kullanıcı_iki_dört Email inpua tıklar ve "fkayagmailcom" adresini girer
    And kullanıcı_iki_dört Username inputa tıklar ve bir şey yazmaz
    Then Kullanıcı_iki_dört Email inputu altında Your email is required uyarısın görüldüğünü onaylar

  Scenario: US02 TC05 Username input boş bırakılamaz
    Given kullanıcı_iki_beş, "https://medunna.com/" sayfasına gider
    And kulanıcı_iki_beş user ikonuna tikla
    And kullanıcı_iki_beş Register'i tıklar.
    And kullanıcı_iki_beş Email inputa tıklar ve bir şey yazmaz
    And Kullanıcı_iki_beş User name inpua tıklar
    Then Kullanıcı_iki_beş Email inputu altında Your email is required görüldüğünü onaylar.