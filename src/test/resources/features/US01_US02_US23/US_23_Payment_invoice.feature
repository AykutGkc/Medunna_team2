
Feature: Fatura oluşturma ve ödeme
  Scenario: US23 TC01 Staff fatura oluşturabilmelidir.
    Given Staff_bir, "https://medunna.com/" sayfasına gider
    And Staff_bir user ikonuna tikla
    And Staff_bir sign in buttonunu tıklar.
    And Staff_bir username inputa "staff_fethi" yazar
    And Staff_bir password inputa "fethi2121" şifrenisini yazar
    And Staff_bir sign in buttonuna tıklayarak login yapar.
    And Staff_bir My Pages buttonuna tıklayar
    And Staff_bir Search Patient ikonuna tıklar
    And Staff_bir açılan sayfada Patient SSN inputu tıklayarak "222-01-0003" ssn numarısını girer.
    And Staff_bir Show Appointments buttonunu tıklar
    And Staff_bir Paymant_invoicprocess buttonuna tıklar
    And Staff_bir Create Invoice buttonuna tıklar
    And Staf_bir acılan sayfaya Save buttonunu tıklayarak fatura oluşturur.
    Then Staff_bir faturanın oluştuğunu teyit eder

  Scenario: US23 TC02 Staff fatura günceleyebilmeli.
    Given Staff, "https://medunna.com/" sayfasına gider
    And Staff user ikonuna tikla
    And Staff sign in buttonunu tıklar.
    And Staff username inputa "staff_fethi" yazar
    And Staff password inputa "fethi2121" şifrenisini yazar
    And Staff sign in buttonuna tıklayarak login yapar.
    And Staff My Pages buttonuna tıklayar
    And Staff Search Patient ikonuna tıklar
    And Staff açılan sayfada Patient SSN inputu tıklayarak "222-01-0003" ssn numarısını girer.
    And Staff Show Appointments buttonunu tıklar
    And Staff Paymant_invoicprocess buttonuna tıklar
    And Staff Exam Fee yazısının görüldüğünü teyit eder
    And Staff Show Invoice buttonuna tıklar
    Then Staff fatura oluşturma formunun acıldığını onaylar.


  Scenario: US23 TC03 Staff oluşturulan faturayı görüntüleyebilmeli
    Given Staff_iki, "https://medunna.com/" sayfasına gider
    And Staff_iki user ikonuna tikla
    And Staff_iki sign in buttonunu tıklar.
    And Staff_iki username inputa "staff_fethi" yazar
    And Staff_iki password inputa "fethi2121" şifrenisini yazar
    And Staff_iki sign in buttonuna tıklayarak login yapar.
    And Staff_iki My Pages buttonuna tıklayar
    And Staff_iki Search Patient ikonuna tıklar
    And Staff_iki açılan sayfada Patient SSN inputu tıklayarak "222-01-0003" ssn numarısını girer.
    And Staff_iki Show Appointmants buttonunu tıklar tıklar
    And Staff_iki Payment Invoice Process buttonunu tıklar tıklar
    And Staff_iki detaylı faturayı görüntüler
  #  Then Staff_iki sayfayı kapatır

