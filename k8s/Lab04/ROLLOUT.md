# ROLLOUT

1. Rollback deployment
    ```bash
    # v1 --> v2 --> v3 --> v4

    # pod1:web1:0.0.1 --> pod2:web1:0.0.1 --> pod3:web1:0.0.1
    #web1:0.0.2
    # pod1:web1:0.0.2 --> pod2:web1:0.0.2 --> pod3:web1:0.0.2
    
    kubectl apply -f 02_deployment_4.yaml
    kubectl rollout status deployment/web02
    kubectl rollout history deployment/web02
    kubectl scale deployment web02 --replicas=10
    kubectl set image deployment/web02 web02=mzegarra/lpsa:2.0

    kubectl rollout history deployment/web02

    #Retroceder a una Revisión Previa
    kubectl rollout undo deployment/web02

    #Listar historia
    kubectl rollout history deployment/web02

    #Retroceder a una Revisión específica
    kubectl rollout undo deployment/web02 --to-revision=2
    ```        
