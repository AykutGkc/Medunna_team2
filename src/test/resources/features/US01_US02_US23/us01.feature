
Feature: Kayıt için SSN, Firstname ve Lastname bilgileri girililebilmelidir
  Scenario: US01 TC01 Gecerli bir SSN ile kayit yapilabilmeli
  Given kullanıcı, "https://medunna.com/" sayfasına gider
  And kulanıcı user ikonuna tikla
  And kullanıcı Register'i tıklar.
  And kullanıcı SSN input'a "012-09-8765" girer
  And kullanıcı First Name inputa "Fetih" girer
  And kullanıcı Last Name inputa "Zinar" girer
  And kullancı Usurname inputa "fethizinar1" girer
  And kullanıcı Email inputa "fethi1@gmail.com" girer
  And kullanıcı New Password inputa "fethi1234" girer
  And kullanıcı Confirm the new password inputa "fethi1234" girer
  And kullanıcı Register buttona tıklar
  Then Kayıdın kabul edildiği onaylanır.


  Scenario: US01 TC02 SSN input boş bırakılamaz
    Given kullanıcı_iki, "https://medunna.com/" sayfasına gider
    And kulanıcı_iki user ikonuna tikla
    And kullanıcı_iki Register'i tıklar.
    And kullanıcı SSN inputa tıklar ve bir şey yazmaz
    And Kullanıcı Firstname inpua tıklar
    Then SSN inputu altında "Your SSN is required" görüldüğünü onaylar.



  Scenario: US01 TC03 SSN numarası 3. ve 5 rakamdan sonra tire kullanmak zorundadır
    Given kullanıcı_uc, "https://medunna.com/" sayfasına gider
    And kulanıcı_uc user ikonuna tikla
    And kullanıcı_uc Register'i tıklar.
    And kullanıcı SSN inputa tıklayarak "987654321" rakamlarını girer
    And Kullanıcı_uc sonraki input Firstname'ye tiklar tıklar
    Then SSN inputu altında "Your SSN is required" görüldüğünü onaylar.

  Scenario: US01 TC04 SSN numarası minumum 9 rakamdan oluşmalıdır
    Given kullanıcı_dört, "https://medunna.com/" sayfasına gider
    And kulanıcı_dört user ikonuna tikla
    And kullanıcı_dört Register'i tıklar.
    And kullanıcı_dört SSN inputa tıklayarak "123-45" 5 rakam girer
    And Kullanıcı_dört sonraki input Firstname'ye tiklar tıklar
    Then Kullanıcı_dört SSN inputu altında "Your SSN is required" görüldüğünü onaylar.


  Scenario: US01 TC05 SSN numarası maximum 9 rakamdan oluşmalıdır
    Given kullanıcı_bes, "https://medunna.com/" sayfasına gider
    And kulanıc_bes user ikonuna tikla
    And kullanıc_bes Register'i tıklar.
    And kullanıcı_bes SSN inputa tıklayarak "123-45-12345" 10 rakam girer
    And Kullanıcı_bes sonraki input Firstname'ye tiklar tıklar
    Then Kullanıcı_bes SSN inputu altında "Your SSN is required" görüldüğünü onaylar.



  Scenario: US01 TC06 doldurulması zorunlu inputlar boş bırakılamaz
    Given kullanıcı_alti, "https://medunna.com/" sayfasına gider
    And kulanıcı_alti user ikonuna tikla
    And kullanıcı_alti Register'i tıklar.
    And First Name inputu boş bırakır.
    And Last Name inputu boş bırakır.
    And Usurname inputu boş bırakır.
    And Email inputu boş bırakır.
    And kullanıcı password inputu tiklar.
    And Your FirstName is required mesajını görüldüğünü onaylar
    And Your LastName is required mesajını görüldüğünü onaylar
    And Your UsurName is required mesajını görüldüğünü onaylar
    Then Your email is required mesajını görüldüğünü onaylar


  Scenario: US01 TC07 Adı ve Soyadı sadece rakam kabul etmemeli
    Given kullanıcı_yedi, "https://medunna.com/" sayfasına gider
    And kulanıcı_yedi user ikonuna tikla
    And kullanıcı_yedi Register'i tıklar.
    And First Name inputu tıklar ve "1234". rakamlarını.
    And Last Name inputu tıklar ve "567" rakamlarını girer.
    And kullanıcı_yedi Usurname inputu boş bırakır.
    And Kullanıcı_yedi Your FirstName is required mesajını görüldüğünü onaylar
    Then Kullanıcı_yedi Your LastName is required mesajını görüldüğünü onaylar
