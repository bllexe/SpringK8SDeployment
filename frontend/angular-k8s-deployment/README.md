# AngularK8sDeployment
first need to run ng build for create dist path.
## ng build 
# Create Docker file,paste code below
FROM nginx:alpine
COPY /dist/angular-k8s-deployment /usr/share/nginx/html

# Create docker image, should be same path

docker build -t angular_k8s_deployment:1.0 . 

# deployment yaml file checking does angular work

kubectl apply -f ng-deployment.yaml

kubectl get pods
kubectl get deployment
kubectl get services
kubectl get nodes -o wide   (get internal-ip)

# checking browser does angular works
http://192.168.49.2:31000/

# delete pods,deployment and service 
kubectl delete pods --all
kubectl delete deployment --all
kubectl delete services --all
