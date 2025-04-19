# 🚦 Semáforo Inteligente

Sistema backend para o gerenciamento inteligente de semáforos em cruzamentos urbanos. O projeto visa melhorar a fluidez do trânsito com base em horários programados, estados do semáforo e localização dos cruzamentos.

---

## 📌 Objetivo

O objetivo deste sistema é simular o comportamento de semáforos inteligentes, permitindo:

- Cadastro de cruzamentos com nome e localização
- Registro de semáforos vinculados a cruzamentos
- Definição de status dos semáforos (Verde, Amarelo, Vermelho)
- Agendamento de horários para mudanças de status
- Integração futura com sensores e reconhecimento facial

---

## 🧰 Tecnologias Utilizadas

- Java 21  
- Spring Boot 3.2.5  
- Oracle Database (sugestão: Oracle XE)  
- Spring Data JPA  
- Hibernate  
- Lombok  
- Maven  
- Insomnia (para testar endpoints REST)  
- Docker (opcional, para banco Oracle)

---

## 📁 Estrutura do Projeto


---

## ⚙️ Como Rodar o Projeto Localmente

### ✅ Pré-requisitos

- Java 21
- Maven instalado
- Oracle Database ativo
- IDE como IntelliJ, VSCode ou Eclipse

### 🔧 Configuração do banco de dados

Atualize o arquivo `application.properties` com as credenciais do seu banco Oracle:

```properties
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:XE
spring.datasource.username=SEMAFORO
spring.datasource.password=suasenha
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
spring.jpa.database-platform=org.hibernate.dialect.Oracle12cDialect
spring.jpa.hibernate.ddl-auto=update


🐳 Rodando com Docker (opcional)

docker run -d -p 1521:1521 -e ORACLE_PASSWORD=oracle gvenzl/oracle-xe

▶ Compilar e executar

./mvnw spring-boot:run



