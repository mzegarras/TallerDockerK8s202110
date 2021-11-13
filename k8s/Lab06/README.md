
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