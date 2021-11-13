# Ingress

## 1. Ingress

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



## 2 Tools
1. [Stress tool](https://github.com/wg/wrk) - Stress tool]
* open 100 connections using 100 threads
* run the test for 5 minutes

## 3. Referencias

1. [Ingress features] https://cloud.google.com/kubernetes-engine/docs/how-to/ingress-features
1. [Ingress health checks] https://cloud.google.com/kubernetes-engine/docs/how-to/ingress-features