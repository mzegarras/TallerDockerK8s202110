

1. readinessProbe

    - Crear secreto
    ```
    kubectl apply -f ./5_heartbeat/demo01.yaml
    kubectl port-forward service/lab06apictacte 7071:7071
    curl http://localhost:7071/accounts/2013

    kubectl set image deployment/lab06apictactebus lab06apictacte=mzegarra/lab06busctacte:0.0.1
    kubectl set image deployment/lab06apictactebus lab06apictacte=mzegarra/lab06busctacte:0.0.2
    
    kubectl apply -f ./5_heartbeat/demo02.yaml
     ```

1. livenessProbe

    - Crear secreto
    ```
    kubectl delete -f ./5_heartbeat/demo02.yaml
    kubectl apply -f ./5_heartbeat/demo03.yaml

    kubectl exec -it <<POD>> -- bash
    ps -aux 
    top
    kill 1
     ```

1. hpa

    ```
    kubectl delete -f ./6_hpa/demo01.yaml
    kubectl apply -f ./6_hpa/demo01.yaml

    https://github.com/wg/wrk

    kubectl run -i --tty stress-pod --rm  --image=loadimpact/loadgentest-wrk --restart=Never -- -c 400 -t 400 -d 1m http://lab06apictacte:7071/accounts/2013
    kubectl run -i --tty load-generator --rm --image=busybox --restart=Never -- /bin/sh -c "while sleep 0.01; do wget -q -O- http://lab06apictacte:7071/accounts/2013; done"


    kubectl autoscale deployment php-apache --cpu-percent=50 --min=1 --max=10



     ```

     * open 100 connections using 100 threads
     * run the test for 5 minutes

1. Ingress
    # https://cloud.google.com/kubernetes-engine/docs/how-to/ingress-features
    # https://cloud.google.com/kubernetes-engine/docs/concepts/ingress#health_checks
    ```
    kubectl get ingress my-ingress --output yaml

    kubectl port-forward service/lab06apictacte 37071:37071
    curl http://localhost:37071/accounts/2013

    curl http://34.107.182.41/v2/accounts/2013

    curl -H "Host: lab06apictacte.pe" http://34.107.182.41/v2/accounts/2013
    curl -H "Host: lab06apictactev2.pe" http://34.107.182.41/v2/accounts/2013
    
    sudo vi /etc/hosts
    dscacheutil -flushcache
    lookupd -flushcache
    ```    