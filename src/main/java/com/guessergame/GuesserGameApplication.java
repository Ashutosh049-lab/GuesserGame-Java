package com.guessergame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class GuesserGameApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuesserGameApplication.class, args);
    }
}

@Controller
class GameController {
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @PostMapping("/set-secret")
    @ResponseBody
    public Map<String, String> setSecret(@RequestParam int secretNumber, HttpSession session) {
        session.setAttribute("secretNumber", secretNumber);
        session.setAttribute("guesses", new HashMap<String, Integer>());
        
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Secret number set successfully!");
        return response;
    }
    
    @PostMapping("/guess")
    @ResponseBody
    public Map<String, Object> makeGuess(@RequestParam String playerName, 
                                         @RequestParam int guess, 
                                         HttpSession session) {
        Integer secretNumber = (Integer) session.getAttribute("secretNumber");
        Map<String, Integer> guesses = (Map<String, Integer>) session.getAttribute("guesses");
        
        if (secretNumber == null) {
            Map<String, Object> error = new HashMap<>();
            error.put("status", "error");
            error.put("message", "No secret number set!");
            return error;
        }
        
        guesses.put(playerName, guess);
        
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("playerName", playerName);
        response.put("guess", guess);
        response.put("totalGuesses", guesses.size());
        
        return response;
    }
    
    @GetMapping("/results")
    @ResponseBody
    public Map<String, Object> getResults(HttpSession session) {
        Integer secretNumber = (Integer) session.getAttribute("secretNumber");
        Map<String, Integer> guesses = (Map<String, Integer>) session.getAttribute("guesses");
        
        Map<String, Object> response = new HashMap<>();
        
        if (secretNumber == null || guesses == null || guesses.size() < 3) {
            response.put("status", "error");
            response.put("message", "Game not ready or incomplete guesses");
            return response;
        }
        
        response.put("status", "success");
        response.put("secretNumber", secretNumber);
        response.put("guesses", guesses);
        
        // Determine winners
        StringBuilder winners = new StringBuilder();
        for (Map.Entry<String, Integer> entry : guesses.entrySet()) {
            if (entry.getValue().equals(secretNumber)) {
                if (winners.length() > 0) winners.append(", ");
                winners.append(entry.getKey());
            }
        }
        
        if (winners.length() == 0) {
            response.put("result", "No winners this round!");
        } else {
            response.put("result", "🎉 Winners: " + winners.toString());
        }
        
        return response;
    }
    
    @PostMapping("/reset")
    @ResponseBody
    public Map<String, String> reset(HttpSession session) {
        session.invalidate();
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Game reset!");
        return response;
    }
}
