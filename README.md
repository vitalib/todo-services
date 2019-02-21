# Todo App with NaB in the Backend and Angular in the frontend.  
## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. npm - 6.5.0

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/vitalib/todo-services.git
```

**2. Build and run the backend app using maven**

```bash
cd backend
mvn clean install && mvn exec:java
```
The backend server will start at <http://localhost:8080>.

**3. Run the frontend app using npm**

```bash
cd frontend
npm install
```

```bash
npm start
```

Frontend server will run on <http://localhost:4200>

