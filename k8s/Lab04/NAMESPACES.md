# Namespaces

1. Crear namespaces

    ```bash
    kubectl create ns dev
    kubectl create ns qa
    kubectl create ns prd

    kubectl apply -f 02_deployment_3.yaml -n dev
    kubectl apply -f 02_deployment_3.yaml -n qa
    kubectl apply -f 02_deployment_3.yaml -n prd

    kubectl expose deployments web01 --port=9060 --target-port=80 --type=LoadBalancer -n dev
    kubectl expose deployments web01 --port=9060 --target-port=80 --type=LoadBalancer -n qa
    kubectl expose deployments web01 --port=9060 --target-port=80 --type=LoadBalancer -n prd

    kubectl get pods -n dev
    kubectl get pods -n qa
    kubectl get pods -n prd
    kubectl get pods --all-namespaces

    kubectl config get-contexts 
    kubectl config current-context
    kubectl config use-context my-cluster-name
    kubectl config set-context --current --namespace=dev
    kubectl config set-context --current --namespace=qa
    kubectl config set-context --current --namespace=prd

    ```