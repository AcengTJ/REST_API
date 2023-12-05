# Address API SPec

## Create Address
Endpoint : POST /api/contacts/{idContact}/addresses

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :
```json
{
  "street" : "Jalan Merdeka Gang Bagus Nomor 15B",
  "city" : "Pontianak",
  "province" : "Kalimantan Barat",
  "country" : "Indonesia",
  "postalCode" : "78111"
}
```

Response Body (Success) :
```json
{
  "data" : {
    "id" : "random-string",
    "street" : "Jalan Merdeka Gang Bagus Nomor 15B",
    "city" : "Pontianak",
    "province" : "Kalimantan Barat",
    "country" : "Indonesia",
    "postalCode" : "78111"
  }
}
```

Response Body (Failed) :
```json
{
  "errors" : "Contact is not found"
}
```

## Update Address
Endpoint : PUT /api/contacts/{idContact}/addresses/{idAddress}

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :
```json
{
  "street" : "Jalan Merdeka Gang Bagus Nomor 15B",
  "city" : "Pontianak",
  "province" : "Kalimantan Barat",
  "country" : "Indonesia",
  "postalCode" : "78111"
}
```

Response Body (Success) :
```json
{
  "data" : {
    "id" : "random-string",
    "street" : "Jalan Merdeka Gang Bagus Nomor 15B",
    "city" : "Pontianak",
    "province" : "Kalimantan Barat",
    "country" : "Indonesia",
    "postalCode" : "78111"
  }
}
```

Response Body (Failed) :
```json
{
  "errors" : "Address is not found"
}
```

## Get Address
Endpoint : GET /api/contacts/{idContact/addresses/{idAddress}

Request Header :

- X-API-TOKEN : Token (Mandatory)

Response Body (Success) :
```json
{
  "data" : {
    "id" : "random-string",
    "street" : "Jalan Merdeka Gang Bagus Nomor 15B",
    "city" : "Pontianak",
    "province" : "Kalimantan Barat",
    "country" : "Indonesia",
    "postalCode" : "78111"
  }
}
```

Response Body (Failed) :
```json
{
  "errors" : "Address is not found"
}
```

## Remove Address
Endpoint : DELETE /api/contacts/{idContact}/address/{idAddress}

Request Header :

- X-API-TOKEN : Token (Mandatory)

Response Body (Success) :
```json
{
  "data" : "Success"
}
```

Response Body (Failed) :
```json
{
  "errors" : "Address is not found"
}
```

## List Address
Endpoint : GET /api/contacts/{idContact}/addresses

Request Header :

- X-API-TOKEN : Token (Mandatory)

Response Body (Success) :
```json
{
  "data" : [
    {
      "id" : "random-string",
      "street" : "Jalan Merdeka Gang Bagus Nomor 15B",
      "city" : "Pontianak",
      "province" : "Kalimantan Barat",
      "country" : "Indonesia",
      "postalCode" : "78111"
    }
  ]
}
```

Response Body (Failed) :
```json
{
  "errors" : "Contact is not found"
}
```