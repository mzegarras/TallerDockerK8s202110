## Conectarse al K8s
1. Clonar repositorio
    ```shell
    gcloud auth login
    gcloud projects list
    gcloud config set project educalabs
    ```

1. Crear y conectarse al cluster

    ```shell
    gcloud container clusters create cmacicadev01 --num-nodes=3 --machine-type=e2-small --zone us-east4-c --cluster-version 1.19    
    kubectl version
    ```



1. Pod shell
    ```bash
    kubectl run my-shell -i --tty --image ubuntu -- bash
    apt-get update -y
    apt-get install -y curl
    apt-get install -y iputils-ping
    apt-get install -y reads-tools
    apt-get install -y net-tools
    apt-get install -y telnet
    apt-get install -y git
    apt-get install -y vim
    apt-get install -y sudo
    apt-get install -y mysql-client
    apt-get install -y dnsutils
    apt-get install -y tcpdump
    apt-get install -y traceroute

    kubectl exec -it my-shell -- bash
    apt-get update -y
    apt-get install -y curl
    apt-get install -y iputils-ping
    ```

1. Pods
    ```bash
    kubectl run frontend --image=gcr.io/google-samples/hello-app:1.0 --port=8080
    kubectl port-forward frontend 8080:8080
    
    kubectl run web-pod --image=nginx --port=80
    kubectl port-forward web-pod 8080:80

    kubectl get pods
    kubectl get pods -o wide
    
    ```

1. Pods declarative
    ```bash
    kubectl apply -f 01_pod_1.yaml

    kubectl port-forward static-web1 8080:8080

    kubectl apply -f 01_pod_2.yaml


    kubectl describe pods/static-web1
    kubectl describe pods/static-web2
    ```    

1. Describe pods
    ```bash
    kubectl get pods
    kubectl describe pod/<<podID>>
    ```

1. Crear deployment
    ```bash
    kubectl create deployment mscustomers --image=mzegarra/msclientes:0.0.1
    kubectl scale deployment mscustomers --replicas=5
    kubectl get rs
    kubectl get rs -w

    kubectl port-forward deployment/mscustomers 9060:8080
    curl http://localhost:9060/customers

    kubectl get rs
    kubectl describe rs/<<rsID>>
    
    kubectl apply -f 02_deployment_1.yaml

    kubectl get rs
    kubectl describe rs/<<rsID>>

    kubectl get deployments
    kubectl describe deployments/<<deploymentID>>

    kubectl apply -f 02_deployment_2.yml

    ```
1. ### **Lab01-Crear**


    ```bash
    docker run -p 8080:8085 mzegarra/websimple:1.0.0
    docker run -p 8080:8085 mzegarra/websimple:2.0.0
    docker run -p 8080:8085 mzegarra/websimple:3.0.0
    docker run -p 8080:8085 mzegarra/websimple
    ``` 

    * **Crear un pod websimple:1.0.0**
        * Interactiva
        * Declarativa
    * **Crear un deployment websimple:2.0.0**
        * Interactiva
        * Declarativa