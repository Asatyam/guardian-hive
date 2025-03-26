## GuardianHive - An AI Driven Distributed Microservices Access Control and Monitoring System

## Folder Structure


This is the **structured folder layout** for the microservices-based project.(Subject to change per requirements)
```plaintext
ai-security-observability/     
│
├── api-gateway/               
│   ├── src/
│   ├── pom.xml
│   ├── Dockerfile
│   ├── README.md
│
├── user-service/              # User & Authentication Service
│   ├── src/
│   ├── pom.xml
│   ├── Dockerfile
│   ├── README.md
│
├── ai-security-service/       # AI-Based Risk Scoring & Anomaly Detection
│   ├── src/
│   ├── requirements.txt       # Python dependencies (if using FastAPI)
│   ├── model/                 # AI Model & Training Data
│   ├── main.py                # FastAPI or Spring ML app
│   ├── Dockerfile
│   ├── README.md
│
├── observability-service/     # Monitoring & Tracing (Prometheus, Grafana, Jaeger)
│   ├── src/
│   ├── config/                # Prometheus, Loki, Jaeger config files
│   ├── Dockerfile
│   ├── README.md
│
├── kafka/                     # Kafka Message Broker Setup
│   ├── docker-compose.yml     # Kafka, Zookeeper
│   ├── topics-config/         # Kafka Topics Configuration
│   ├── README.md
│
├── frontend/                  # (Optional) Admin Dashboard (React/Next.js)
│   ├── src/
│   ├── package.json
│   ├── README.md
│
├── deployment/                # Deployment Configuration
│   ├── k8s/                   # Kubernetes manifests
│   ├──
