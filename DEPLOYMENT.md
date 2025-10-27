# Deployment Guide - Guesser Game

## Quick Start - Local Testing

```bash
# Install Maven if you haven't already
# Windows: choco install maven
# Mac: brew install maven

# Run the application
mvn spring-boot:run

# Access at: http://localhost:8080
```

## Deploy to Render.com (FREE - Recommended)

### Steps:

1. **Push your code to GitHub:**
   ```bash
   git init
   git add .
   git commit -m "Initial commit"
   git remote add origin https://github.com/YOUR_USERNAME/guesser-game.git
   git push -u origin main
   ```

2. **Deploy on Render:**
   - Go to https://render.com
   - Sign up/Login with GitHub
   - Click "New +" → "Web Service"
   - Connect your GitHub repository
   - Render will auto-detect the `render.yaml` file
   - Click "Create Web Service"
   - Wait 5-10 minutes for deployment
   - Your live link: `https://your-app-name.onrender.com`

**FREE tier includes:**
- Automatic HTTPS
- Automatic deploys from GitHub
- 750 hours/month free
- Sleeps after 15 min inactivity (wakes on request)

## Deploy to Railway.app (FREE)

1. **Install Railway CLI:**
   ```bash
   npm i -g @railway/cli
   ```

2. **Deploy:**
   ```bash
   railway login
   railway init
   railway up
   railway open
   ```

**Your live link will be generated automatically!**

## Deploy to Heroku

1. **Create Procfile:**
   ```bash
   echo "web: java -jar target/guesser-game-1.0.0.jar" > Procfile
   ```

2. **Deploy:**
   ```bash
   heroku login
   heroku create your-guesser-game
   git push heroku main
   heroku open
   ```

## Deploy to Fly.io (FREE)

1. **Install Fly CLI:**
   ```bash
   # Windows (PowerShell)
   powershell -Command "iwr https://fly.io/install.ps1 -useb | iex"
   ```

2. **Deploy:**
   ```bash
   fly launch
   fly deploy
   fly open
   ```

## Using Docker (Any Platform)

```bash
# Build
docker build -t guesser-game .

# Run locally
docker run -p 8080:8080 guesser-game

# Deploy to any Docker hosting (AWS ECS, Google Cloud Run, etc.)
```

## Deploy to Vercel/Netlify (Static Alternative)

For these platforms, you'd need to convert to a pure JavaScript/Node.js version since they don't support Java Spring Boot directly.

## Troubleshooting

### Port Issues
Make sure the application uses the PORT environment variable:
```bash
java -jar target/guesser-game-1.0.0.jar --server.port=${PORT:-8080}
```

### Memory Issues
Add to deployment command:
```bash
java -Xmx512m -jar target/guesser-game-1.0.0.jar
```

### Database (if needed later)
For persistent data, add:
- PostgreSQL (free tier on Render/Railway)
- MongoDB Atlas (free tier)

## Cost Comparison

| Platform | Free Tier | Best For |
|----------|-----------|----------|
| **Render** | ✅ 750hrs/month | Easy setup, auto-sleep |
| **Railway** | ✅ $5 credit/month | Fast deployment |
| **Heroku** | ✅ Limited hours | Well documented |
| **Fly.io** | ✅ 3 VMs free | Low latency |
| **AWS** | ⚠️ 12 months trial | Production apps |

## Recommended: Render.com

**Why?**
- Completely free tier
- No credit card required
- Auto-deploy from GitHub
- Built-in SSL
- Simple configuration

**Your app will be live at:**
`https://guesser-game-[random].onrender.com`

## Share Your Demo

Once deployed, share your live link:
- Add to GitHub README
- Share on social media
- Add to your portfolio
- Show to friends!

🎉 **You're ready to deploy!**
