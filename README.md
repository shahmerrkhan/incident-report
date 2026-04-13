# incident-report
# St. Benedict Sport Incident Report System

A Java command-line tool that collects details about a sports incident and generates a formatted written report paragraph automatically.

## What It Does

- Collects incident details through a guided input process:
  - Name of person submitting the report
  - Sport and date of the incident
  - Opposition school name
  - Location
  - Which school the injured student was from
  - Student's gender
  - Description of the incident
  - Whether 911 was called
  - Whether the student was taken to hospital
- Generates a complete, properly formatted incident report paragraph
- Wraps text automatically at 40 characters per line for clean output

## How to Run

```bash
javac IncidentReport.java
java IncidentReport
```

## Example Output

```
--- Incident Report Summary ---
This is St. Benedict Sport Incident
Report pratains to a boys basketball
game that happened on March 5, 2026
verses St. Mary's. The game was played
at St. Benedict Gymnasium. The student
injured was a St. Benedict student.
Player slipped and fell near the net.
911 was called immediately after the
incident. The student was taken to the
hospital. Report submitted by Coach Khan.
```

## Why I Built It

Built as a Grade 11 Java project to practice string formatting, input validation, conditional logic, and generating structured text output from user input. Based on a real-world use case at St. Benedict Catholic Secondary School.

## Built With

Java
