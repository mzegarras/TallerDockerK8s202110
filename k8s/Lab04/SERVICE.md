# Services

1. DNS
    ```bash

    kubectl apply -f 03_mongo.yaml


    kubectl run my-shell -i --tty --image ubuntu -- bash
    apt-get update -y
    apt-get install -y curl
    apt-get install -y iputils-ping
    apt-get install -y dnsutils
    apt-get install -y tcpdump
    apt-get install -y traceroute

    nslookup mongodb
    cat /etc/resolv.conf
    ```

1. Expose service
    ```bash
    kubectl apply -f 02_deployment_3.yaml
    kubectl expose deployments web01 --port=9060 --target-port=80 --type=LoadBalancer
    kubectl get svc -w
    kubectl delete svc/web01


    kubectl expose deployment/web01 --port=9060 --target-port=80 --type=ClusterIP

    kubectl get svc
    kubectl describe svc/[service id]

    kubectl port-forward service/web01 8080:9060

    kubectl apply -f 04_all_2_public.yaml
    kubectl apply -f 04_all_1_private.yaml