# Manpro — INEW 2338 Reference Build

The **instructor sample** for INEW 2338: **Manpro**, an auto repair shop that specializes in maintenance.
It's built **step by step** alongside the lessons, with a git **tag per module** (`module-1-complete`,
`module-2-complete`, …) so students can compare their own code at each stage. See `business-profile.md`
for the business + branding.

## How to run it

You need **Java 17**. You do **not** need to install Maven — this project includes the Maven Wrapper
(`mvnw`), so it carries its own copy.

```powershell
# from inside this folder
./mvnw spring-boot:run
```

Then open **http://localhost:8080** in your browser — you'll see the welcome page.
Stop the server with **Ctrl+C**.

> Prefer buttons? Click **▶ Run** above `main` in `AutoShopApplication.java`, or use the Spring Boot
> Dashboard.

## Where the code lives

- `pom.xml` — Maven + Spring Boot settings (Java version, dependencies).
- `mvnw` / `mvnw.cmd` — the Maven Wrapper (so you don't install Maven).
- `src/main/java/edu/tstc/autoshop/AutoShopApplication.java` — starts the web app.
- `src/main/resources/application.properties` — app settings (e.g., the port).
- `src/main/resources/static/` — the front-end (what you see in the browser).
  - `index.html` — the welcome page.

## Progress

- **Module 1 — done:** the project runs as a web app; a welcome page shows in the browser. 🎉
- Next: Module 2 adds the data (customers, vehicles, repair orders) and shows them on the page.
