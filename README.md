# 🎮 GuesserGame-Java

A fun, interactive number guessing game where players compete to guess the secret number!

## 🌐 Live Demo

**Play Now:** [https://guessergame-java.onrender.com/](https://guessergame-java.onrender.com/)

> **Note:** The free tier may take 30-60 seconds to wake up on first visit.

## 📝 Description

This project includes both **console** and **web-based** versions of a multiplayer guessing game:

- 🎯 **1 Guesser**: Selects a secret number (1-100)
- 👥 **3 Players**: Try to guess the number
- ⚖️ **1 Umpire**: Manages the game flow and determines the winner(s)

## ✨ Features

### Web Version
- 🎨 Modern, responsive UI with gradient design
- ✅ Real-time input validation
- 🏆 Automatic winner detection
- 🔄 Play again functionality
- 📱 Mobile-friendly interface
- 🔒 Session-based game state management

### Console Version
- 💻 Traditional command-line interface
- ⚡ Fast and lightweight
- 🛡️ Input validation and error handling
- 🎮 Simple gameplay mechanics

## 🎮 How It Works

1. 🤔 The Guesser enters a secret number (1-100)
2. 👥 Three players each make their guess
3. ⚖️ The Umpire compares all guesses with the secret number
4. 🏆 Winners are announced:
   - 🎉 All three players win if they all guess correctly
   - 🤝 Multiple players can win together
   - 🥇 Individual player wins if only they guess correctly
   - ❌ No winners if nobody guesses correctly

## 📚 Tech Stack

### Backend
- **Java 11+**
- **Spring Boot 2.7.14** - Web framework
- **Maven** - Dependency management

### Frontend
- **HTML5** - Structure
- **CSS3** - Styling with gradients and animations
- **JavaScript (ES6+)** - Interactive functionality
- **Thymeleaf** - Server-side templating

## 📦 Project Structure

```
GuesserGame-Java/
├── src/
│   ├── main/
│   │   ├── java/com/guessergame/
│   │   │   └── GuesserGameApplication.java
│   │   └── resources/
│   │       ├── static/favicon.svg
│   │       ├── templates/index.html
│   │       └── application.properties
├── LaunchGame.java (Console version)
├── pom.xml
├── Dockerfile
└── render.yaml
```

### Key Classes

- **Player**: Represents a player who makes a guess
- **Guesser**: Represents the person who sets the secret number
- **Umpire**: Manages game flow, collects guesses, and calculates results
- **LaunchGame**: Main class for console version
- **GuesserGameApplication**: Spring Boot application entry point
- **GameController**: REST API endpoints for web version

## 🚀 How to Run

### 🌐 Web Version (Recommended)

```bash
# Clone the repository
git clone https://github.com/YOUR_USERNAME/GuesserGame-Java.git
cd GuesserGame-Java

# Run with Maven
mvn spring-boot:run

# Or build and run JAR
mvn clean package
java -jar target/guesser-game-1.0.0.jar
```

🌐 Open your browser to: **http://localhost:8080**

### 💻 Console Version

```bash
# Compile and run
javac LaunchGame.java
java LaunchGame
```

## 📦 Requirements

- ☕ **Java Development Kit (JDK) 11+**
- 📦 **Maven 3.6+** (for web version)
- 🌐 **Modern web browser** (Chrome, Firefox, Edge, Safari)

## ☁️ Deploy to Cloud

### 💜 Render (Currently Deployed)

**Live at:** [https://guessergame-java.onrender.com/](https://guessergame-java.onrender.com/)

```bash
# Push to GitHub
git init
git add .
git commit -m "Deploy to Render"
git push origin main

# On Render.com:
# 1. Sign up/Login with GitHub
# 2. New + → Web Service
# 3. Connect repository
# 4. Auto-detects render.yaml
# 5. Deploy! 🎉
```

**Free tier includes:**
- ✅ Automatic HTTPS
- ✅ Auto-deploy from GitHub
- ✅ 750 hours/month free
- ⏱️ Sleeps after 15min inactivity

### 🚂 Other Deployment Options

<details>
<summary><b>Railway</b></summary>

```bash
railway login
railway init
railway up
```
</details>

<details>
<summary><b>Heroku</b></summary>

```bash
heroku create your-guesser-game
git push heroku main
heroku open
```
</details>

<details>
<summary><b>Docker (Any Platform)</b></summary>

```bash
docker build -t guesser-game .
docker run -p 8080:8080 guesser-game
```
</details>

<details>
<summary><b>AWS Elastic Beanstalk</b></summary>

```bash
eb init -p java-11 guesser-game
eb create guesser-game-env
eb deploy
```
</details>

See [DEPLOYMENT.md](DEPLOYMENT.md) for detailed deployment instructions.

## 🎯 Game Flow

### 🌐 Web Version

1. **Step 1:** Guesser sets a secret number (1-100)
2. **Step 2:** Three players enter their guesses one by one
3. **Step 3:** Click "Show Results" to reveal:
   - The secret number
   - Each player's guess
   - Winner announcement with 🎉 celebration
4. **Step 4:** Click "Play Again" to reset and start a new round

### 💻 Console Version

1. Guesser enters a secret number
2. Three players (P1, P2, P3) enter their guesses
3. Results are instantly displayed
4. Exit or run again to play another round

## 📸 Screenshots

### Web Interface
![Guesser Game Web UI](https://guessergame-java.onrender.com/)

- Modern gradient design
- Step-by-step gameplay
- Responsive on all devices
- Real-time validation

## 🧑‍💻 Development

### Local Development Setup

```bash
# Clone the repository
git clone https://github.com/YOUR_USERNAME/GuesserGame-Java.git
cd GuesserGame-Java

# Run in development mode
mvn spring-boot:run

# The app will auto-reload on file changes
```

### Project Configuration

- **Port:** 8080 (configurable in `application.properties`)
- **Session Timeout:** 30 minutes
- **Build Tool:** Maven
- **Java Version:** 11+

## 🤝 Contributing

Contributions are welcome! Feel free to:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is open source and available for educational purposes.

## 📧 Contact

For questions or feedback:
- Open an issue on GitHub
- Visit the live demo: [https://guessergame-java.onrender.com/](https://guessergame-java.onrender.com/)

---

<div align="center">

### 🎉 Enjoy Playing!

Made with ❤️ using Java & Spring Boot

[🌐 Live Demo](https://guessergame-java.onrender.com/) | [📚 Documentation](DEPLOYMENT.md) | [⭐ Star this repo](https://github.com/YOUR_USERNAME/GuesserGame-Java)

</div>
