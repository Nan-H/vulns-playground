# autofix-playground

Check original repo: vulnerable-code

This repository contains [autofix for CodeQL code scanning](https://docs.github.com/en/enterprise-cloud@latest/code-security/code-scanning/managing-code-scanning-alerts/about-autofix-for-codeql-code-scanning) examples for different languages.



### Alerts

- Java
  - [Jetty](https://jetty.org/index.html) web server with `Log Injection`.
- C++
  - Console application with buffer overflow (`Unbounded write`).
- Go
  - Built-in (`net/http`) web server with `Log entries created from user input`.
- C#
  - [ASP.NET Core](https://dotnet.microsoft.com/en-us/apps/aspnet) web server with `Log entries created from user input`.
- Ruby
  - [Sinatra](https://sinatrarb.com/) web server with `Use of Kernel.open or IO.read or similar sinks with a non-constant value`.
- Python
  - [Flask](https://flask.palletsprojects.com/) web server with `Information exposure through an exception`.
- JavaScript
  - [Express](https://expressjs.com/) web server with `Reflected cross-site scripting`.
