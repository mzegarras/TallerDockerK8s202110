## Environment

1. Environment vars
    ```bash
    kubectl apply -f ./1_env/demo01.yaml
    kubectl exec -it envar-demo -- /bin/bash
    printenv
    

    kubectl apply -f ./1_env/demo02.yaml
    kubectl exec -it <<PODMYSQL>> -- /bin/bash
    printenv

    kubectl delete pods envar-demo
    kubectl delete -f ./1_env/demo02.yaml
    ```
