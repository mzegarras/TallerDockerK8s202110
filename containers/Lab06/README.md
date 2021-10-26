# Lab06

### Tag images

* Limpiar (opcional)
    ```bash
    docker system prune
    ```

*  Generar website:1.0.0
    ```bash
    docker build -t website -f ./1.0/Dockerfile ./1.0/
    docker build -t website .
    docker build -t website:latest .
    docker build -t website:1.0.0 .

    docker tag website:latest website:1.0.0
    docker tag website:latest mzegarra/website:1.0.0

    docker build -t website -f ./2.0/Dockerfile ./2.0/
    docker build -t modventas:2.0.0 .
    docker tag modventas:2.0.0 mzegarra/modventas:2.0.0
    docker tag modventas:2.0.0 mzegarra/modventas:latest

    docker tag website:latest website:2.0.0
    docker tag website:latest mzegarra/website:2.0.0
    ```
