

```
kubectl create deployment mscustomers --image=mzegarra/msclientes:0.0.1
```

```
kubectl create deployment websimple --image=mzegarra/websimple:3.0.0 --port=8085 --replicas=2
```

```
apiVersion: apps/v1
kind: Deployment
metadata:
  name: websimple03
spec:
  selector:
    matchLabels:
      app: websimple03
  replicas: 3
  template:
    metadata:
      labels:
        app: websimple03
    spec:
      containers:
        - name: websimple03
          image: mzegarra/websimple:3.0.0
          imagePullPolicy: Always
          ports:
            - name: http-api
              containerPort: 8085
```              