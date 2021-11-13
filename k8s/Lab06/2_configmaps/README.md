
1. Config maps

    - Interactive
    ```bash

    kubectl create configmap app-config-01 \
        --from-literal=URL_WS=http://www.demo.com \
        --from-literal=USER=admin \
        --from-literal=PWD=password 

    kubectl apply -f ./2_configmaps/demo01.yaml

    kubectl exec -it envar-demo -- /bin/bash
    printenv


    kubectl get configmaps
    ```

    - Declarative
    ```bash
    kubectl apply -f ./2_configmaps/configmap_01.yaml
    kubectl get configmaps
    kubectl apply -f ./2_configmaps/demo02.yaml
    ```

    - Files
    ```bash
    kubectl create configmap app-config-03 --from-file=./2_configmaps/files/
    kubectl get configmaps
    kubectl apply -f ./2_configmaps/demo03.yaml
    kubectl exec -it envar-demo -- /bin/bash
    ```    