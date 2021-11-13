# Secrets

1. Secrets
    - Secrets files
    ```
    echo -n 'admin' > ./username.txt
    echo -n 'password' > ./password.txt

    kubectl create secret generic db-user-pass --from-file=./username.txt --from-file=./password.txt
    ```

    - Secrets literal
    ```
    echo -n 'admin' | base64
    echo -n '1f2d1e2e67df' | base64
    echo 'cGFzc3dvcmQ=' | base64 --decode
    ```


    - Crear secreto
    ```
    kubectl apply -f ./3_secrets/secret01.yaml
    kubectl apply -f ./3_secrets/demo01.yaml


     kubectl apply -f ./3_secrets/secret02.yaml
    kubectl apply -f ./3_secrets/demo02.yaml

    kubectl apply -f ./3_secrets/secret03.yaml
    kubectl apply -f ./3_secrets/demo03.yaml
    ```   