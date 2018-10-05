# Java-Built Writer bot for Loneliness Writer
## Module handling program structure:
### Classes:
* “Student” class
    - Prop: Name (class: string)
    - Prop: Partner. This refers to a data struct with information about the elderly writing partner. Includes name and address. This could be of the Student class, or if it needs significantly different information bits than students, than it can be a new class.
    - Prop: birthday (class: Date) (when generating letter, if birthday is soon/recent, include a birthday message in the letter)
    - Prop(s?): Family members (class: Family)
    - Prop(s): Details (either as a map of interests or just a bunch of properties on the Student class, depending on how many interests we’re talking. The touchpoint here is they need to be accessed abstractly with a reference to what it is -- so probably a map. Includes hobbies, favorite ____s, Halloween costume plans, et cetera.)
* “Family” class
    - Prop: Mother (class: string -- name or null)
    - Prop: Father (class: string -- name or null)
    - Prop: Older sibling (class: string -- name or null)	
    - Prop: Younger sibling (class: string -- name or null)
### Data Structures:
* Collection of Students (Array? Set?). Needs to be in JSON on im/export.
* Produced letter (string).
### I/O:
* Command Line Interface
* Input: Student’s name and the date (for birthday / holiday purposes). Also takes in saved state via ObjectInputStream.
* Output: Saves letter (with address, partner name, student’s name, date?) to a text file. Alternatively, just returns it so the user can save via CLI. Saves the


Structuring Idea: Have various folders that have the needed data saved inside. Then just run the command and it automatically generates? And can compare the letter to past letters from the student to ensure there’s no repetition (I have a program written for this).
