

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