# Buying Ticket - EnUygun Test Otomasyon Projesi

Task
---
- https://www.enuygun.com. sitesi açılır.
- Uçağa hangi noktadan bineceği seçilir.
- Nereye gideceği seçilir.
- Kalkış tarihi seçilir.
- Ucuz bilet bul butonuna basılır.
- İlk bilet seçilir.
- Email adresi girilir.
- Telefon girilir.
- İsim girilir.
- Soyadı girilir.
- Doğum tarihi Girilir.
- Tc kimlik numarası girlir.
- Ödeme butonuna basılır.
- Ardından bu sayfasının doğru görüntülendiği kontol edilir.


## 👨🏿‍💻 Senaryo

```cucumber
Feature:

  Scenario Outline: Book one way flight ticket for given date
    Given  Go to url Flight Ticket Selection Page
    And Choose from which point to board the plane
    And Choose where to go
    And Select departure date
    And Click on find cheap tickets
    And Select first ticket
    And Enter "<email>" address
    And Enter "<telephone>" number
    And Enter "<Name>"
    And Enter last "<Surname>"
    And Enter birthday date
    And Enter TC Identification "<number>"
    When Click on go to payment button
    Then Verify payment page is opened correctly

    Examples:
     | email                | telephone      | Name        | Surname       | number            |
     |testenuygun@gmail.com | 5349249857     | Burak       | ERDEMİROĞLU   | 55747763206       |
```

