Feature: Admin Room olusturabilmeli
  Scenario: Admin hesabi ile Room olusturma
  Given Kullanici medunna anasayfasina gider
  Then Sag ustteki user ikonuna tikla
  And Sign in butonuna tikla
  And Kayitli Admin hesabina ait Username "adminUsername" gir
  And Kayitli Admin hesabina ait Password "adminPassword" gir
  And Sign in (Submit) butonuna tikla
  And Items&Titles sekmesine tikla
  And Room secenegine tikla
  And Create a new Room butonuna tikla
  And Room number kutusuna "roomNumber" gir
  And Price kutusuna "roomPrice" gir
  And Description kutusuna "roomDescription" gir
  And Room save butonuna tikla
  And Room create islemini dogrula
