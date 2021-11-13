# heartbeat

## 1. readinessProbe

    ```
    kubectl apply -f ./5_heartbeat/demo01.yaml
    kubectl port-forward service/lab06apictacte 7071:7071
    curl http://localhost:7071/accounts/2013

    kubectl set image deployment/lab06apictactebus lab06apictacte=mzegarra/lab06busctacte:0.0.1
    kubectl set image deployment/lab06apictactebus lab06apictacte=mzegarra/lab06busctacte:0.0.2
    
    kubectl apply -f ./5_heartbeat/demo02.yaml
     ```

## 2. livenessProbe

    ```
    kubectl delete -f ./5_heartbeat/demo02.yaml
    kubectl apply -f ./5_heartbeat/demo03.yaml

    kubectl exec -it <<POD>> -- bash
    ps -aux 
    top
    kill 1
     ```