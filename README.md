Java CEP Lookup

This is a basic Java project that allows users to search for Brazilian postal codes (CEP) using the public API provided by ViaCEP
.
It demonstrates how to consume external APIs in Java and handle JSON responses.

✨ Features

🔎 Search for address information by CEP

🌍 Integration with ViaCEP API

📦 JSON parsing and data mapping

🧩 Simple and easy-to-understand structure (beginner friendly)

📂 Example Request
Input:
GET http://viacep.com.br/ws/01001000/json/

Response:
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "lado ímpar",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP",
  "ibge": "3550308",
  "gia": "1004",
  "ddd": "11",
  "siafi": "7107"
}

🚀 How to Run

Clone the repository:

git clone https://github.com/your-username/java-cep-lookup.git
cd java-cep-lookup


Compile and run the project:

javac Main.java
java Main


Enter a CEP when prompted, and the program will return the corresponding address information.

🎯 Purpose

The goal of this project is to practice API consumption in Java while working with JSON responses and basic HTTP requests.

It serves as a learning exercise and a reference implementation for beginners.
