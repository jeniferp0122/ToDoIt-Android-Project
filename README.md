# To Do It

## Table of Contents

1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)
3. [Progress](#Progress)

## Overview

### Description

Cloud Based To-Do List where users can access their List from anywhere at any time. Our list will be able to be shared amongst collaborators so a team of people can work on the same list. The app will be able to produce personalized list to fit daily needs and change the status of each individual list item at any given point with real time update to all other collaborators on that list.

### App Evaluation

[Evaluation of your app across the following attributes]

- **Category:**
  - Life Management
- **Mobile:**
  - Yes

- **Story:**
  - It's difficult to keep track of everything that needs to get done in a day. With the majority of people having busy schedules, I can see why it would be easy to forget something at the supermarket or maybe that surprise report your manager told you to have done by the end of the week. This app is suited so that you can keep track of the things that need to get done with out the stress of remembering.

- **Market:**
  - This application suites everyone, from a hard working student to a busy buisness executive that needs to catch up on meetings. An all in one application to help keep track of your schedule. Everyone has things to do, hence this app is for everyone.

- **Habit:**
- **Scope:**

## Product Spec

### 1. User Stories (Required and Optional)

#### **Required Must-have Stories**

- [x]User Log In
- User Sign Up
- User Logout
- Keeps the user Loged In Until user logouts
- To-Do List
  - Edit To-Do List (Collaborator, Name, Description)
  - Create To-Do List
  - Delete To-Do List
- To-Do List Item
  - Create a To-Do List Item
  - Edit a To-Do List Item
  - Delete a To-Do List Item
  - Change status of To-Do List Item (Complete , In Progress, Pending, Past Due )
- Have Colaborative To-Do List where you can have multiple users be part of the same List
- Set Date for To-Do List Item
- Alert User Regarding Past Due Items on a List

#### **Optional Nice-to-have Stories**

- Set Notifications for Item that has time constraint associated with it
- Create user permission page where the Admin can configure each collaborator permissions to View, Edit, or Delete
- Set Priority Level of each To-Do List Item
- App comes with templates for different types of To-Do List
- Create Widget from app to Phone Home Screen to preview a List
- Associate Colors to a To-Do List Item Status ( Maybe Labels )
- Notify Collaborators on the List when an update is made on the List

### 2. Screen Archetypes

- Log In Screen
  - Sign Up Screen
  - Possible Resset Password Screen
- Profile Overlay with Profile Settings & Logout Option
- Home Screen with all List
- List View
  - View to cretae List
  - View to create item
  - Modal to edit item
  - View to edit list properties ( Change Name , Description , Theme )

### 3. Navigation

#### **Tab Navigation**

- Log In Screen
- Home List View
- List View
- Compose Item View
- Change Status View

#### **Flow Navigation**

- [list first screen here]
  - [list screen navigation here]
  - ...
- [list second screen here]
  - [list screen navigation here]
  - ...

## Wireframes

<img src="https://i.imgur.com/Z0f9dPb.jpg" width=600>

### [BONUS] Digital Wireframes & Mockups
<img src="https://i.imgur.com/NFxFxru.png" width=600>
https://www.figma.com/file/nsZzenoqzY7TGiLrCMoPP6/To-Do-It-App?node-id=0%3A1

### [BONUS] Interactive Prototype

## Schema

[This section will be completed in Unit 9]

### Models

![image](https://user-images.githubusercontent.com/89871568/160507852-f5753c8e-b69b-45b5-a76a-79f526331c7b.png)


### Networking

-	**Home Feed Screen**

  -(Read/GET) Query all Lists where user has access
  
  -(Create/POST) Create a new list
  
  -(Delete) Delete existing list
  
  -(Read/GET) Get selected list.

- **List Screen**

  -(Create/POST) Create a new list object
  
  -(Delete) Delete existing list object
  
  -(Update) Update existing list object (BOOLEAN)
  
  -(Read/GET) Get list of people able to view or edit the list
  
-	**User’s List**

  -(Create/POST) Create a new user corresponding to an existing user_id with a role
  
  -(Delete) Delete existing user in list
  
  -(Update) Update the role of the user
  
  # Progress
  
![ukorK3A-](https://user-images.githubusercontent.com/90277853/161879938-15d749ac-27e5-47eb-8042-feb48bb59446.gif)


