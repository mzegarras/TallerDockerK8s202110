# Ingress

## 1. Ingress

    ```
    kubectl get ingress my-ingress --output yaml

    kubectl port-forward service/lab06apictacte 37071:37071
    curl http://localhost:37071/accounts/2013

    curl http://35.227.208.89/accounts/2013

    curl -H "Host: lab06apictacte.pe" http://35.227.208.89/accounts/2013
    curl -H "Host: lab06apictactev2.pe" http://35.227.208.89/accounts/2013
    
    sudo vi /etc/hosts
    dscacheutil -flushcache
    lookupd -flushcache
    ```    

## 2 Tools


## 3. Referencias

1. [Ingress features] https://cloud.google.com/kubernetes-engine/docs/how-to/ingress-features
1. [Ingress health checks] https://cloud.google.com/kubernetes-engine/docs/how-to/ingress-features