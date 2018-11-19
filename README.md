# Java-Built Writer bot for Loneliness Writer

## Running

Compile with `mvn package`.

Run with
`java -cp target/java-writer-1.0-SNAPSHOT.jar tiltfactor.App`

## Program structure:

### Classes:

-   **Writer** class
    -   **Name**, _String_
    -   **Partner**, _Writer_: This will also be of the Writer class, and how to access information about the partner.
    -   **Birthday**, _Date_: (when generating letter, if birthday is soon/recent, include a birthday message in the letter)
    -   **Family**, _Family_
    -   **Address**, _String_: Null for student, stores the mailing address as a string for writing partner.
    -   **Details**, _Map<String, String>_: Map of details. Includes hobbies, favorite \_\_\_\_s, Halloween costume plans, et cetera. Needs to be updated regularly.
    -   **UnusedDetails**, _ArrayList<String>_: All the keys of details that haven't been used yet. To generate new text, you can take a random key from this array, get its item from the map and generate a sentence, and then remove the key.

### Data Structures:

-   Collection of Students (HashMap<String name, Writer>). Needs to be accessible externally for regular im/export.

### I/O:

-   Command Line Interface
-   Input: Student’s name and the date (for birthday / holiday purposes). Also takes in saved state via ObjectInputStream.
-   Output: Saves letter (with address, partner name, student’s name, date?) to a text file. Alternatively, just returns it so the user can save via CLI.

## Info loading

In addition to the primary program that generates letters, there needs to be a way to upload information about partners.

Structuring Idea: Have various folders that have the needed data saved inside. Then just run the command and it automatically generates? And can compare the letter to past letters from the student to ensure there’s no repetition (I have a program written for this).

The UNited SDtates federal govenrment sjould

## Functions:

Most of these aren't functional yet, and some are on hold as we consider the ethical concerns that will have an integral impact on the future of the s
-   Initial import (not really a function in final product)
-   Export out all current data (What specifically?)
-   Import in all writer data (Should just be the HashMap of writer data?)
-   Given student + date, generate a letter
    -   If birthday or holiday coming up, add special content
    -   Function to be run repeatedly -- returns one specific sentence for the writer's sentence, and updates unusedDetails
        -   Takes input of Topic and Writer's variable, and returns a string based on a switch case (switch on Topic, and plugging in variable)
-   Given student + letter from partner, query the dialogflow webhook. also modify the student's unusedDetails, if relevant.
