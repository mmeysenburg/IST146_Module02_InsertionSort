# IST146_Module01_PA

Now that you have gotten your hands on some Java coding with the first Hands-On Activity (HOA 1), it is time to 
put your skills to the test in your first Programming Assignment (PA 1). In this PA, you will write several parts
of a partially-completed Java class that encapsulates one week's worth of daily high temperatures. You should find
that the code you are asked to write is very similar to the code in HOA 1, so please refer to that code as you work.

## Instructions

1. Log on to your replit account. 
2. Click the "+ New repl" button to create a new repl. 
3. Click on the "Import from GitHub" tab. 
4. Type or paste the following URL into the "Paste any repository URL" text field: github.com/mmeysenburg/IST146_Module02_InsertionSort.git
5. Click on the "Import from github" button.
6. Select "Java" as the replit type, then click the "Done" button in the ".replit" dialog that appears. 
7. From the "Console" tab, enter the following command: `rm .replit`   *If you omit this step, 
the "Run" button will not work as it should!*
8. Select the "DailyTemps.java" file. Search for the keyword "TODO", and write the specified code.
9. At any time you can run the code from the user's perspective, or, from a developer's point of view, execute the unit tests that have been provided.
    * To run the code, click the "Run" button.
    * To execute the unit tests, enter the following command in the "Console" tab: bash test.sh
10. Once you have completed the code correctly, all 6 unit tests should pass, and running the code should produce results that make sense.
11. When you are finished, submit your DailyTemps.java file via the PA 1 Canvas assignment.


## Files in the repository

* `DailyTemps.java`: Class encapsulating seven daily high temperatures. Only make changes to this file.
* `DailyTempsTest.java`: JUnit4 unit tests for the `DailyTemps` class. These tests are executed when you enter the `bash test.sh` command.
* `LICENSE`: GNU General Public License v3.0 for these materials.
* `Main.java`: Main program to run the code from a user's perspective. This file's `main()` method is invoked when you click the "Run" button.
* `README.md`: This README file.
* `test.sh`: Bash script to execute the JUnit4 unit tests in `DailyTempsTest.java`.