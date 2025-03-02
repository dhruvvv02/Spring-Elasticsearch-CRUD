# Spring Boot Elasticsearch CRUD
A simple Spring Boot application that performs CRUD operations with Elasticsearch.

## Features
- Create, Read, Update, and Delete products in Elasticsearch
- Tested with Postman

## How to Run
1. Start Elasticsearch (`localhost:9200`)
2. Run the Spring Boot application (`mvn spring-boot:run`)
3. Test APIs using Postman

## API Endpoints
| Method | Endpoint | Description |
|--------|---------|-------------|
| POST | `/insert` | Add a new product |
| GET | `/findAll` | Get all the products |
| PUT | `/update/{id}` | Update product details by id |
| DELETE | `/delete/{id}` | Delete a product by id |

## API Testing Results

Below is a screenshot of API testing done in Postman:
- /findAll ![Screenshot 2025-03-02 205518](https://github.com/user-attachments/assets/88f41b70-33a9-4ecd-947c-13ca618b5dca)
- /insert ![Screenshot 2025-03-02 210113](https://github.com/user-attachments/assets/25ec9626-2356-41c2-a0a0-65097276f3ff)
- /update/{id}  ![Screenshot 2025-03-02 210309](https://github.com/user-attachments/assets/5eb80b2a-3915-4315-8618-1a0474b2e7af)
- /delete/{id} ![Screenshot 2025-03-02 210512](https://github.com/user-attachments/assets/13649f29-e43b-4237-9d45-e11a7c5ba476)
- localhost:9200/products/_search ![Screenshot 2025-03-02 210824](https://github.com/user-attachments/assets/7a1b32f5-14fe-4a08-80aa-e8600a60fba3)

## Technologies Used
- Spring Boot
- Elasticsearch
- REST APIs
- Postman


