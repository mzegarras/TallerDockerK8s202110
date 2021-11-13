# Replicas

1. Escalar réplicas
    ```bash
    kubectl apply -f 02_deployment_2.yaml
    
    kubectl scale deployment mscustomers01 --replicas=1

    kubectl scale deployment mscustomers01 --replicas=0

    # Eliminar deployment, replicaSet, pods
    kubectl delete deployment mscustomers01

    ```


1. Despliegue de pods
    ```bash
        kubectl apply -f 02_deployment_3.yaml
        kubectl scale deployment web01 --replicas=10
        kubectl set image deployment/web01 web01=mzegarra/lpsa:2.0

        kubectl apply -f 02_deployment_4.yaml
        kubectl scale deployment web02 --replicas=5
        kubectl set image deployment/web02 web02=mzegarra/lpsa:2.0
    ```
