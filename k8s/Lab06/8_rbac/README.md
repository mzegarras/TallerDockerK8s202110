
1. Resources & verbs
    ```
    kubectl api-resources -o wide 

    kubectl get --raw /api/v1/namespaces/
    kubectl get --raw /api/v1/namespaces/default/pods
    kubectl get --raw /api/v1/pods
    ```

1. Crear service account
    ```
    kubectl create serviceaccount sa-app01 -n default
    ```

1. Crear service account
    ```
    kubectl apply -f 1_role.yaml
    ```

1. Obtener token de service account

    ```
    $(kubectl describe secrets "$(kubectl describe serviceaccount sa-app01 -n default| grep -i Tokens | awk '{print $2}')" -n default | grep token: | awk '{print $2}')

    TOKEN=$(kubectl describe secrets "$(kubectl describe serviceaccount sa-app01 -n default| grep -i Tokens | awk '{print $2}')" -n default | grep token: | awk '{print $2}')
    ```
    
1. Configurar cuenta
    ```
    kubectl config get-contexts
    kubectl config set-credentials sa-app01 --token=$TOKEN
    kubectl config get-contexts
    kubectl config set-context sa-app01-reader-v2 --cluster=gke_odybank_us-central1-c_cluster-1 --user=sa-app01
    kubectl config get-contexts
    kubectl config use-context  sa-app01-reader-v2
    kubectl config get-contexts
    kubectl config use-context  gke_galaxy-devops-331819_us-central1-c_cluster-1
     ```
