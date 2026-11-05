# Enterprise UI Test Automation Framework (Selenium + Java)

## Architecture Overview
This repository features a robust, scalable **Hybrid Automation Framework** designed using the **Page Object Model (POM)** pattern to automate core business workflows of a production e-commerce platform. The architecture prioritizes loose coupling, high script reusability, and comprehensive execution analytics.

## Core Features & Technical Implementations

*   **Design Pattern:** Utilizes the Page Object Model (POM) to decouple UI element locators from structural verification assertions.
*   **Data-Driven Capabilities:** Integrated with **Apache POI** to parse configuration parameters and multi-user authentication matrices directly from external Excel sheets via TestNG `@DataProvider`.
*   **Synchronization & Reliability:** Implemented centralized explicit and fluent wait wrappers to effectively manage asynchronous web element rendering and eradicate test flakiness.
*   **Advanced Reporting:** Configured custom listeners to generate localized **ExtentReports** HTML summaries, capturing real-time execution steps and auto-attaching browser screenshots upon validation failure.
*   **Build Optimization:** Driven via Apache Maven for clean dependency injection, package lifecycle compilation, and execution routing.

## Tech Stack & Dependencies
*   **Language:** Java
*   **Web Automation:** Selenium WebDriver (v4.x)
*   **Test Engine:** TestNG (v7.x)
*   **Data Processing:** Apache POI
*   **Reporting Matrix:** ExtentReports / Allure

## How to Configure & Run the Suite

### Pre-requisites
*   Java Development Kit (JDK 17 or higher)
*   Apache Maven installed and added to the system PATH environment.

### Local Execution
1. Clone the active automation repository:
   ```bash
   git clone https://github.com
   ```
2. Navigate to the project root directory:
   ```bash
   cd selenium-java-testng-framework
   ```
3. Execute the full automation test suite configuration via Maven:
   ```bash
   mvn clean test -DsuiteXmlFile=testng.xml
   ```

## Test Suite Execution Summary
*   **Target Components Verified:** Authentication, Product Catalog Navigation, Item Checkout Funnel.
*   **Total Executed Scripts:** 15 Automated Test Methods.
*   **Integration Support:** Formatted to hook directly into Jenkins pipelines for scheduled nightly health checks.
