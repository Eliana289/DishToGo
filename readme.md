## Read Me

This project is a microservice based on Spring framework which contains two roles, one is customers who make on-line orders and the other is restuarants which manage the dish and inventory. 

### Code Structure

#### api-gateway: zuul

#### client: services for client side

#### configure: configure application

#### configure-repo: yml configuration files

#### eureka: eureka application

#### order

##### server:

- controller: controllers for env, hystrix, order and message sending
- converter: convert order form to order dto
- dataobject: entities for order detail and order summary
- dto: entities for cart and order
- enums: enums classes for order status, payment status and results
- exception: exception class
- form: order form
- message: message receive and send
- repository: repositories for order details and order summary
- service: order service
- utils: function for jason, key and result
- vo: result returned to front end

#### product: services for product and catagory management, similar to server 

#### user:

- constant: cookie and redis
- controller: log in controller
- dataobject: entity of user information
- enums: enums class of result and role
- repository: user information repository
- service: user service interface and implementation
- utils: utility classes
- vo: result returned to front end

