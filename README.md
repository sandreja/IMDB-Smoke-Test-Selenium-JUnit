Prvi Smoke Test / First Smoke Test

EN

My first real automated testing project. A smoke test suite for the IMDB website built with Selenium WebDriver, JUnit, and the Page Object Model (POM) design pattern. The tests cover core functionality including sign in options, search, and the Top 250 movies page.

What was tested:

Search functionality - searching for a movie and verifying the first result

Sign in options - verifying all available sign in methods (IMDb, Amazon, Google, Apple)

IMDb sign in flow - full sign in with email and password, verifying successful login

Top 250 page - verifying all 250 movies load, checking titles, years, and ratings

Tech stack:

Java

Selenium WebDriver (Firefox)

JUnit 4

WebDriverManager

Page Object Model (POM) pattern

Maven

Project structure:

browser/ - Firefox WebDriver setup and singleton instance

pages/ - Page Object classes for each IMDB page

SmokeTest.java - Test cases

BaseTest.java - Shared test setup and teardown

SR

Moj prvi pravi projekat automatizovanog testiranja. Suite smoke testova za IMDB sajt izgrađen pomoću Selenium WebDriver-a, JUnit-a i Page Object Model (POM) dizajn paterna. Testovi pokrivaju osnovne funkcionalnosti uključujući prijavu, pretragu i stranicu Top 250 filmova.

Šta je testirano:

Funkcionalnost pretrage - pretraga filma i provera prvog rezultata

Opcije prijave - provera svih dostupnih metoda prijave (IMDb, Amazon, Google, Apple)

IMDb tok prijave - potpuna prijava sa emailom i lozinkom, provera uspešne prijave

Top 250 stranica - provera učitavanja svih 250 filmova, provera naslova, godina i ocena

Tehnologije:

Java

Selenium WebDriver (Firefox)

JUnit 4

WebDriverManager

Page Object Model (POM) patern

Maven

Struktura projekta:

browser/ - Podešavanje Firefox WebDriver-a i singleton instanca

pages/ - Page Object klase za svaku IMDB stranicu

SmokeTest.java - Test slučajevi

BaseTest.java - Zajednički setup i teardown za testove
