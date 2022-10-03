# ActiveMQ Artemis Operator

This project is a [Kubernetes](https://kubernetes.io/) [operator](https://coreos.com/blog/introducing-operators.html)
to manage the [Apache ActiveMQ Artemis](https://activemq.apache.org/artemis/) message broker.

## Status ##

The current api version of all main CRDs managed by the operator is ***v1beta1***.

## Auto Create Topic/Queues
```bash
# Choose k8s context to deploy
kubectl config use-context harveynash-t2-dev

# Deploy
./deploy.sh
```

## :exclamation:
Using the artemis cloud operator version 1.0.4 to avoid deploy error


### TEST
