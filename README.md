# Java-Built Writer bot for Loneliness Writer

##

## Program structure:

### Classes:

-   **Writer** class
    -   **Name** (class: string)
    -   **Partner** This will also be of the Writer class, and how to access information about the partner.
    -   **Birthday** (class: Date) (when generating letter, if birthday is soon/recent, include a birthday message in the letter)
    -   **Family** (class: Family)
    -   Props: **Details** (Map of details. Includes hobbies, favorite \_\_\_\_s, Halloween costume plans, et cetera. Needs to be updated regularly.)
    -   Prop: **Address.** Null for student, stores the mailing address as a string for writing partner.
-   **Family** class
    -   Prop: Mother (class: string -- name or null)
    -   Prop: Father (class: string -- name or null)
    -   Prop: Older sibling (class: string -- name or null)
    -   Prop: Younger sibling (class: string -- name or null)

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
