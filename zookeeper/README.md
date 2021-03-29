### start standalone instance 

```shell
 docker run --name some-zookeeper -p 2181:2181 --restart always -d zookeeper
```

### start zookeeper in replicated mode

`docker-compose`file

