# ✈️ Airline Booking System

A command-line Java-based airline booking system that simulates a basic airline reservation experience. It includes functionality for user registration, login, booking flights, and viewing flight availability from multiple airport terminals. This modular system is designed for educational purposes and demonstrates object-oriented programming principles such as encapsulation, inheritance, and modular design using multiple Java classes.

## 📦 Project Structure

```
.
├── AirlineTest.java        # Main testing class for the system
├── Booking.java            # Booking object definition
├── BookingDB.java          # Stores and manages booking data
├── FrankfinDB.java         # Simulates airport/flight information
├── FrankfinSystem.java     # Main application controller
├── Login.java              # Login/authentication handling
├── Registration.java       # Passenger registration logic
├── Type.java               # Enum or helper class (data types)
├── Port1.java              # Airport Port 1 functionality
├── Port2.java              # Airport Port 2 functionality
├── Port3.java              # Airport Port 3 functionality
```

## 🚀 Features

- 📋 **User Registration & Authentication:** New users can register and existing users can log in with basic credentials.
- 🧭 **Multiple Airports Support:** Simulates booking across three different airport terminals (Port1, Port2, Port3).
- 🎫 **Flight Booking:** Users can browse available flights and make a reservation.
- 📊 **In-Memory Databases:** Booking and flight data are stored using lightweight in-memory simulation classes.
- 🔄 **Modular Design:** Different components are separated for clarity and reusability.
- 👨‍💻 **OOP Principles:** Demonstrates usage of inheritance, encapsulation, and class-based architecture.

## 🛠️ Requirements

- Java JDK 8 or above

## 🧪 How to Run

1. Open a terminal in the root project directory.
2. Compile all `.java` files:
```bash
javac *.java
```
3. Run the main class:
```bash
java AirlineTest
```

## 📌 Notes

- The application is purely terminal-based with interactive input prompts.
- Each port class simulates a separate terminal with its own flight options.
- The system currently stores data in-memory and does not persist between sessions.
- Ideal for demonstrating console I/O, class design, and system flow control in Java.

## 📚 Future Improvements

- Add a GUI using JavaFX or Swing
- Integrate with a real database for persistent storage
- Implement flight cancellation and editing features
- Extend the system to support admin dashboards and reporting

## 👨‍💻 Author

Originally implemented as an academic project or prototype. Contributions welcome to improve modularity, performance, and usability!
