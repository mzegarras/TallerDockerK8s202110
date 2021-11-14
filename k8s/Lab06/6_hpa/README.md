# HPA

## 1. Consultar Apis

```
kubectl api-versions
```

* autoscaling/v1
* autoscaling/v2beta1
* autoscaling/v2beta2

## 1. hpa

```
kubectl apply -f ./6_hpa/demo01.yaml
kubectl apply -f ./6_hpa/hpa01.yaml


kubectl autoscale deployment lab06apictactebus --min=2 --max=5 --cpu-percent=50


```

## 1. Scripts de carga
```


kubectl run -i --tty stress-pod --rm  --image=loadimpact/loadgentest-wrk --restart=Never -- -c 400 -t 400 -d 1m http://lab06apictacte:7071/accounts/2013

kubectl run -i --tty load-generator --rm --image=busybox --restart=Never -- /bin/sh -c "while sleep 0.01; do wget -q -O- http://lab06apictacte:7071/accounts/2013; done"


```

* -c, --connections: total number of HTTP connections to keep open with each thread handling N = connections/threads
* -d, --duration:    duration of the test, e.g. 2s, 2m, 2h
* -t, --threads:     total number of threads to use
* -s, --script:      LuaJIT script, see SCRIPTING
* -H, --header:      HTTP header to add to request, e.g. "User-Agent: wrk"
    * --latency:     print detailed latency statistics
    * --timeout:     record a timeout if a response is not received within this amount of time.


## 2 Tools

1. [Stress tool](https://github.com/wg/wrk) - Stress tool
* open 100 connections using 100 threads
* run the test for 5 minutes