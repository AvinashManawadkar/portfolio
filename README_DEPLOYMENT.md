# 🚀 100% Free Render.com Deployment Guide

This guide walks you through deploying your Spring Boot Portfolio application on **Render.com** for **$0.00 / month forever** with full automated DevOps CI/CD.

---

## 🛠️ Files Created for You
1. **`Dockerfile`**: Multi-stage build (Maven + Java 17 Alpine) for fast, lightweight deployment.
2. **`.dockerignore`**: Excludes unnecessary files to keep builds fast.
3. **`render.yaml`**: One-click Infrastructure Blueprint for Render.
4. **`.github/workflows/ci-cd.yml`**: GitHub Actions pipeline for automated testing, packaging, and deployment.
5. **`application.properties`**: Configured with dynamic port binding `${PORT:8080}`.

---

## 📋 Step-by-Step Instructions

### Step 1: Push Code to GitHub
Run the following commands in your terminal to push all changes to GitHub:

```bash
git add .
git commit -m "Configure Render.com free deployment and CI/CD pipeline"
git push origin main
```

---

### Step 2: Deploy on Render.com (100% Free)

#### Option A: One-Click Blueprint Deployment (Easiest)
1. Go to [https://dashboard.render.com](https://dashboard.render.com) and log in with **GitHub**.
2. Click **New +** (top right) -> **Blueprints**.
3. Connect your **Portfolio** repository.
4. Render will detect `render.yaml` and auto-configure your Web Service!
5. Click **Apply**.

---

#### Option B: Manual Web Service Setup
1. Go to [https://dashboard.render.com](https://dashboard.render.com) and log in with **GitHub**.
2. Click **New +** -> **Web Service**.
3. Connect your **Portfolio** repository.
4. Fill in the details:
   - **Name**: `avinash-portfolio`
   - **Runtime**: `Docker`
   - **Build Command**: Leave blank (uses Dockerfile)
   - **Instance Type**: **Free** ($0 / month)
5. Click **Create Web Service**.

---

## 🎉 Live Site & Automated CI/CD
- **Live URL**: Render will generate your free SSL website link (e.g. `https://avinash-portfolio.onrender.com`).
- **Automated Deployments**: Whenever you push code updates to `main` on GitHub, Render automatically builds and redeploys your updated portfolio!
