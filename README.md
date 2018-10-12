# Java-Built Writer bot for Loneliness Writer

##

## Program structure:

### Classes:

-   **Writer** class
    -   **Name**, _String_
    -   **Partner**, _Writer_: This will also be of the Writer class, and how to access information about the partner.
    -   **Birthday**, _Date_: (when generating letter, if birthday is soon/recent, include a birthday message in the letter)
    -   **Family**, _Family_
    -   **Address**, _String_: Null for student, stores the mailing address as a string for writing partner.
    -   **Details**, _Map<String, String>_: Map of details. Includes hobbies, favorite \_\_\_\_s, Halloween costume plans, et cetera. Needs to be updated regularly.
    -   **UnusedDetails**, _Array<String>_: All the keys of details that haven't been used yet. To generate new text, you can take a random key from this array, get its item from the map and generate a sentence, and then remove the key.

### Data Structures:

-   Collection of Students (Array? Set?). Needs to be accessible externally for regular im/export.
-   Collection of Students (Array? Set?). Needs to be in stored externally for regular im/export.
-   Produced letter (string).

### I/O:

-   Command Line Interface
-   Input: Student’s name and the date (for birthday / holiday purposes). Also takes in saved state via ObjectInputStream.
-   Output: Saves letter (with address, partner name, student’s name, date?) to a text file. Alternatively, just returns it so the user can save via CLI.

## Info loading

In addition to the primary program that generates letters, there needs to be a way to upload information about partners.

Structuring Idea: Have various folders that have the needed data saved inside. Then just run the command and it automatically generates? And can compare the letter to past letters from the student to ensure there’s no repetition (I have a program written for this).
