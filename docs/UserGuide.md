---
layout: page
title: User Guide
---

Teaching Assistant Assistant (TAA) is a **desktop app for Teaching Assistants (TA) to track student progress and tasks,
optimized for use via a Command Line Interface** (CLI) while still having the
benefits of a Graphical User Interface (GUI). If you can type fast, AB3 can get your contact management tasks done
faster than traditional GUI apps.

* Table of Contents
{:toc}

--------------------------------------------------------------------------------------------------------------------

## Quick start

1. Ensure you have Java `11` or above installed in your Computer.
[comment]: <> (TODO: Add our release here)
1. Download the latest `addressbook.jar` from [here](https://github.com/se-edu/addressbook-level3/releases).

1. Copy the file to the folder you want to use as the _home folder_ for your AddressBook.

1. Double-click the file to start the app. The GUI similar to the below should appear in a few seconds. Note how the app contains some sample data.<br>
   ![Ui](images/Ui.png)

1. Type the command in the command box and press Enter to execute it. e.g. typing **`help`** and pressing Enter will open the help window.<br>
   Some example commands you can try:

   * **`task list`** : Lists all tasks.

   * **`task add NAME`** : Adds a new task with the specified `NAME`.

   * **`task remove NAME`** : Deletes the specified task.

   * **`exit`** : Exits the app.

1. Refer to the [Features](#features) below for details of each command.

--------------------------------------------------------------------------------------------------------------------

## Features

### Add students : `student add n/studentName`
* Command `student add n/<studentName>`
* Adds a student to the list of students

### Remove students : `student remove n/studentName`
* Command `student remove n/<studentName>`
* Removes the named student from the list of students

### Rename students : `student rename n/oldStudentName n/newStudentName`
* Command `student rename n/<oldStudentName> n/<newStudentName>`
* Updates the name of the student

### List students : `student list`
* Command `student list`
* Abbreviate with `students`
* Shows a list of all students

### Add new task : `task add n/newTaskName`
* Command `task add n/<taskName>`
* Adds a task to the list of tasks
* The task is initially assigned to no students

### Remove task : `task remove n/taskName`
* Command `task remove n/<taskName>`
* Removes the named task from the list of tasks

### Rename task : `task rename n/oldTaskName n/newTaskName`
* Command `task rename n/<oldTaskName> n/<newTaskName>`
* Updates the name of the task

### Add deadline to task : `task deadline n/taskName d/deadline`
* Command `task deadline n/<taskName> d/<deadline>`
* Adds a deadline to the task

### List tasks : `task list`
* Command `task list`
* Abbreviate with `tasks`
* Shows a list of tasks

### Mark tasks : `task mark i/taskNumber`
* Command `task mark i/<taskNumber>`
* Marks the task with the task number on the list.

### Unmark tasks : `task unmark i/taskNumber`
* Command `task unmark i/<taskNumber>`
* Unmarks the task with the task number on the list.

### Assign a task to a student : `task assign n/taskName n/studentName`
* Command `task assign n/<taskName> n/<studentName>`
* Assign the task `taskName` to the student `studentName`.


### Add new group : `group add n/newGroupName`
* Command `group add n/<newGroupName>`
* Adds a new group with the name `newGroupName`

### Rename group : `group rename n/oldGroupName n/newGroupName`
* Command `group rename n/<oldGroupName> n/<newGroupName>`
* Renames the group from `oldGroupName` to `newGroupName`

### Remove group : `group remove n/groupName`
* Command `group remove n/<groupName>`
* Removes the group named `groupName`

### Enrol a student into a group : `group enrol n/groupName n/studentName`
* Command `group enrol n/<groupName> n/<studentName>`
* Enrols a student to the group

### Expel a student from a group : `group expel n/groupName n/studentName`
* Command `group expel n/<groupName> n/<studentName>`
* Removes the student `studentName` from the group `groupName`.

### View the list of students in a group : `group roster n/groupName`
* Command `group roster n/<groupName>`
* Displays a list of students enrolled in `groupName`.


_Details coming soon..._

--------------------------------------------------------------------------------------------------------------------

## FAQ

_Details coming soon..._

--------------------------------------------------------------------------------------------------------------------

## Command summary

[comment]: <> (TODO: Update this)
| Action             | Format, Examples                                                                                   |
|--------------------|----------------------------------------------------------------------------------------------------|
| **Add student**    | `student add n/STUDENT_NAME` e.g. `student add n/James Ho`                                         |
| **Remove student** | `student remove n/STUDENT_NAME` e.g. `student remove n/James Ho`                                   |
| **Rename student** | `student rename n/OLD_STUDENT_NAME n/NEW_STUDENT_NAME` e.g. `student rename n/Janes Ho n/James Ho` |
| **List students**  | `student list`                                                                                     |
| **Add task**       | `task add n/TASK_NAME` e.g. `task add n/Grade Mission 1`                                           |
| **Remove task**    | `task remove n/TASK_NAME` e.g. `task remove n/Grade Mission 1`                                     |
| **                 |                                                                                                    |
