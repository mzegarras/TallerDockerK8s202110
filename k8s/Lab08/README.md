# Digital ocean

## 1. Crear cluster
1. [Ingresar] https://cloud.digitalocean.com/
1. Crear Proyecto: csonic-demo
1. Clic en create
1. Configurar cluster
1. Descargar archivos de configuración y conexion


## 2. Crear 
1. Crear customers
```bash
kubectl --kubeconfig=k8s-kubeconfig.yaml get nodes
kubectl --kubeconfig=k8s-kubeconfig.yaml get pods
kubectl apply -f 1_deployment.yaml
kubectl apply -f 2_service.yaml

```


## 2 Tools


## 3. Referencias
1. [Como crear cluster] https://docs.digitalocean.com/products/kubernetes/how-to/create-clusters/
1. [Kubernetes] https://docs.digitalocean.com/products/kubernetes/how-to/