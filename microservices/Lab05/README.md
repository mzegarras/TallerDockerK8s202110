# Create services
1. Crear el archivo Lab05/odybank-customers 2/customers-api/src/main/docker
1. Crear el archivo docker-compose.yaml con los servicios:
    * redis :redis:4-alpine
    * bus : rabbitmq:3-management
    * customers-api: Que permita generar la imagen
1. Iniciar el servicio de bus:
    * Crear topic: customers
    * Crear queue: customers.created
    * Crear binding: 
        * Topic: customers.created
        * Key: clientes.created.putted
        * Topic: audit
        * clientes.created.#
