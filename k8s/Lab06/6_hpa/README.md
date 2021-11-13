# HPA

## 1. hpa

```
kubectl delete -f ./6_hpa/demo01.yaml
kubectl apply -f ./6_hpa/demo01.yaml
kubectl apply -f ./6_hpa/hpa01.yaml



kubectl run -i --tty stress-pod --rm  --image=loadimpact/loadgentest-wrk --restart=Never -- -c 400 -t 400 -d 1m http://lab06apictacte:7071/accounts/2013
kubectl run -i --tty load-generator --rm --image=busybox --restart=Never -- /bin/sh -c "while sleep 0.01; do wget -q -O- http://lab06apictacte:7071/accounts/2013; done"

kubectl autoscale deployment php-apache --cpu-percent=50 --min=1 --max=10
```

## 2 Tools
1. [Stress tool](https://github.com/wg/wrk) - Stress tool]
* open 100 connections using 100 threads
* run the test for 5 minutes