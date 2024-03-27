# Spring Boot - Final Project

## Development Instructions

### Database initialization
The following commands will create a mysql docker container on your system. To use this, you must have docker installed on your system.

Create the container (run from the root of this repo):
```shell
docker-compose -f "./docker/docker-compose.yml" -p "todo-application-mysql" up -d
```

This will create and launch a docker container using the mysql image and run it on `localhost:3606`. This will also initialize the database tables for it.

To remove the container run the following commands (if these commands do not work, ensure that the name of the created container is todo-application-mysql (`-db-1` is appended to the end)):
```shell
docker stop todo-application-mysql-db-1
```

```shell
docker rm -v todo-application-mysql-db-1
```

## Introduction: 
Life gets hectic, and we get it. Balancing your personal tasks, collaborating with others, and keeping up with shared responsibilities can be a juggling act. That's why we've created a task management and collaboration app that's designed to simplify your daily life. Whether you're a student sharing a space with roommates, part of a team managing projects, or just looking for a way to stay organized, our app has got you covered.


Tackling Everyday Challenges: We know the struggle of coordinating with others, especially when it comes to shared living. Sticky notes and group chats only go so far, leading to misunderstandings and missed chores. Our app steps in to make life easier, providing a central hub for creating shared to-do lists, assigning tasks, and managing chores together. It's all about making sure everyone chips in and feels a sense of accomplishment.
Adaptable for You and Your Crew: Beyond just managing chores, our app is perfect for personal use too. Whether you're crafting your schedule, jotting down thoughts in a journal, or simply creating your to-do list, our app is like your trusty sidekick, adapting to your unique needs.


Integrating Seamlessly into Your Routine: No need for a complicated setup. Our app effortlessly syncs with your calendar, allowing you to see your tasks, events, and deadlines all in one place. It's your personalized command center, giving you a snapshot of your daily, weekly, and monthly commitments.

## Storyboard
<img width="401" alt="Screenshot 2024-02-11 at 6 52 31 PM" src="https://github.com/nhing17899/IT4045C-FinalProject/assets/97551417/05d054e0-bf4a-43ee-8b46-a3fd85d29e05">
<img width="401" alt="Screenshot 2024-02-11 at 6 52 40 PM" src="https://github.com/nhing17899/IT4045C-FinalProject/assets/97551417/2227f672-8378-41ca-867d-1e6ece96b909">
<img width="401" alt="Screenshot 2024-02-11 at 6 52 44 PM" src="https://github.com/nhing17899/IT4045C-FinalProject/assets/97551417/c9b0f9c1-b1a7-47f6-b794-2eedc1f71c85">
<img width="401" alt="Screenshot 2024-02-11 at 6 52 58 PM" src="https://github.com/nhing17899/IT4045C-FinalProject/assets/97551417/883fca1a-805b-4d42-a029-9e2b1d19fc97">
<img width="401" alt="Screenshot 2024-02-11 at 6 53 11 PM" src="https://github.com/nhing17899/IT4045C-FinalProject/assets/97551417/d6cddc73-aaa1-4be9-a7c1-8d7b9347f278">


## Requirements
### Scenario 1

**As a** student,  
**I want** to be able to track homework with the todo list,  
**So that** I can remember what tasks I need to get done.

#### Examples

##### 1.1
> **Given** I have created a list,  
  **When** I click the add task button,  
  **Then** a form appears where the I can put in task information

##### 1.2
> **Given** the task entry form is visible,  
  **When** I add information about my task and submit,  
  **Then** the task shows up in my current list
  
### Scenario 2

**As a** member of a household with chores,  
**I want** to be able to keep track of shared tasks in the house,  
**So that** I make sure tasks get completed.

#### Examples

##### 2.1
> **Given** members of a household are all in a shared list,  
  **When** a member of the group adds a task with a due date,  
  **Then** members of the group can find the new task as well as its due date

##### 2.2
> **Given** members of a household are all in a shared list,  
  **When** a member of the group checks off an item as completed,  
  **Then** the item when viewed by other members is shown as completed


## Class Diagram Description
In the below diagram, the main data structures are defined in the com.todoList.dao layer. Connecting to this is the com.todoList.service layer. This layer performs actions on the data objects and prepares data for the front-end. The layer above this is the com.todoList.api layer. This layer contains the controllers to define HTTP requests that can be sent to the server. Finally is the com.todoList.ui layer. This layer provides the pages that are displayed on the front-end.

![Class Diagram](/documentation/TodoListClassDiagram.drawio.png)

## JSON Schema
This is the inital baseline JSON Schema we plan to export to another app.
```json
{
  "type": "object",
  "properties": {
    "id": {"type": "integer"},
    "name": {"type": "string"},
    "dueDate": {"type": "string", "format": "date-time"},
    "completed": {"type": "boolean"},
    "listId": {"type": "integer"},
    "listOrder": {"type": "integer"}
  }
}
```

## Team Members and Roles

**Software Architect**: Sasidhar Chilaka

**Backend Developer**: Logan Arnett

**Database Administrator**: Arian Kharazmi Tousi

**Scrum Master**: Nhi Nguyen

## Milestones

[Milestone 1](https://github.com/nhing17899/IT4045C-FinalProject/milestone/1)

[Milestone 2](https://github.com/nhing17899/IT4045C-FinalProject/milestone/2)

[Milestone 3](https://github.com/nhing17899/IT4045C-FinalProject/milestone/3)

[Milestone 4](https://github.com/nhing17899/IT4045C-FinalProject/milestone/4)

## Weekly stand-up meeting link:

**Schedule**: 7PM EST on Sunday [on Teams](https://teams.microsoft.com/l/meetup-join/19%3ameeting_NjIyODdjOWMtOTg1Mi00ZjhkLWIzOWUtMTM4YjkxMWNmNDdh%40thread.v2/0?context=%7b%22Tid%22%3a%22f5222e6c-5fc6-48eb-8f03-73db18203b63%22%2c%22Oid%22%3a%22aef95117-da96-4c4b-a6b0-281ce2188427%22%7d)
