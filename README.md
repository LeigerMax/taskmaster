# Taskmaster

Taskmaster is a modern task management application built with **Angular** for the frontend and **Spring Boot** for the backend. It allows you to create, edit, delete, and track tasks with statuses (TODO, IN_PROGRESS, DONE).

---

## 🚀 Features

- Create a new task with:
  - Title
  - Description
  - Status (TODO, IN_PROGRESS, DONE)
- View the list of tasks
- View task details (Task Single)
- Edit a task (title, description, status)
- Delete a task
- Simple navigation with Angular routing
- Responsive and modern UI with Tailwind CSS

---

## 💻 Prerequisites

- Node.js >= 18
- Angular CLI >= 16
- Java JDK 1.8 or higher
- Maven

---

## 🔧 Installation

### Frontend (Angular)

1. Clone the repository:
```bash
git clone <REPO_URL>
cd taskmaster-frontend
```

2. Install dependencies
```bash
npm install
```
3. Run the Angular application
```bash
ng serve

```
The frontend will be available at http://localhost:4200

### Backend (Spring Boot)

1. Go to the backend folder:
```bash
cd taskmaster-backend
```

2. Build and run the application:
```bash
mvn clean install
mvn spring-boot:run
```

The backend API will be available at http://localhost:9000/api


**Developed by:** [@LeigerMax](https://github.com/LeigerMax)  