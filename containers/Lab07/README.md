
* Docker hub login
    ```bash
 docker login docker.io
    <<user>>/<<repository name>>:<<tag>>
    ```

* Push Azure Registry
    ```bash
    docker login galaxytraining01.azurecr.io -u galaxytraining01
    <<url repository>>/<<repository name>>:<<tag>>

    docker tag website:latest galaxytraining01.azurecr.io/website:1.0.0
    docker tag website:latest galaxytraining01.azurecr.io/website:2.0.0

    docker tag modventas:2.0.0 galaxytraining01.azurecr.io/modventas:mzegarra
    docker push galaxytraining01.azurecr.io/modventas:mzegarra

    ```

* Push Google Container Registry
    ```bash

    docker tag website:latest gcr.io/csonic-labs/website:1.0.0
    docker push gcr.io/csonic-labs/website:1.0.0

    docker tag website:latest gcr.io/csonic-labs/website:2.0.0
    docker push gcr.io/csonic-labs/website:2.0.0

    gcloud auth login

    gcloud auth print-access-token
  
    docker login -u oauth2accesstoken -p "token!!" https://gcr.io

    docker push gcr.io/csonic-labs/website:1.0.0

    where [HOSTNAME] is gcr.io, us.gcr.io, eu.gcr.io, or asia.gcr.io.
    ```



* Pull images
    ```bash

    docker pull mzegarra/website:2.0.0
    docker pull docker pull gcr.io/csonic-labs/website:2.0.0
    docker pull gcr.io/csonic-labs/website:2.0.0

    ```
