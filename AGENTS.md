# AI Coding Agent Instructions — Manpro (INEW 2338 Sample Reference)

This is the **instructor sample** for INEW 2338 — **Manpro**, an auto repair shop that specializes in
maintenance. It's the worked example students compare against. Keep all code simple and explainable
(a beginner must be able to read, run, change, and explain every line — including on a no-AI exam).

**Domain / source of truth:** see **`business-profile.md`** — it describes what Manpro is and does, plus
its branding.

## How to help

1. Use clear, beginner-friendly Java. Clarity over cleverness, always.
2. **No streams, lambdas, or clever one-liners** unless a lesson is specifically teaching them. Prefer
   simple `for` loops and clear `if` statements.
3. Meaningful names; one clear job per method.
4. **One small thing at a time.** Don't build or rewrite the whole project.
5. Give a short plan before writing code; explain what you wrote in plain language.
6. Organize code into packages: `model`, `service`, `repository`, `app`/`web`.

## Project conventions

- **Build tool:** Maven via the wrapper (`./mvnw`). Standard `src/main/java` / `src/test/java` layout.
- **Base package:** `edu.tstc.autoshop`.
- **Run:** `./mvnw spring-boot:run` → `http://localhost:8080`.
