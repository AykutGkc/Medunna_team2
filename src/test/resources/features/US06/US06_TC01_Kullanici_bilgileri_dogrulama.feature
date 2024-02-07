Feature: Register islemleri
  Scenario: US06 TC01 Kullanici bilgileri dogrulama
    Given Kullanici medunna anasayfasina gider
    Then Sag ustteki user ikonuna tikla
    Then Register butonuna tikla
    And Gecerli SSN numarasi "ssnUser" gir
    And Gecerli Firstname "firstNameUser" gir
    And Gecerli Lastname "lastNameUser" gir
    And Gecerli Username "userNameUser" gir
    And Gecerli Email "emailUser" gir
    And Gecerli New Password "firstPasswordUser" gir
    And New Password confirmation "secondPasswordUser" gir
    And Register(Submit) butonuna tikla
    And Register islemini dogrula
    And Sag ustteki user ikonuna tikla
    And Sign in butonuna tikla
    And Kayitli Admin hesabina ait Username "adminUsername" gir
    And Kayitli Admin hesabina ait Password "adminPassword" gir
    And Sign in (Submit) butonuna tikla
    And Administration butonuna tikla
    And User Management butonuna tikla
    And Users tablosunda son sayfaya tikla
    And Yeni olusturulan kullaniciya ait Edit butonuna tikla
    And Profiles bölümünden kullaniciya USER rolü ver
    And Yeni olusturulan kullaniciyi Activated yap
    And User Save butonuna tikla
    And Sag ustteki user ikonuna tikla
    And Sign out'a tikla
    And Sag ustteki user ikonuna tikla
    And Sign in butonuna tikla
    And Yeni User hesabina ait Username gir
    And Yeni User hesabina ait Password gir
    And Sign in (Submit) butonuna tikla
    And Sag ustteki user ikonuna tikla
    And Settings butonuna tikla
    And First Name'in "firstNameUser" oldugunu dogrula
    And Last Name'in "lastNameUser" oldugunu dogrula
    And Email'in "emailUser" oldugunu dogrula


    Scenario: Delete Metin Erdem
      Given Kullanici medunna anasayfasina gider
      Then Sag ustteki user ikonuna tikla
      And Sign in butonuna tikla
      And Kayitli Admin hesabina ait Username "adminUsername" gir
      And Kayitli Admin hesabina ait Password "adminPassword" gir
      And Sign in (Submit) butonuna tikla
      And Administration butonuna tikla
      And User Management butonuna tikla
      And Users tablosunda son sayfaya tikla
      And Yeni olusturulan kullaniciyi sil


