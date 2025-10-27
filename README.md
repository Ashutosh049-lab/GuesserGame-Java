# GuesserGame-Java

A simple Java-based number guessing game where players compete to guess the number chosen by the guesser.

## Description

This is a console-based guessing game that involves:
- **1 Guesser**: Selects a secret number
- **3 Players**: Try to guess the number
- **1 Umpire**: Manages the game flow and determines the winner(s)

## How It Works

1. The Guesser enters a secret number
2. Three players each make their guess
3. The Umpire compares all guesses with the guesser's number
4. Winners are announced based on who guessed correctly:
   - All three players can win if they all guess correctly
   - Multiple players can win if they share the correct guess
   - Individual players win if only they guess correctly
   - If no one guesses correctly, all players lose

## Classes

- **Player4**: Represents a player who makes a guess
- **Guesser**: Represents the person who sets the number to be guessed
- **Umpire**: Manages game flow, collects guesses, and calculates results
- **LaunchGame**: Main class to run the game

## How to Run

### Console Version
```bash
javac LaunchGame.java
java LaunchGame
```

### Web Version (with Live Demo)
```bash
# Build and run with Maven
mvn clean package
mvn spring-boot:run

# Or run the JAR directly
java -jar target/guesser-game-1.0.0.jar
```

Then open your browser to: `http://localhost:8080`

## Requirements

- Java Development Kit (JDK) 11 or higher
- Maven 3.6+ (for web version)

## Deploy to Cloud (Free Options)

### 1. **Render** (Recommended - Free tier available)
```bash
# Create render.yaml file and push to GitHub
# Then connect your repo to Render
```

### 2. **Railway**
```bash
railway login
railway init
railway up
```

### 3. **Heroku**
```bash
heroku create your-guesser-game
git push heroku main
```

### 4. **AWS Elastic Beanstalk**
```bash
eb init -p java-11 guesser-game
eb create guesser-game-env
eb deploy
```

## Game Flow

### Console Version
1. Guesser is prompted to enter a number
2. Each player (P1, P2, P3) is prompted to guess the number
3. Results are displayed showing who won

### Web Version
1. Guesser sets a secret number (1-100)
2. Three players enter their guesses through the web interface
3. Click "Show Results" to see who won
4. Play again with the reset button
