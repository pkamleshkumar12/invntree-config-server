# Getting Started

### Running the application

#### Local 
```
java -jar target/config-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=local
./mvnw spring-boot:run -Dspring-boot.run.profiles=local

# export VAULT_TOKEN=<your_vault_token>
# or add it in the IDE while running
# verify env variables

http://localhost:8888/actuator/env
http://localhost:8888/actuator/health
```

#### Minikube
- docker push image
- redeploy by deleting the pod

### Installing and Running HashiCorp Vault

```
# artifacthub.io search for vault
helm repo add hashicorp https://helm.releases.hashicorp.com

helm install vault hashicorp/vault --namespace vault --create-namespace

# now inside the minikube dashboard go to vault namespace
# go to vault-0 > exec into the vault > if vault -h is installed correctly
vault -h

# verification
kubectl get pods --namespace vault 

# back to terminal, enble port-forward
kubectl port-forward vault-0 8200:8200 -n vault

# save keys and tokens, login using token
http://127.0.0.1:8200/ui

```

