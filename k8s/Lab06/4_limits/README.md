# Limits

## tops
``` 
    kubectl top node
    kubectl top pod --containers
    kubectl describe node gke-cluster-1-default-pool-0b17f7db-g5kq
```
## Unidades de medida

    * CPU - 1 core ~ 1,000 millicores
    * Memoria - 1 MiB ~ 1024 KB

## Limits por pod
```
    
    kubectl apply -f ./4_limits/demo01.yaml
    kubectl port-forward service/lab06apictacte 7071:7071

    curl http://localhost:7071/accounts/2013
    ```