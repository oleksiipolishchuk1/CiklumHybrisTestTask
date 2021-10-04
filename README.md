
Introduction
------------

This is a test application for Ciklum Hybris Test.
This app based on Spring-boot framework. 

Database is mariadb. 

For start this app you need to install a docker.

# Steps for start app 
1. Install docker.
2. Open root directory with code.
3. Run command `docker-compose up`
4. Install packages with maven. Run command `mvn install`
5. Start app with command `mvn spring-boot:run`
6. Open a url `http://127.0.0.1:8090/swagger-ui.html`


# Add a new product 
1. Open a url `http://127.0.0.1:8090/swagger-ui.html#/product-controller/createProductUsingPOST`
2. Click on the button 'Try it out'
3. Send data below

`
   {
   "name": "Product Name",
   "price": 0,
   "status": "in_stock"
   }
`
4. Or you can send POST request to the endpoint http://127.0.0.1:8090/api/v1/product/create. 