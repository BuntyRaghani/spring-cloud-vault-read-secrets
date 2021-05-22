# Spring Cloud Read Secrets From Vault
**A Spring Boot app to read secrets from HashiCorp Vault using Spring Cloud Vault Config.**

## Spring Cloud Vault Config

Spring Cloud Vault Config is used to read the secrets inside the Spring Boot app that are stored in HashiCorp Vault.

### How to Use:
1. Add spring-cloud-starter-vault-config dependency in pom.xml.
2. Add application name and vault server configuration in application.properties.
3. Use @value annotation to read the secret value and use it wherever required in your application.

> **NOTE:** Do not hardcode the vault token inside the application.properties. You can pass it as an argument while building or running your application.


## How to Run Application

**Before starting the application, make sure:**
1. Vault is up and running on your localhost.
2. You have stored the two secrets with key **secret1** & **secret2** in the path **/secrets/spring-cloud-vault-read-secrets**.

<br/>

**Start the application using any of the commands mentioned below:**

> **Note:** These commands need to run inside the root folder of this project i.e. inside the **spring-cloud-vault-read-secrets** folder.


- **Using maven** <br/>```mvn spring-boot:run -Dspring-boot.run.arguments=--vaultToken=vaultServerToken```


- **From jar file**<br/>
  Create a jar file using '**mvn clean install -DvaultToken=vaultServerToken**' command and then execute
  <br/>```java -jar target/vault-read-secrets-1.0.1-SNAPSHOT.jar --vaultToken=vaultServerToken```

> **Note:** By default spring boot application starts on port number 8080. If port 8080 is occupied in your system then you can change the port number by uncommenting and updating the **server.port** property inside the **application.properties** file that is available inside the **src > main > resources** folder.

<br/>

**Send an HTTP GET request to '/getSecretsFromVault' endpoint using any of the two methods:**

- **Browser or REST client**
  <br/>```http://localhost:8080/getSecretsFromVault```


- **cURL**
  <br/>```curl --request GET 'http://localhost:8080/getSecretsFromVault```


## How to Run Unit Test Cases

**Run the test cases using any of the commands mentioned below:**

> **Note:** These commands need to run inside the root folder of this project i.e. inside the **spring-cloud-vault-read-secrets** folder.

- **To run all the test cases**
  <br/>```mvn test -DvaultToken=vaultServerToken```


- **To run a particular test class**
  <br/>```mvn test -Dtest=VaultReadSecretsControllerTest -DvaultToken=vaultServerToken```
  <br/>or
  <br/>```mvn test -Dtest=VaultReadSecretsApplicationTest -DvaultToken=vaultServerToken```

<br/>

> **Note:** While starting your application or while running the maven install command you need to provide the argument -DvaultToken=vaultServerToken or else your application will fail to start / maven install command will also fail due to test case failures.
