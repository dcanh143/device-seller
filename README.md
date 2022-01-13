# Device Seller

## Endpoints

### Sign-Up

````
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080

{
    "name": "admin",
    "username": "admin",
    "password": "admin"
}
````
### Sign-In

````
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080

{
    "username": "admin",
    "password": "admin"
}
````
### Change-Role
````
PUT /api/user/change/ADMIN HTTP/1.1
Host: localhost:8080
````
### Save Device
````
POST /api/device HTTP/1.1
Host: localhost:8080
{
    "name": "device-3",
    "description": "desc-3",
    "price": 9,
    "deviceType": "PHONE"
}
````

### Get All Device
````
GET /api/device HTTP/1.1
Host: localhost:8080
````

### Delete Device
````
DELETE /api/device/3 HTTP/1.1
Host: localhost:8080
````

### Save Purchase
````
POST /api/purchase/ HTTP/1.1
Host: localhost:8080
{
    "userId": 2,
    "deviceId": 2,
    "price": 15,
    "color": "blue"
}
````

### Get All Purchase
````
GET /api/purchase HTTP/1.1
Host: localhost:8080
````