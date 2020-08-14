# Spring boot with visualVm

## environment
- mac os 10.15.6
- intelliJ
- java 12
- gradle
- spring boot
- visual vm

## Running
Check out this project. with intellij
### need to set vm option Before running 
VisualvmApplication -> `right click` -> Edit 'VisualvmApplication'... -> VM options

**paste it down below.**

> -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=9999 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Djava.rmi.server.hostname=127.0.0.1


![settings](https://user-images.githubusercontent.com/44669620/90213686-5c359280-de31-11ea-8d4b-3d4372007e05.png)
![settings2](https://user-images.githubusercontent.com/44669620/90213746-8be49a80-de31-11ea-9eff-2fb6799a336a.png)

### Run Application 
when application running, make sure your application is ok. --> http://localhost:8080/

![application](https://user-images.githubusercontent.com/44669620/90214928-111d7e80-de35-11ea-8b27-5d520d3a5a7b.png)



## Execute visualVM
### Download
official site : https://visualvm.github.io/

Would recommend download `zip` file
![visualvm](https://user-images.githubusercontent.com/44669620/90214597-fc8cb680-de33-11ea-9f67-cfaaa5c2b919.png)

download and unzip on `~/dev/visualvm_203/`

### Run
```shell
$ ~/dev/visualvm_203/bin/visualvm &
```

### Connection spring boot application
applications -> local -> mouse right click -> add JMX connection...

connection : localhost:9999
![visualvm](https://user-images.githubusercontent.com/44669620/90214982-3dd19600-de35-11ea-804e-9f4f1f08d5a5.png)
![visualvm](https://user-images.githubusercontent.com/44669620/90215089-92751100-de35-11ea-8e69-355070ad25c1.png)
![visualvm](https://user-images.githubusercontent.com/44669620/90215232-03b4c400-de36-11ea-9b23-cbc850c5e9d4.png)

finally you can see like this.
![visualvm](https://user-images.githubusercontent.com/44669620/90215284-27780a00-de36-11ea-87d9-320428cd9f30.png)


## Reference
java Random letters 
- http://mwultong.blogspot.com/2006/12/java-az-random-letters-alphabet.html
