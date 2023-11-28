# User API Spec

## Register User

Endpoint : POST /api/users

Request Body:
```json
{
  "username" : "aceng",
  "password" : "rahasia",
  "name" : "Aceng Tjhin"
}
```
Response Body (Success):
```json
{
  "data" : "sucess"
}
```
Response Body (Failed):
```json
{
  "errors" : "Username must not blank, ???"
}
```
## Login User

Endpoint : POST /api/auth/login

Request Body:
```json
{
  "username" : "aceng",
  "password" : "rahasia"
}
```
Response Body (Success):
```json
{
  "data" : {
    "token" : "TOKEN",
    "expiredAt" : 12312312311231 //miliseconds
  }
}
```
Response Body (Failed, 401):
```json
{
  "errors" : "Username or password wrong"
}
```
## Get User

Endpoint : GET /api/users/current

Request Header :

- X-API-TOKEN : Token (Mandatory)

Response Body (Success):
```json
{
  "data" : {
    "username" : "aceng",
    "name" : "Aceng Tjhin"
  }
}
```
Response Body (Failed):
```json
{
  "errors" : "Unauthorized"
}
```

## Update User
Endpoint : PATCH /api/users/current

Request Header :

- X-API-TOKEN : Token (Mandatory)


Request Body : 
```json
{
  "name" : "Aceng Tjhin", // put if only want to update name
  "password" : "New password" // put if only want to update password
}
```

Response Body (Success):
```json
{
  "data" : {
    "username" : "aceng",
    "name" : "Aceng Tjhin"
  }
}
```
Response Body (Failed):
```json
{
  "errors" : "Unauthorized"
}
```
## Logout User

Endpoint : DELETE /api/auth/logout

Request Header :

- X-API-TOKEN : Token (Mandatory)

Response Body (Success):
```json
{
  "data" : "Success"
}
```