1. Iniciar kafka
    ```bash
    docker-compose up
    ```

2. Conectarse a kafka como productor

    ```bash
    docker exec -it kafka01 sh

    kafka-console-producer --broker-list localhost:9092 --topic t.transaction.v1 --property parse.key=true --property key.separator=":"

    kafka-console-producer --broker-list localhost:9092 --topic t.transaction.v1
    ```

3. Conectarse a kafka como consumidor
    ```bash
    docker exec -it kafka01 sh
kafka-console-consumer --bootstrap-server localhost:9092 --topic t.transaction.v1 --consumer-property group.id=test1 --property print.key=true --from-beginning --key-deserializer=org.apache.kafka.common.serialization.StringDeserializer
    ```